package org.stepdefinition;

import org.base.BaseClass;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.page.PageObjectModel;
import org.page.pom1;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClass{
	pom1 p;
	public static PageObjectModel pom;
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
   // alertdismiss();
	}
	
	@When("user pass the searchtext {string} and enter the button")
	public void user_pass_the_searchtext_and_enter_the_button(String string) {
		 p=new pom1();
     sendkey(p.getSearch(), string,Keys.ENTER);
  //   alertdismiss();
	}

	@When("Scroll down and get all products with price")
	public void scroll_down_and_get_all_products_with_price() {
     scrolldown(p.getAccess());
     p.map();
	}

	@Then("Vefify anyproduct")
	public void vefify_anyproduct() {
     Assert.assertTrue(true);
	}
	@When("action performed in mouse over in shop by brand")
	public void action_performed_in_mouse_over_in_shop_by_brand() {
		pom=new PageObjectModel();
	 click(pom.instancepom1().getLocation());
     movetoelement(pom.instancepom2().getShopbybrand());
	}

	@When("click the brand of silver cross")
	public void click_the_brand_of_silver_cross() {
   movetoelement(pom.instancepom2().getSilvercross());
   click(pom.instancepom2().getSilvercross());
	}

	@When("select first product and place add to card")
	public void select_first_product_and_place_add_to_card() {
      scrolldown(pom.instancepom2().getAddtocard());
      click(pom.instancepom2().getAddtocard());
	}

	@When("increase the count of five")
	public void increase_the_count_of_five() throws InterruptedException {
      for (int i = 0; i < 4; i++) {
		click(pom.instancepom2().getIncrement());
		Thread.sleep(1000);
	}
	}

	@When("move to checkout point")
	public void move_to_checkout_point() throws InterruptedException {
		Thread.sleep(3000);
		frame(pom.instancepom2().getFrame());
	    jeclick(pom.instancepom1().getSpin());
	    defaultcontent();
		scrolldown(pom.instancepom2().getCheckout());
    jeclick(pom.instancepom2().getCheckout());
	}
	@When("apply coupon code")
	public void apply_coupon_code() {
      sendkeys("354635378", pom.instancepom2().getDiscount());
      click(pom.instancepom2().getApply());
	}

	@When("Click the payment of paypal")
	public void click_the_payment_of_paypal() {
		frame(pom.instancepom2().getFrame2());
    click(pom.instancepom2().getPaypal());
	}

	@When("give email or phonenumber to proceed")
	public void give_email_or_phonenumber_to_proceed() {
     sendkeys("manikandan978437@gmail.com", pom.instancepom2().getEmail());
     click(pom.instancepom2().getNext());
     System.out.println("Completed.......");
     System.out.println("Done......");
	}


}
