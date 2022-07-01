import io.restassured.RestAssured;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class JobPoolSearch {
    @Test
    void  Test(){
       given().post("https://apistage.nozzlesoft.com/api/Account/Login").then().statusCode(200);
    }

}
