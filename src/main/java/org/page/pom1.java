package org.page;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom1 extends BaseClass{

	public pom1() {
     PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="(//input[@autocomplete=\"off\"])[1]")
	private WebElement search;
	
	@FindBy(xpath="//span[@class=\"snize-attribute\"]")
	private List<WebElement> items;
	
	@FindBy(xpath="//span[@class=\"snize-price  money \"]")
	private List<WebElement> price;
	
	@FindBy(xpath="//span[text()='Accessories']")
    private WebElement access;
	
	@FindBy(xpath="//*[@id=\"justuno_form\"]/div/div[2]/div[10]/div/div/div/span/span/span")
	private WebElement spin;
	
	public WebElement getLocation() {
		return location;
	}
	public WebElement getSpin() {
		return spin;
	}
	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement location;
	
	public WebElement getAccess() {
		return access;
	}

	public WebElement getSearch() {
		return search;
	}

	public List<WebElement> getItems() {
		return items;
	}

	public List<WebElement> getPrice() {
		return price;
	}
	
	
	public static void map() {
       pom1 p=new pom1();
		Map<String, String> mp=new LinkedHashMap<String, String>();
		List<WebElement> ii = p.getItems();
		List<WebElement> pp = p.getPrice();
		for (int i = 0; i < pp.size(); i++) {
			mp.put(ii.get(i).getText(), pp.get(i).getText());
		}
		System.out.println(mp);
	}
	
	
	
	
	
	
	
}
