import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class JobPoolSearch {
    @Test
    void  Test(){
       RestAssured.given().post("https://apistage.nozzlesoft.com/api/Account/Login");

    }

}
