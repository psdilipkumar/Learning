package com.appiumTest.AndroidTest;
import java.net.MalformedURLException;
import java.net.URL;

import org.aspectj.lang.annotation.After;
import org.testng.annotations.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class Test1 {
	
	private AndroidDriver driver;
	//@BeforeTest
	public void setup() throws MalformedURLException {
		 DesiredCapabilities dc = new DesiredCapabilities();
        //dc.setCapability(CapabilityType.BROWSER_NAME, "");
        dc.setCapability("deviceName", "Samsung_S7_8_API26");
        dc.setCapability("platformName","Android");
        dc.setCapability("app", "C:\\Softwares\\CalculatorPlus.apk");
        //dc.setCapability("appPackage", "io.selendroid.testapp");
        //dc.setCapability("appActivity", ".HomeScreenActivity");
        
        driver= new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), dc);
		
	}
	
	//@Test
	public void firstTest() throws Exception {
		Thread.sleep(5000);
		driver.findElementById("com.digitalchemy.calculator.freedecimal:id/n7").click();
		driver.findElementById("com.digitalchemy.calculator.freedecimal:id/n7").click();
		driver.findElementById("com.digitalchemy.calculator.freedecimal:id/n7").click();
		Thread.sleep(5000);
		driver.quit();
		System.out.println("Done");
	}
		
  }
