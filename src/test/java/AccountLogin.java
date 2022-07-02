import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class AccountLogin {

    public static void main(String[] args){

        RestAssured.baseURI= "https://apistage.nozzlesoft.com/";
        given().log().all().header("X-Authorization","nozzle")
                .header("Content-Type","application/json")
                .body("{\n" +
                        "  \"username\": \"support@nozzlesoft.com\",\n" +
                        "  \"password\": \"support2022\",\n" +
                        "  \"twoFactorVerificationCode\": \"\"\n" +
                        "}")
                .when().post("api/Account/Login")
                .then().log().all().assertThat().statusCode(200).
                //header("server","Microsoft-IIS/10.0");
    }
}
