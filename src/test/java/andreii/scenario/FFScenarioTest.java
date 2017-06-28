package andreii.scenario;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author ibraim
 */
@RunWith(SerenityRunner.class)
public class FFScenarioTest {

    private WebDriver firefox;

    @Steps
    private VKScenario scenario;

    @Before
    public void init() {
        firefox = new FirefoxDriver();
        scenario.setDriver(firefox);
    }

    @Test
    public void shouldPlayScenarioViaFF() {
        scenario.play();
    }
}
