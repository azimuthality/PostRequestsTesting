import io.restassured.http.ContentType;
import model.UserRequestModel;

import static io.restassured.RestAssured.given;


public class APIuser {

    public Root createUser(Root root){
    return
        given()
                .baseUri("https://reqres.in/")
                .contentType(ContentType.JSON)
                .body(root)
                .post("api/users")
                .then()
                .statusCode(201)
                .extract().response().as(Root.class);
    }
}
