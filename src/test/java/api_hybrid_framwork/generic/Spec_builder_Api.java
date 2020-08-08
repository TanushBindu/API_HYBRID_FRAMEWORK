package api_hybrid_framwork.generic;
import java.io.IOException;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
public class Spec_builder_Api 
{
	public static RequestSpecification Request_spec_builder() throws IOException
	{
		RequestSpecBuilder req_bui = new RequestSpecBuilder();
		RequestSpecification req = req_bui.setBaseUri(Fetech_properties.getProperties_value()).
				setContentType(ContentType.JSON).build();
		return req;
	}
	
	public static ResponseSpecification Response_spec_builder(int status_code,String status_line) 
	{
		ResponseSpecBuilder res_bui = new ResponseSpecBuilder();
		ResponseSpecification res = res_bui.expectContentType(ContentType.JSON).
				expectStatusCode(status_code).expectStatusLine(status_line)
				.build();
		return res;
	}
}
