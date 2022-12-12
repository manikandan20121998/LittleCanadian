package org.base;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver; 
	public static void chromebrowser() {

		WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();	
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
	
	public static void scroll(WebElement e) {
		JavascriptExecutor je=(JavascriptExecutor)driver;
		je.executeScript("arguments[0].scrollIntoView(false)", e);
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
