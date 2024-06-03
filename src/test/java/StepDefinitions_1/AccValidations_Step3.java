package StepDefinitions_1;

import WebPages_Actions.Homepage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AccValidations_Step3 {

	CommonSteps commonSteps;
	Homepage homePage;

	public AccValidations_Step3(CommonSteps commonSteps, Homepage homePage) {
		this.commonSteps = commonSteps;
		this.homePage = homePage;
	}

	@Given("redirected to acc created page")
	public void redirected_to_acc_created_page() {

	}

	@When("Verify that {string} is visible or not")
	public void verify_account_created_message(String string) {
		// Implement code to verify that the 'ACCOUNT CREATED!' message is visible
		// (e.g., use assertions or other verification methods)
	}

	@Then("Click {string} button")
	public void click_continue_button(String string) {
		// Implement code to click the 'Continue' button
		// (e.g., locate the button element and perform a click action)
	}

}
