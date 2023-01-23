package users;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import com.github.javafaker.Faker;

import entities.User;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;


@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class UsersTests {
	
	private static User users;// criação de classe em entidades
	public static Faker faker;
	public static RequestSpecification request;
	
	@BeforeAll
	public void setup() {
		RestAssured.baseURI = "https://petstore.swagger.io/v2";
		faker = new Faker();
		
		users = new User(faker.name().username(),
				faker.name().lastName(),
				faker.name().firstName(),
				faker.internet().safeEmailAddress(),
				faker.internet().password(8, 10),
				faker.phoneNumber().toString());
    }
	
	@BeforeEach
	void setRequest() {
		 request = request.given()
				 .header("api-key", "special-key")
				 //.header("context-type","aplication/json");
				 .contentType(ContentType.JSON);
	}
	@Test
    public void CreateNewUser_WithValidData_ReturnOk() {
    	
    }
}