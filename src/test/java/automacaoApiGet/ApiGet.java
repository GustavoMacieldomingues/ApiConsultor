package automacaoApiGet;
import static io.restassured.RestAssured.given;
import org.junit.Test;

import org.junit.runner.Request;

import  io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;

public class ApiGet {

private Response response;
private Request requets;


@Test
public void consultorPetAvaible() {
	String get ="https://petstore.swagger.io/v2/pet/355";
  response = RestAssured.request(Method.GET,get);
  System.out.println(response.asString());
  System.out.println(response.statusCode());
}
//@Test
public void adicionarPet() {
	given().log().all().contentType("application/json").body("\"id\": 354,\r\n"
			+ "  \"category\": {\r\n"
			+ "    \"id\": 0,\r\n"
			+ "    \"name\": \"gustavo maciel\"\r\n"
			+ "  },\r\n"
			+ "  \"name\": \"doggie\",\r\n"
			+ "  \"photoUrls\": [\r\n"
			+ "    \"string\"\r\n"
			+ "  ],\r\n"
			+ "  \"tags\": [\r\n"
			+ "    {\r\n"
			+ "      \"id\": 0,\r\n"
			+ "      \"name\": \"string\"\r\n"
			+ "    }\r\n"
			+ "  ],\r\n"
			+ "  \"status\": \"available\""
	).when().post("https://petstore.swagger.io/v2/pet").then().log().all();
}
//@Test
public void editarPet() {
	given().log().all().contentType("application/json").body("\"id\": 355,\r\n"
			+ "  \"category\": {\r\n"
			+ "    \"id\": 0,\r\n"
			+ "    \"name\": \"gustavo maciel\"\r\n"
			+ "  },\r\n"
			+ "  \"name\": \"doggie\",\r\n"
			+ "  \"photoUrls\": [\r\n"
			+ "    \"string\"\r\n"
			+ "  ],\r\n"
			+ "  \"tags\": [\r\n"
			+ "    {\r\n"
			+ "      \"id\": 0,\r\n"
			+ "      \"name\": \"string\"\r\n"
			+ "    }\r\n"
			+ "  ],\r\n"
			+ "  \"status\": \"available\"")
	.when().put("https://petstore.swagger.io/v2/pet").then().log().all();
}
//@Test
public void deletar() {
	given().log().all().contentType("applcation/json").header("petId","198").delete("https://petstore.swagger.io/v2/pet/198").then().log().all();
}


}
