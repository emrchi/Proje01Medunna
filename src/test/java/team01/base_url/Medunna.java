package team01.base_url;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import static team01.utilities.Authentication.generateToken;

public class Medunna {
    public static RequestSpecification spec;
    public static void setup(String password, Boolean rememberMe,String username ) {
        spec = new RequestSpecBuilder()
                .setBaseUri("https://medunna.com/")
                .addHeader("Authorization", "Bearer " + generateToken(password,rememberMe,username))
                .setContentType(ContentType.JSON)
                .build();
    }

}
