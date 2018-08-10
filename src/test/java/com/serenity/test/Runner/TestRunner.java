package com.serenity.test.Runner;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features/flight_featuredetails",
		glue = {"com.serenity.test.stepDefinition"},
		plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"}
		)

public class TestRunner 
{
	
	@AfterClass
	public static void wrieExtentReport()
	{
		Reporter.loadXMLConfig(new File(TestBase.TestBase.getExtentReportConfigPath()));
		Reporter.setSystemInfo("user", System.getProperty("user.name"));
        Reporter.setSystemInfo("os", "Windows");
        Reporter.setTestRunnerOutput("Sample test runner output message");
	}
}


