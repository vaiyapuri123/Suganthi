package org.stepdefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Stepdefinition {
	WebDriver driver;	

@Given("The user in the FB page")
public void the_user_in_the_FB_page() {
	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
	 driver=new ChromeDriver();
	String s="https://www.facebook.com/";
			driver.get(s);
  String fburl=driver.getCurrentUrl();
  Assert.assertEquals("verify the current url", s,fburl);
}
    

@When("The user enter the userName and passWord details")
public void the_user_enter_the_userName_and_passWord_details(io.cucumber.datatable.DataTable data) {
 List<List<String>> li=data.asLists();
 List<String> m=li.get(0);
 
  
  String s1=m.get(0);
  WebElement txtusr=driver.findElement(By.id("email"));
	txtusr.sendKeys(s1);
	
	String us=txtusr.getAttribute("value");
	Assert.assertTrue("verify the txtusr name", us.equals(s1));
  
  
  String s2=li.get(0).get(1);
  WebElement txtpass=driver.findElement(By.id("pass"));
	txtpass.sendKeys(s2);
	
	String pas=txtpass.getAttribute("value");
	Assert.assertEquals("verify the pass name", s2,pas);
  
  
  
}

@When("The user click the login button")
public void the_user_click_the_login_button() {
	WebElement loginbtn=driver.findElement(By.id("loginbutton"));
	loginbtn.click();
   
   
}

@Then("The user navigate to next page")
public void the_user_navigate_to_next_page() {
    // Write code here that turns the phrase above into concrete actions
    throw new cucumber.api.PendingException();
}

	/*WebDriver driver;
	@Given("The user in the FB page")
	public void the_user_in_the_FB_page() {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		 driver=new ChromeDriver();
		String s="https://www.facebook.com/";
				driver.get(s);
       String fburl=driver.getCurrentUrl();
       Assert.assertEquals("verify the current url", s,fburl);
		
	}
	    

	@When("The user enter the {string} and {string}")
	public void the_user_enter_the_and(String  s1 , String s2) {
		WebElement txtusr=driver.findElement(By.id("email"));
		txtusr.sendKeys(s1);
		
		String us=txtusr.getAttribute("value");
		Assert.assertTrue("verify the txtusr name", us.equals(s1));
		
		WebElement txtpass=driver.findElement(By.id("pass"));
		txtpass.sendKeys(s2);
		
		String pas=txtpass.getAttribute("value");
		Assert.assertEquals("verify the pass name", s2,pas);

	    
	}

	@When("The user click the login button")
	public void the_user_click_the_login_button() {
		WebElement loginbtn=driver.findElement(By.id("loginbutton"));
		loginbtn.click();
	   
	}

	//@Then("The user navigate to next page")
	//public void the_user_navigate_to_next_page() {
	    
	//}
	/*WebDriver driver;
	@Given("The user in the FB page")
	public void the_user_in_the_FB_page() {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		 driver=new ChromeDriver();
		String s="https://www.facebook.com/";
				driver.get(s);
        String fburl=driver.getCurrentUrl();
        Assert.assertEquals("verify the current url", s,fburl);
        System.out.println("the url is"+fburl);
	}
	    

	/*@When("the user enter the user name and password")
	public void the_user_enter_the_user_name_and_password() {
		WebElement txtusr=driver.findElement(By.id("email"));
		txtusr.sendKeys("vaiyapuri@gmail.com");
		String us=txtusr.getAttribute("value");
		Assert.assertEquals("verify the txtusr name", us.equals("vaiyapuri@gmail.com"));
		
		WebElement txtpass=driver.findElement(By.id("pass"));
		txtpass.sendKeys("7708993200");
		String ps=txtpass.getAttribute("value");
		Assert.assertEquals("verify the pass name", ps.equals("7708993200"));
		
		
	}
	  

	@Then("The user click the login button and navigate to next page")
public void the_user_click_the_login_button_and_navigate_to_next_page() {
		
	WebElement loginbtn=driver.findElement(By.id("loginbutton"));
	loginbtn.click();
//	String lb=driver.getCurrentUrl();
	//	Assert.assertEquals("verify the url", lb.contains("login attemt"));
	//	System.out.println("invalid user delails");
		
		
	}*/
}


