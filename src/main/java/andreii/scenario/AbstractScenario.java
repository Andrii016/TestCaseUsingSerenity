package andreii.scenario;

import org.openqa.selenium.WebDriver;

/**
 * @author ibraim
 */
abstract public class AbstractScenario {

    protected WebDriver driver;

    abstract public void play();

    public WebDriver getDriver() {
        return driver;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }
}
