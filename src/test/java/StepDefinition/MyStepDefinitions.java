package StepDefinition;

import org.junit.runner.RunWith;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.specification.RequestSpecification;
import static io.restassured.RestAssured.*;


@RunWith(Cucumber.class)
public class MyStepDefinitions {

	RequestSpecification request;
	String response;
    @Given("^the add place api details$")
    public void the_add_place_api_details() throws Throwable {
    		RestAssured.baseURI="https://rahulshettyacademy.com";
    		//request=
    				given().log().all().header("Content-Type","application/json")
    		.queryParam("key","qaclick123")
    		.body("{\r\n" + 
    				"  \"location\": {\r\n" + 
    				"    \"lat\": -38.383494,\r\n" + 
    				"    \"lng\": 33.427362\r\n" + 
    				"  },\r\n" + 
    				"  \"accuracy\": 50,\r\n" + 
    				"  \"name\": \"Frontline house\",\r\n" + 
    				"  \"phone_number\": \"(+91) 983 893 3937\",\r\n" + 
    				"  \"address\": \"29, side layout, cohen 09\",\r\n" + 
    				"  \"types\": [\r\n" + 
    				"    \"shoe park\",\r\n" + 
    				"    \"shop\"\r\n" + 
    				"  ],\r\n" + 
    				"  \"website\": \"http://google.com\",\r\n" + 
    				"  \"language\": \"French-IN\"\r\n" + 
    				"}\r\n" + 
    				"pi call$")
    		.when().post("/maps/api/place/add/json")
    		.then().log().all().assertThat().statusCode(200);
    }
    @When("user hits the add place api call")
    public void user_hits_the_add_place_api_call() throws Throwable {
     /*   response=request.when().post("/maps/api/place/add/json")
        .then().log().all().extract().response().asString();*/
    }

    @Then("^place should get added successfully$")
    public void place_should_get_added_successfully() throws Throwable {
   /*     JsonPath js=new JsonPath(response);
      
        js.getString("status");
        js.get("place_id");*/
    }

    @And("^status code should be \"([^\"]*)\"$")
    public void status_code_should_be_something(String strArg1) throws Throwable {
       /* int actualStatusCode=response.getStatusCode();
        int expectedStatusCode=Integer.parseInt(strArg1);
        if(actualStatusCode==expectedStatusCode)
        {
        	System.out.println("Test case is passed");
        }
        else
        {
        	System.out.println("Test case is failed");
        }*/
    }

}