package week7.day1.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src/test/java/week7/day1/features/Login.feature","src/test/java/week7/day1/features/CreateLead.feature"}, 
				 glue = "steps",
				 monochrome = true,
				 publish = true)
public class CucumberRunner extends AbstractTestNGCucumberTests{

}
