package com.bunnycart.TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src\\test\\resources\\com.bunnycart.Feature\\Createaccount.feature",
glue= {"com.bunnycart.stepdefinition"},
plugin= {"pretty","html:target/cucumberreport/report1.html"},
monochrome=true)
public class CreateNG extends AbstractTestNGCucumberTests {

}
