package parallel;

import org.junit.Assert;

import com.pages.GooglePage;
import com.pages.LoginPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GooglePageSteps {
	
	private static String title;
	
	private GooglePage googlePage = new GooglePage(DriverFactory.getDriver());
	@Given("user is on google page")
	public void user_is_on_google_page() {
		DriverFactory.getDriver().get("https://www.google.com/");
	}
	
	@When("user gets the title of the google page")
	public void user_gets_the_title_of_the_google_page() {
		title = googlePage.getLoginPageTitle();
	    System.out.println("Page title :: " + title);
	}
	@Then("page title should verify {string}")
	public void page_title_should_verify(String string) {
		Assert.assertTrue(title.contains(string)); 
	}




	
}
