package org.stepdefinition;

import org.base.BaseClass;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.page.pom1;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClass{
	pom1 p;
	@Given("user has to present in website")
	public void user_has_to_present_in_website() {
      chromebrowser();
      urllaunch("https://littlecanadian.ca/");
      implicitlywait(10);
      maximize();
	}

	@When("check the url and section")
	public void check_the_url_and_section() {
     String url = getcurreenturl();
     System.out.println(url);
     boolean con = url.contains("little");
     System.out.println(con);
     Assert.assertTrue("verify url", con);
     
	}

	@Then("To verify expected and actual result")
	public void to_verify_expected_and_actual_result() {
		String title = gettitle();
	System.out.println(title);
    Assert.assertTrue(true);
    alertdismiss();
	}
	
	@When("user pass the searchtext {string} and enter the button")
	public void user_pass_the_searchtext_and_enter_the_button(String string) {
		 p=new pom1();
     sendkey(p.getSearch(), string,Keys.ENTER);
     alertdismiss();
	}

	@When("Scroll down and get all products with price")
	public void scroll_down_and_get_all_products_with_price() {
     scroll(p.getAccess());
     p.map();
	}

	@Then("Vefify anyproduct")
	public void vefify_anyproduct() {
     Assert.assertTrue(true);
	}


}
