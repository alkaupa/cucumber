package steps1;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;

import io.cucumber.java.en.When;

public class signupSteps {
	
	WebDriver driver;
	
	@Given("Open chrome and enter instagram url")
	public void open_chrome_and_enter_instagram_url() {
		 driver = new ChromeDriver();
			driver.get("https://www.instagram.com/accounts/emailsignup/?hl=en");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	}

	@When("user will enter mobile number, fullname,username, password")
	public void user_will_enter_mobile_number_fullname_username_password() {
		driver.findElement(By.xpath("//input[@aria-label='Mobile Number or Email']")).sendKeys("6006456909");
		driver.findElement(By.xpath("//input[@aria-label='Full Name']")).sendKeys("alka upadhyay");
		driver.findElement(By.xpath("//input[@aria-label='Username']")).sendKeys("KhuXhii_");
		driver.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys("khushi2001");
	}

	@When("click on signup button")
	public void click_on_signup_button() {
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		System.out.println("Pass all the tests");
	    
	}
	
	

}
