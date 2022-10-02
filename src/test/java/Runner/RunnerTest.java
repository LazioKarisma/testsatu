package Runner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

public class RunnerTest {
    @CucumberOptions(
            features = "src/test/resources",
            glue= {"stepDefinition"},
            plugin = {"pretty", "html:target/cucumber-report.html"},
            tags = "@Regression"
    )

    public static class run extends AbstractTestNGCucumberTests {
    }
}