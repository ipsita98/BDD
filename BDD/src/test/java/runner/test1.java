package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features="Feature",glue="steps", monochrome = true,
plugin = "pretty")


public class test1 {
	
	
	
}

