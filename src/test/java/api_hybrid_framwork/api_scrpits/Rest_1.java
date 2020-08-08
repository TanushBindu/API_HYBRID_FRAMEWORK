package api_hybrid_framwork.api_scrpits;
import static io.restassured.RestAssured.given;

import java.io.IOException;

import org.junit.Test;

import api_hybrid_framwork.generic.Spec_builder_Api;
import io.restassured.response.Response;
public class Rest_1 
{
	@Test
	public void rest_1() throws IOException
	{
		Response res1 = given().spec(Spec_builder_Api.Request_spec_builder()).when().
				get("/api/users/2").then().spec(Spec_builder_Api.Response_spec_builder(200,"HTTP/1.1 200 OK")).
				extract().response();
		System.out.println(res1.asString());
	}
}