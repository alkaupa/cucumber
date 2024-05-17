package steps;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class searchSteps {
	 WebDriver driver;
	
	@Given("open chrome  and enter ebay url")
	public void open_chrome_and_enter_ebay_url() {
		 driver = new ChromeDriver();
			driver.get("https://www.ebay.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	}

	@When("user selects arts from the search dropdown")
	public void user_selects_arts_from_the_search_dropdown() {
		WebElement dropdown = driver.findElement(By.id("gh-cat"));
		
		Select s = new Select(dropdown);
		s.selectByVisibleText("Art");
	}

	@When("clicks on search")
	public void clicks_on_search() {
		
		driver.findElement(By.id("gh-btn")).click();

	}

	@Then("validate the arts text")
	public void validate_the_arts_text() {
		String arttext = driver.findElement(By.cssSelector(".title-banner__title")).getText();
		
		
		Assert.assertEquals(arttext, "Art");
		
		
		System.out.println("Test case passed - validation completed");
	}


	

}
