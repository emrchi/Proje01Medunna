package team01.stepDefinition.APIStepDefinition;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import team01.pojos.US_15_GetPatient.CountryResponse;
import team01.pojos.US_15_GetPatient.CstateResponse;
import team01.pojos.US_15_GetPatient.GetPatientResponse;
import team01.pojos.US_15_PostPatient.PostPatientPojo;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static team01.base_url.Medunna.setup;
import static team01.base_url.Medunna.spec;

public class US15_API_SD {
    static GetPatientResponse expectedData;
    static GetPatientResponse actualData;
    static PostPatientPojo expectedPost;
    static GetPatientResponse updateActualData;
    static Response response;
    static int patientId;
    static String email;
    static Faker faker=new Faker();
    @Given("Get request is prepared to add Patient")
    public void getRequestIsPreparedToAddPatient() {
        setup("Team01Admin",true,"Team01Admin");
        spec.pathParams("first", "api", "second", "patients","third",84410);
    }

    @And("Prepares Patient to be sent")
    public void preparesPatientToBeSent() {
        CountryResponse country=new CountryResponse(7756,"USA");
        CstateResponse cstate=new CstateResponse(17601,"TEXAS",country);
        expectedData=new GetPatientResponse("team01admin",
                "2023-10-21T10:27:27.563517Z",84410,
                "Rana123","Turkmen","1999-05-27T21:00:00Z",
                "548-159-5688","FEMALE","Apositive","Texas",
                "team01medunna10@gmail.com","Team01 api test",null,null,null,country,cstate);

    }

    @When("A get request is sent to add Patient")
    public void agetRequestIsSentToAddPatient() {
        response=given(spec).when().get("{first}/{second}/{third}");
    }

    @And("Verify the Patient response body")
    public void verifyThePatientResponseBody() {
        assertEquals(200,response.statusCode());
        actualData=response.as(GetPatientResponse.class);
        assertEquals(expectedData.getCreatedBy(),actualData.getCreatedBy());
        assertTrue(actualData.getCreatedDate().contains("2023-10-21"));
        assertEquals(expectedData.getFirstName(),actualData.getFirstName());
        assertEquals(expectedData.getLastName(),actualData.getLastName());
        assertEquals(expectedData.getBirthDate(),actualData.getBirthDate());
        assertEquals(expectedData.getPhone(),actualData.getPhone());
        assertEquals(expectedData.getGender(),actualData.getGender());
        assertEquals(expectedData.getBloodGroup(),actualData.getBloodGroup());
        assertEquals(expectedData.getAdress(),actualData.getAdress());
        assertEquals(expectedData.getEmail(),actualData.getEmail());
        assertEquals(expectedData.getDescription(),actualData.getDescription());
        assertEquals(expectedData.getCountry().getName(),actualData.getCountry().getName());
        assertEquals(expectedData.getCstate().getName(),actualData.getCstate().getName());
    }

    @Given("Put request is prepared to add Patient")
    public void putRequestIsPreparedToAddPatient() {
        setup("Team01Admin",true,"Team01Admin");
        spec.pathParams("first", "api", "second", "patients");
    }

    @And("Prepares updating Patient to be sent")
    public void preparesUpdatingPatientToBeSent() {
        CountryResponse country=new CountryResponse(7756,"USA");
        CstateResponse cstate=new CstateResponse(17601,"TEXAS",country);
        expectedData=new GetPatientResponse("team01admin",
                "2023-10-21T10:27:27.563517Z", 84410,
                "Rana123", "Turkmen",
                "1999-05-27T21:00:00Z",
                "548-159-5688",
                "FEMALE",
                "Apositive",
                "Texas",
                "team01medunna10@gmail.com",
                "Team01 api test",
                null,
                null,
                null,
                country,
                cstate);

    }

    @When("A put request is sent to add Patient")
    public void aPutRequestIsSentToAddPatient() {
        response=given(spec).body(expectedData).when().put("{first}/{second}");
        response.prettyPrint();
    }

    @And("Verify the updating Patient response body")
    public void verifyTheUpdatingPatientResponseBody() {
        updateActualData=response.as(GetPatientResponse.class);
        assertEquals(200,response.statusCode());
    }

    @Given("Delete request is prepared to add with {string}")
    public void deleteRequestIsPreparedToAddWith(String id) {
        setup("Team01Admin",true,"Team01Admin");
        spec.pathParams("first","api","second","patients","third",id);
    }

    @When("A delete request is sent to add Patient")
    public void aDeleteRequestIsSentToAddPatient() {
        response=given(spec).when().delete("{first}/{second}/{third}");
        response.prettyPrint();
    }

    @Given("Post request is prepared to add Patient")
    public void postRequestIsPreparedToAddPatient() {
        setup("Team01Admin",true,"Team01Admin");
        spec.pathParams("first", "api", "second", "patients");
    }

    @When("A post request is sent to add Patient")
    public void aPostRequestIsSentToAddPatient() {
        response=given(spec).body(expectedPost).when().post("{first}/{second}");
        response.prettyPrint();
    }

    @And("Prepares post Patient to be sent")
    public void preparesPostPatientToBeSent() {
        CountryResponse country=new CountryResponse(7756,"USA");
        CstateResponse cstate=new CstateResponse(17601,"TEXAS",country);
        email=faker.internet().emailAddress();
        expectedPost=new PostPatientPojo("team01admin",
                "2023-10-21T07:45:18.827106Z",
                "Rana","Turkmen",
                "1999-05-27T21:00:00Z",
                "548-159-5688",
                "FEMALE",
                "Apositive",
                "Texas",
                email,
                "Team01 api test",
                null,
                null,
                null,
                country,
                cstate);
    }

    @And("Verify the Patient post response body")
    public void verifyThePatientPostResponseBody() {
        assertEquals(201,response.statusCode());
        actualData=response.as(GetPatientResponse.class);
        patientId=actualData.getId();
        assertEquals(expectedPost.getCreatedBy(),actualData.getCreatedBy());
        assertTrue(actualData.getCreatedDate().contains("2023-10-21T"));
        assertEquals(expectedPost.getFirstName(),actualData.getFirstName());
        assertEquals(expectedPost.getLastName(),actualData.getLastName());
        assertEquals(expectedPost.getBirthDate(),actualData.getBirthDate());
        assertEquals(expectedPost.getPhone(),actualData.getPhone());
        assertEquals(expectedPost.getGender(),actualData.getGender());
        assertEquals(expectedPost.getBloodGroup(),actualData.getBloodGroup());
        assertEquals(expectedPost.getAdress(),actualData.getAdress());
        assertEquals(expectedPost.getEmail(),actualData.getEmail());
        assertEquals(expectedPost.getDescription(),actualData.getDescription());
        assertEquals(expectedPost.getCountry().getName(),actualData.getCountry().getName());
        assertEquals(expectedPost.getCstate().getName(),actualData.getCstate().getName());
    }

    @Then("Verify the status code {int} delete")
    public void verifyTheStatusCodeDelete(int statusCode) {
        assertEquals(statusCode,response.statusCode());
    }
}
