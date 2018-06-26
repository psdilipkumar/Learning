package com.CucumberStepDefnitions;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class googleStepDefnition {
	
	WebDriver driver;
	
	@Given("^Google search Home page is open$")
	public void google_Search_HomePage() {
		driver = new ChromeDriver();
		driver.get("http://www.google.com");
	}
	
	@When("^search for Combined$")
	public void google_SearchCombined(DataTable userData) throws InterruptedException {
		List<List<String>> data = userData.raw();
		for(int i=1;i<data.size();i++) {
			driver.findElement(By.xpath("//input[@id='lst-ib']")).clear();
			driver.findElement(By.xpath("//input[@id='lst-ib']")).sendKeys(data.get(i).get(0));
			driver.findElement(By.xpath("//input[@id='lst-ib']")).sendKeys(" " + data.get(i).get(1));
			Thread.sleep(3000);
		}
	}
	
	@When("^search for \"([^\"]*)\"$")
	public void google_SearchDevices(String device) {
		driver.findElement(By.xpath("//input[@id='lst-ib']")).sendKeys(device);
	}
	
	@And("^Click Search$")
	public void google_hitSearch() {
		driver.findElement(By.xpath("//input[@id='lst-ib']")).sendKeys(Keys.RETURN);
	}
	
	@Then("^(.*) Links search should be displayed$")
	public void google_SearchResult(String FName) {
		List<WebElement> lst= driver.findElements(By.tagName("a"));
		System.out.println("Searching for Text " + FName);
		  for(int i=0;i<lst.size();i++) {
			  String s1=lst.get(i).getText().toLowerCase();
			  if (s1.contains(FName.toLowerCase())){
				  System.out.println("Links Found");
			  }			
		  }
		  driver.close();
	}
	
	@Then("\"([^\"]*)\" Links search must be displayed$")
	public void google_SearchDeviceResult(String device) {
		List<WebElement> lst= driver.findElements(By.tagName("a"));
		System.out.println("Searching for Text " + device);
		  for(int i=0;i<lst.size();i++) {
			  String s1=lst.get(i).getText().toLowerCase();
			  if (s1.contains(device.toLowerCase())){
				  System.out.println("Links Found");
			  }			
		  }
		  driver.close();
	}

}
