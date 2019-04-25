package skeleton;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(monochrome=true,plugin= {"pretty","html:src/cucumber_reports"},
features="src/test/resources/skeleton/DemoWebShop.feature")
public class RunCucumber 

{
	
}
