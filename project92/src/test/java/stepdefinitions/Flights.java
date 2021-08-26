package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Flights {
	public static WebDriver driver;

	@Given("^user should be in search flights page$")
	public void user_should_be_in_search_flights_page() throws Throwable {
	   WebDriverManager.chromedriver().setup();
	   driver= new ChromeDriver();
	   driver.get("https://github.com/bonigarcia/webdrivermanager");
	}

	@When("^user enter valid fields and submit$")
	public void user_enter_valid_fields_and_submit() throws Throwable {
		//driver.findElement(By.xpath("")).sendKeys("");
		
	}

	@Then("^user should navigate to list of flights page$")
	public void user_should_navigate_to_list_of_flights_page() throws Throwable {
		
	}

}
