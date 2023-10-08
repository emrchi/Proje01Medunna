package team01.utilities;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class Authentication {

/*
    //yazdirdigimiz tokeni gormek icin
     public static void main(String[] args) {
        System.out.println(generateToken());
     }

 */

    public static String generateToken(String password, String  username, Boolean rememberMe) {

        String body = "{\n" +
                "  \"password\": \""+password+"\",\n" +
                "  \"rememberMe\": "+rememberMe+",\n" +//true veya false yazilacak, örneginde true yaziyordu, tercih sizin
                "  \"username\": \""+username+"\"\n" +
                "}";

        Response response = given().
                body(body).
                contentType(ContentType.JSON).
                when().
                post("https://medunna.com/");

        response.prettyPrint();

        return response.jsonPath().getString("id_token");

        //consol'da gelen token'i almak icin


    }

}