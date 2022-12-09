package Runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        
        features = ".\\Features\\Country.feature",
        glue="StepDefinition",
        dryRun=false,
        monochrome=true
        
        )
	public class Country_TRunner {


}
