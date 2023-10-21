package team01.stepDefinition.APIStepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import team01.pojos.US_17_CreateTestItems.TestItemResponsePOJO;
import team01.pojos.US_17_CreateTestItems.TestItemUpdateResponsePOJO;
import team01.pojos.US_17_CreateTestItems.TestItemsRequestPOJO;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static team01.base_url.Medunna.setup;
import static team01.base_url.Medunna.spec;

public class US17_API_SD {
    TestItemsRequestPOJO expectedData;
    Response response;
    TestItemResponsePOJO actualData;
    static int testItemId;
    TestItemsRequestPOJO updateData;
    static String createdDate;
    TestItemUpdateResponsePOJO updateActualData;

    @Given("Post request is prepared to add Test Items")
    public void postRequestIsPreparedToAddTestItems() {
        setup("Team01Admin",true,"Team01Admin");
        spec.pathParams("first", "api", "second", "c-test-items");
    }

    @And("Prepares test items to be sent")
    public void preparesTestItemsToBeSent() {
        expectedData = new TestItemsRequestPOJO(125, "", "", "17.0 g/dL", "13.0 g/dL", "Routine",null, "Blood Test");
    }

    @When("A post request is sent to add test items")
    public void aPostRequestIsSentToAddTestItems() {
        response=given(spec).body(expectedData).when().post("{first}/{second}");
        response.prettyPrint();
    }

    @Then("Verify the status code {int}")
    public void verifyTheStatusCode(int statusCode) {
        assertEquals(statusCode,response.statusCode());
    }

    @And("Verify the test items response body")
    public void verifyTheTestItemsResponseBody() {
        actualData=response.as(TestItemResponsePOJO.class);
        assertEquals(expectedData.getName(),actualData.getName());
        assertEquals(expectedData.getDescription(),actualData.getDescription());
        assertEquals(expectedData.getPrice(),actualData.getPrice());
        assertEquals(expectedData.getDefaultValMin(),actualData.getDefaultValMin());
        assertEquals(expectedData.getDefaultValMax(),actualData.getDefaultValMax());
        testItemId=actualData.getId();
        createdDate=actualData.getCreatedDate();
    }

    @Given("Put request is prepared to add Test Items")
    public void putRequestIsPreparedToAddTestItems() {
/*
        spec.pathParams("first","api","second","c-test-items","third","all");
        response=given(spec).when().get("{first}/{second}/{third}");
        List<Integer> id=response.jsonPath().getList("findAll{it.name=='Blood Test'}.id");
        testItemId=id.get(0);
        System.out.println(testItemId);
*/        //
        spec.pathParams("first", "api", "second", "c-test-items");



    }

    @And("Prepares updating test items to be sent")
    public void preparesUpdatingTestItemsToBeSent() {

        updateData=new TestItemsRequestPOJO(150,"team01Admin",createdDate,"17.1 g/dL","13.2 g/dL","Control",testItemId,"Blood Test");
    }

    @When("A put request is sent to add test items")
    public void aPutRequestIsSentToAddTestItems() {
        response=given(spec).body(updateData).when().put("{first}/{second}");
        response.prettyPrint();
    }

    @And("Verify the updating test items response body")
    public void verifyTheUpdatingTestItemsResponseBody() {
        updateActualData=response.as(TestItemUpdateResponsePOJO.class);
        assertEquals(updateData.getName(),updateActualData.getName());
        assertEquals(updateData.getDescription(),updateActualData.getDescription());
        assertEquals(updateData.getPrice(),updateActualData.getPrice());
        assertEquals(updateData.getDefaultValMin(),updateActualData.getDefaultValMin());
        assertEquals(updateData.getDefaultValMax(),updateActualData.getDefaultValMax());

    }

    @Given("Delete request is prepared to add Test Items")
    public void deleteRequestIsPreparedToAddTestItems() {
        spec.pathParams("first","api","second","c-test-items","third",testItemId);
    }

    @When("A delete request is sent to add test items")
    public void aDeleteRequestIsSentToAddTestItems() {
        response=given(spec).when().delete("{first}/{second}/{third}");
        response.prettyPrint();
    }
}
