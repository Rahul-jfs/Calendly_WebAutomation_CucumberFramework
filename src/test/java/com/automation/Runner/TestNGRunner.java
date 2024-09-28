package com.automation.Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"com.automation.steps"},
        plugin = {"pretty", "html:target/cucumber-reports.html", "json:target/cucumber.json"})
public class TestNGRunner extends AbstractTestNGCucumberTests {
}
