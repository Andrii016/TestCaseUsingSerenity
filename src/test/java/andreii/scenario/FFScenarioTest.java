package andreii.scenario;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.util.EnvironmentVariables;
import net.thucydides.core.util.SystemEnvironmentVariables;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import static org.junit.Assert.assertSame;



@RunWith(SerenityRunner.class)
public class FFScenarioTest {


    private WebDriver firefox;

    @Steps
    private VKScenario scenario;

    @Before
    public void init() {
        firefox = new FirefoxDriver ();
        scenario.setDriver(firefox);
    }

    @Test
    public void shouldPlayScenarioViaFF() {

        scenario.play();
    }
}
