package team01.stepDefinition.APIStepDefinition;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import team01.pojos.US_15_GetPatient.GetPatientResponse;
import team01.pojos.US_16_PostRoom.PostRoomPojo;
import team01.pojos.US_16_PostRoom.PostRoomResponse;
import team01.pojos.US_16_PutRoom.PutRoomPojo;

import java.util.Random;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.ntlm;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static team01.base_url.Medunna.setup;
import static team01.base_url.Medunna.spec;

public class US16_API_SD {
   static PostRoomPojo expectedData;
   static PostRoomResponse actualData;
   static PostRoomResponse expectedPut;
   static Response response;
   static int roomId;
   static Random random=new Random();
    @Given("Post request is prepared to add Room")
    public void postRequestIsPreparedToAddRoom() {
        setup("Team01Admin",true,"Team01Admin");
        spec.pathParams("first", "api", "second", "rooms");
    }

    @And("Prepares Room to be sent")
    public void preparesRoomToBeSent() {
        int randomNumber = random.nextInt(999999999)+999;
       expectedData=new PostRoomPojo("team01admin","2023-10-21T13:08:15.592Z", "api test rana",999, randomNumber, "TWIN", true);

    }


    @When("A post request is sent to add Room")
    public void aPostRequestIsSentToAddRoom() {
        response=given(spec).body(expectedData).when().post("{first}/{second}");
    }

    @And("Verify the Room response body")
    public void verifyTheRoomResponseBody() {
        assertEquals(201,response.statusCode());
        actualData=response.as(PostRoomResponse.class);
        roomId=actualData.getId();
        assertEquals(expectedData.getCreatedBy(),actualData.getCreatedBy());
        assertEquals(expectedData.getDescription(),actualData.getDescription());
        assertTrue(actualData.getCreatedDate().contains("2023-10-21"));
        assertEquals(expectedData.getPrice(),actualData.getPrice());
        assertEquals(expectedData.getRoomNumber(),actualData.getRoomNumber());
        assertEquals(expectedData.getRoomType(),actualData.getRoomType());
        assertEquals(expectedData.isStatus(),actualData.isStatus());
    }

    @Given("Put request is prepared to add Room")
    public void putRequestIsPreparedToAddRoom() {
        setup("Team01Admin",true,"Team01Admin");
        spec.pathParams("first", "api", "second", "rooms");
    }

    @And("Prepares updating Room to be sent")
    public void preparesUpdatingRoomToBeSent() {
        int randomNumber = random.nextInt(999999999)+999;
        expectedPut=new PostRoomResponse("team01admin","2023-10-21T13:08:15.592Z",roomId, randomNumber , "TWIN", true,999,"api test rana");
    }

    @When("A put request is sent to add Room")
    public void aPutRequestIsSentToAddRoom() {
        response=given(spec).body(expectedPut).when().put("{first}/{second}");
    }

    @And("Verify the updating Room response body")
    public void verifyTheUpdatingRoomResponseBody() {
        assertEquals(200,response.statusCode());
        actualData=response.as(PostRoomResponse.class);
        assertEquals(expectedPut.getCreatedBy(),actualData.getCreatedBy());
        assertEquals(expectedPut.getDescription(),actualData.getDescription());
        assertTrue(expectedPut.getCreatedDate().contains("2023-10-21"));
        assertEquals(expectedPut.getPrice(),actualData.getPrice());
        assertEquals(expectedPut.getRoomNumber(),actualData.getRoomNumber());
        assertEquals(expectedPut.getRoomType(),actualData.getRoomType());
        assertEquals(expectedPut.isStatus(),actualData.isStatus());
    }

    @Given("Delete request is prepared to add Room")
    public void deleteRequestIsPreparedToAddRoom() {
        setup("Team01Admin",true,"Team01Admin");
        spec.pathParams("first","api","second","rooms","third",roomId);
    }

    @When("A delete request is sent to add Room")
    public void aDeleteRequestIsSentToAddRoom() {
        response=given(spec).when().delete("{first}/{second}/{third}");
    }

    @Then("Verify the status code {int} room")
    public void verifyTheStatusCodeRoom(int statusCode) {
        assertEquals(statusCode,response.statusCode());
    }
}
