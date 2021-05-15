package parallel;

import org.junit.Assert;

import com.pages.GooglePage;
import com.pages.LoginPage;
import com.pages.YouTubePage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class YouTubePageSteps {
	
	private static String title;
	
	private YouTubePage youtubePage = new YouTubePage(DriverFactory.getDriver());
	
	@Given("user is on youtube application")
	public void user_is_on_youtube_application() {
		DriverFactory.getDriver().get("https://www.youtube.com/");
	}
	
	@When("user gets the title of the youtube application")
	public void user_gets_the_title_of_the_youtube_application() {
		title = youtubePage.getLoginPageTitle();
	    System.out.println("Page title :: " + title);
	}
	
	@Then("page title of youtube should verify {string}")
	public void page_title_of_youtube_should_verify(String string) {
		Assert.assertTrue(title.contains(string)); 
	}
	

}
