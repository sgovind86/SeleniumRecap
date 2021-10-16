import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/Features",
        glue = {"src/test/java/StepDefinitions.java"},
        plugin = {"html: practise.html"},
        publish = true
)
public class Runner {
}
