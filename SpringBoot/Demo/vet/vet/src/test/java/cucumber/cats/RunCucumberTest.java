package cucumber.cats;
import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty"},
        features = "src/test/resources/cucumber/"
        /*glue = "cucumber.cats.FeedCatStepDefs.java"*/)
public class RunCucumberTest {

}