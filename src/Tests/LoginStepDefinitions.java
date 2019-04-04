package Tests;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinitions {
	
	@Given("^A user is on demoqa\\.com$")
	public void a_user_is_on_demoqa_com() throws Throwable {
		System.out.println("User is on demoqa.com");
	}

	@When("^User clicks on MyAccount link$")
	public void user_clicks_on_MyAccount_link() throws Throwable {
		System.out.println("User clicked on my account link");
	}

	@Then("^User is taken to Login page$")
	public void user_is_taken_to_Login_page() throws Throwable {
		System.out.println("User is taken to login page");
	}

	@When("^User enters a valid UserName and Password$")
	public void user_enters_a_valid_UserName_and_Password() throws Throwable {
		System.out.println("User enters valid username and password");
	}

	@Then("^User is able to login successfully$")
	public void user_is_able_to_login_successfully() throws Throwable {
		System.out.println("User is able to successfully login");
	}


}
