package org.base;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static JavascriptExecutor je;
	public static WebDriver driver; 
	public static void chromebrowser() {

		WebDriverManager.chromedriver().setup();
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--disable-notifications");
		op.addArguments("--incognito");
	    driver=new ChromeDriver(op);	
	}

	public static void urllaunch(String url) {
    driver.get(url);
		
	}
	
	public static void implicitlywait(long sec) {

		driver.manage().timeouts().implicitlyWait(sec,TimeUnit.SECONDS);
	}
	
	public static void maximize() {

		driver.manage().window().maximize();
	}
	
	public static String getcurreenturl() {

		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
	}
	
	public static String gettitle() {
		String title = driver.getTitle();
		return title;
	}
	
	public static Alert alertdismiss() {
		Alert al = driver.switchTo().alert();
		al.dismiss();
		return al;
	}
	public static void sendkey(WebElement e,String value, Keys enter) {
  e.sendKeys(value,Keys.ENTER);	
	}
	
	public static void scrolldown(WebElement e) {
		je=(JavascriptExecutor)driver;
		je.executeScript("arguments[0].scrollIntoView(true)", e);
	}
	
	public static void movetoelement(WebElement e) {
       Actions a=new Actions(driver);
       a.moveToElement(e).perform();;
		
	}
	public static void sendkeys(String txt,WebElement e) {
      e.sendKeys(txt);
	}
	
	public static void click(WebElement e) {
		e.click();
	}
	
	public static void jeclick(WebElement e) {
 
		je.executeScript("arguments[0].click()", e);
	}
	public static void frame(WebElement e) {
		driver.switchTo().frame(e);
	}
	public static void defaultcontent() {
		driver.switchTo().defaultContent();
	}
	public static void parentframe() {
		driver.switchTo().parentFrame();
	}
	
	
}
