package org.page;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom2Addtocard extends BaseClass{
	public Pom2Addtocard() {
   PageFactory.initElements(driver, this);
	}
    @FindBy(xpath="//*[@id=\"SiteHeader\"]/div[3]/div[1]/div[1]/ul/li[3]/a")
	private WebElement shopbybrand;
	
	@FindBy(xpath="//*[@id=\"SiteHeader\"]/div[3]/div[1]/div[1]/ul/li[3]/ul/div/div/li[24]/a")
	private WebElement silvercross;
	
	@FindBy(xpath="(//a[@class='btn'])[1]")
	private WebElement addtocard;
	
	@FindBy(xpath="(//button[@type='button'])[23]")
	private WebElement increment;
	
	@FindBy(name="checkout")
	private WebElement checkout; 
	
	@FindBy(id="TextField7")
	private WebElement discount;
	
	@FindBy(xpath="//*[@id=\"Form1\"]/div[1]/div")
	private WebElement apply;
	
	@FindBy(xpath="//img[contains(@class,'pa')]")
	private WebElement paypal;
	
	@FindBy(id="email")
	private WebElement email;
	
	@FindBy(xpath="//*[@id=\"ju_iframe_318401\"]")
	private WebElement frame1;
	
	@FindBy(xpath="//*[@id=\"jsx-iframe-2c7621fbae\"]")
	private WebElement frame2;
	
	public WebElement getFrame1() {
		return frame1;
	}
	public WebElement getFrame2() {
		return frame2;
	}
	@FindBy(xpath="//p[contains(text(),'Ple')]")
	private WebElement scrolldown;
	
	public WebElement getFrame() {
		return frame1;
	}
	public WebElement getScrolldown() {
		return scrolldown;
	}
	@FindBy(id="btnNext")
	private WebElement next;

	public WebElement getShopbybrand() {
		return shopbybrand;
	}

	public WebElement getSilvercross() {
		return silvercross;
	}

	public WebElement getAddtocard() {
		return addtocard;
	}

	public WebElement getIncrement() {
		return increment;
	}

	public WebElement getCheckout() {
		return checkout;
	}

	public WebElement getDiscount() {
		return discount;
	}

	public WebElement getApply() {
		return apply;
	}

	public WebElement getPaypal() {
		return paypal;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getNext() {
		return next;
	}
	
	
	
	
	
	
	
}
