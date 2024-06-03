package StepDefinitions_1;

import WebPages_Actions.Homepage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class singup_Step2  {
	CommonSteps commonSteps;
	Homepage homePage;
	
	public singup_Step2(CommonSteps commonSteps, Homepage homePage) {
		
		this.commonSteps = commonSteps;
		
		this.homePage = homePage;
	}
	

	@When("Verify {string} is visible")
	public void verify_is_visible(String string) {
		homePage.newuser(string);
	}

	@Then("Enter name {string} and email address {string}")
	public void enter_name_and_email_address(String string , String string1) {
		homePage.signup_Data(string, string1);

	}

	@Then("submit Signup button")
	public void click_button(String string) {
		homePage.Sumbit_Signup();
	}

}
