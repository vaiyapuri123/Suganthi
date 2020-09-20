package org.stepdefinition;



import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class steptable {
	
	@Before
	public void before() {
		
		System.out.println("before execution");
	}
	@After
	public void after() {
		
		System.out.println("after execution");
	}
	@Given("User is in fb page")
	public void user_is_in_fb_page() {
	 System.out.println("home page");   
	}

	@When("User to sent usernam and pass")
	public void user_to_sent_usernam_and_pass(io.cucumber.datatable.DataTable dataTable) {
	   System.out.println("enter username and pass");
	}

	@Then("User click loginbt")
	public void user_click_loginbt() {
	    System.out.println("login");
	}
	@Given("User is in fb pagesss")
	public void user_is_in_fb_pagesss() {
	    System.out.println("method11");
	}

	@When("User to sent usernamss and passgg")
	public void user_to_sent_usernamss_and_passgg(io.cucumber.datatable.DataTable dataTable) {
		System.out.println("method12");
	}

	@Then("User click loginbtgf")
	public void user_click_loginbtgf() {
		System.out.println("method13");
	    
	}






}
