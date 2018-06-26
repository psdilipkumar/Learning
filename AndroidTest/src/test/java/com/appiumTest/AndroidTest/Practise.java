package com.appiumTest.AndroidTest;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Practise {

	@Test
	   public void iterationTest() throws Exception{
			WebDriver driver= new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			driver.get("http://www.google.com");
			driver.findElement(By.xpath("//input[@id='lst-ib']")).sendKeys("Samsung");
			driver.findElement(By.xpath("//input[@id='lst-ib']")).sendKeys(Keys.RETURN);
			List<WebElement> lst= driver.findElements(By.tagName("a"));
		  for(int i=0;i<lst.size();i++) {
			  String s1=lst.get(i).getText();
			  if (s1.contains("Samsung")){
				  System.out.println(s1);
			  }
		  }
		   
		   
	  }
}
