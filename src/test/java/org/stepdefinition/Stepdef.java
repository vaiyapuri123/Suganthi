package org.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdef {
	  static WebDriver driver;
	@Given("User has to be there in the login page")
	public void user_has_to_be_there_in_the_login_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\home\\Desktop\\chromedriver.exe" );
		
		driver=new ChromeDriver();	
		driver.get("https://ta-in.facebook.com/");
	}
	@When("User has to fill user name and password")
	public void user_has_to_fill_user_name_and_password() {

	}

	@When("User has to click login button")
	public void user_has_to_click_login_button() {
		driver.findElement(By.id("loginbutton")).click();
	    
	}

	@Then("User has to navigate home page")
	public void user_has_to_navigate_home_page() {
		System.out.println("done");
	    
}
}