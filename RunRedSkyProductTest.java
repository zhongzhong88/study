package cukes.framework;

import org.junit.runner.RunWith;

import cucumber.junit.Cucumber;


@RunWith(Cucumber.class)
@Cucumber.Options(glue = { "cukes.framework", "functionaltests.cukes.data.redskyproduct" },
												 
         features = { "feature/redskyproduct-test" }, 
         format = {
		"pretty", "html:reports/test-report",
		"json:target/cucumber-productSummaryTest.json" }, tags = { "@redSkyProductSearchTestScenario" })

public class RunRedSkyProductTest {

}
