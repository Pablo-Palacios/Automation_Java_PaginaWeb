package YourStore.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"Your.Store.stepDefinitions", "Your.Store.Hooks"},
        snippets = CucumberOptions.SnippetType.CAMELCASE
)


public class CucumberRunnerTest extends AbstractTestNGCucumberTests { }
