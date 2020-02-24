package org.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {
	static WebDriver driver;
	//@beforeclass
	public static void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MYPC\\eclipse-workspace\\AirIndia\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		System.out.println("bdjhbd");
	}
	
	
	
	

}
