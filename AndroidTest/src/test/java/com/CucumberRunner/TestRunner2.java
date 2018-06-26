package com.CucumberRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features = {"C:\\Automation\\EclipseWorkSpace\\AndroidTest\\src\\test\\java\\com\\CucumberFeature\\second.feature"},
		plugin = {"json:target/cucumber-report.json"},
		glue={"classpath:com/CucumberStepDefnitions"})
public class TestRunner2 extends AbstractTestNGCucumberTests {
}

//glue={"C:\\Automation\\EclipseWorkSpace\\AndroidTest\\src\\test\\java\\com\\CucumberStepDefnitions"})