package step_defenition;

import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import utils.DriverManager;

public class CommonStepDefs {
    private final WebDriver driver = DriverManager.getInstance();

    @Given("user opens {string}")
    public void userOpens(String url) {
        driver.get(url);
    }
}
