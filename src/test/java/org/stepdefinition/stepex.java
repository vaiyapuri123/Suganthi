package org.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepex {
	
	static WebDriver driver; 
	@Given("User in fb page")
	public void user_in_fb_page() {
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\home\\Desktop\\chromedriver.exe" );
		
		driver=new ChromeDriver();	
		driver.get("https://ta-in.facebook.com/");
	   
	}

	@When("User to send {string} and {string}")
	public void user_to_send_and(String s, String s1) {
		driver.findElement(By.id("email")).sendKeys(s);
		driver.findElement(By.id("pass")).sendKeys(s1);
	   
	}
	

	@Then("User click login buttn")
	public void user_click_login_buttn() {
		driver.findElement(By.id("loginbutton")).click(); 
	}

	

	


}
