package stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login {
	@Given("^user should be in login page$")
	public void user_should_be_in_login_page() throws Throwable {
		System.out.println("login page");
	}

	@When("^user enter valid credentails and submit$")
	public void user_enter_valid_credentails_and_submit() throws Throwable {
		System.out.println("valid credentails");
	}

	@Then("^user should navigate to welcome page of app$")
	public void user_should_navigate_to_welcome_page_of_app() throws Throwable {
		System.out.println("welcome page of app");
	}

	@Given("^user should be in login page of app$")
	public void user_should_be_in_login_page_of_app() throws Throwable {
		System.out.println("login page of app ");
	}

	@When("^user should enter creds \"([^\"]*)\" and \"([^\"]*)\" to submit$")
	public void user_should_enter_creds_and_to_submit(String usr, String pswd) throws Throwable {
		System.out.println("userid :" + usr);
		System.out.println("password :" + pswd);
	}

	@Then("^user should navigate to welcome page$")
	public void user_should_navigate_to_welcome_page() throws Throwable {
	System.out.println("welcome page of app");
	}
}
