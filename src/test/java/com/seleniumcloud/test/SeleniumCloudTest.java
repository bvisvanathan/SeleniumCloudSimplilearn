package com.seleniumcloud.test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SeleniumCloudTest {
	
	private WebDriver driver;
	
	 @BeforeClass
	  public void setUp() throws MalformedURLException {
		 
		 ChromeOptions chromeOptions = new ChromeOptions();
		 //chromeOptions.setCapability("browserVersion", "89");
		 chromeOptions.setCapability("platformName", "Linux");
		 driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), chromeOptions);
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 	   
	  }
	

	 @Test
	  public void sampleTest() {
		 System.out.println("Selenium Test Starts"); 
		driver.get("https://www.swiggy.com");
		System.out.println("Selenium Test Success");
	}
	 
	 
	 @AfterClass
	  public void tearDown() {
	    driver.quit();
	  }

}
