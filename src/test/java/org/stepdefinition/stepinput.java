package org.stepdefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepinput {
	 static WebDriver driver;

	@Given("The user in  FB page")
	public void the_user_in_FB_page() {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\home\\Desktop\\chromedriver.exe" );
		
		driver=new ChromeDriver();	
		driver.get("https://ta-in.facebook.com/");
	}
	   

	@When("The user enter the usename and pass details")
	public void the_user_enter_the_usename_and_pass_details(io.cucumber.datatable.DataTable d) {
	   List<String>  li=d.asList();
	   driver.findElement(By.id("email")).sendKeys(li.get(0));
	   driver.findElement(By.id("pass")).sendKeys(li.get(1));
	     
	}

	@When("The user is click the login button")
	public void the_user_is_click_the_login_button() {
		driver.findElement(By.id("loginbutton")).click();
	     
	}
	@Then("The user is navigate to next page")
	public void the_user_is_navigate_to_next_page() {

System.out.println("yes");
	}




}
