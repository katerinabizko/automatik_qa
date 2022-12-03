import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterTest;
import utils.DriverManager;

@CucumberOptions(tags = "",
        features = {"src/test/resources/features"},
        glue = {"lv.acodemy.step_definitions"},
        plugin = {"html:target/report.html"})

public class TestCucumber extends AbstractTestNGCucumberTests {

    @AfterTest
    public void after() {
        DriverManager.closeBrowser();
    }
}
