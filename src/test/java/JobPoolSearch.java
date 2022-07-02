import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

public class JobPoolSearch {

    public static void main(String[] args){

        RestAssured.baseURI= "https://apistage.nozzlesoft.com/";
        given().log().all().header("X-Authorization","775520f1-f9d7-49d3-8031-4bb6454955eb")
                .header("Content-Type","application/json")
                .body("{\"jobTypeIdList\":[],\"jobCategoryIdList\":[],\"departmentIdList\":[],\"priorityTypeIdList\":[],\"statusIdList\":[],\"structureID\":\"\",\"triggerTypeEnumList\":[],\"searchText\":\"\",\"crewWorkPositionIdList\":[],\"isOfficeApproval\":null,\"assignedJobEnums\":[],\"todoListTypeEnums\":[],\"isActive\":null,\"page\":0,\"pageSize\":100}")
                .when().post("api/PmsModule/JobPool/Search")
                .then().log().all().assertThat().statusCode(200);

    }
}
