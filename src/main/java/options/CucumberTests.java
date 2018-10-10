package options;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty"},
		glue = {"stepdef"},
		features = {"src\\test\\java\\GetBookByISBN.feature"})

public class CucumberTests {

	
}
