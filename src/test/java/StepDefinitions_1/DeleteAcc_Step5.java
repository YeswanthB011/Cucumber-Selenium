package StepDefinitions_1;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DeleteAcc_Step5 {
	 	@When("Verify that {string} is  visible or not")
	    public void verify_logged_in_message(String string) {
	        // Implement code to verify that the 'Logged in as username' message is visible
	        // (e.g., use assertions or other verification methods)
	    }

	    @Then("Click {string} button if visible")
	    public void click_delete_account_button(String string) {
	        // Implement code to click the 'Delete Account' button
	        // (e.g., locate the button element and perform a click action)
	    }
		@And("Verify that {string} is visible and click {string} button")
		public void verify_that_is_visible_and_click_button(String string, String string2) {

		     
		}

}
