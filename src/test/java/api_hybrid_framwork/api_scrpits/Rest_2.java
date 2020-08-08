package api_hybrid_framwork.api_scrpits;

import static io.restassured.RestAssured.given;

import java.io.IOException;

import api_hybrid_framwork.generic.Spec_builder_Api;
import io.restassured.response.Response;

public class Rest_2 
{
	public static void main(String[] args) throws IOException 
	{
		Response res1 = given().spec(Spec_builder_Api.Request_spec_builder()).when().
				get("/api/users/23").then().spec(Spec_builder_Api.Response_spec_builder(404,"HTTP/1.1 404 Not Found")).
				extract().response();
		System.out.println(res1.asString());
		System.out.println(res1.statusLine());
	}
}
