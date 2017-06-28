package andreii.scenario;

import andreii.page.VKHomePage;
import net.thucydides.core.annotations.Step;

/**
 * @author ibraim
 */
public class VKScenario extends AbstractScenario {

    private VKHomePage homePage = new VKHomePage();

    @Step
    public void openLoginPage() {
        homePage.setDriver(driver);
        homePage.open();
    }

    @Step
    public void doLogin() {

    }

    @Step
    public void openHomePage() {

    }

    @Step
    public void addWallPost() {

    }

    @Step
    public void verifyPost() {

    }

    @Step
    public void doLogout() {
    }

    @Override
    public void play() {
        openLoginPage();
        doLogin();
        openHomePage();
        addWallPost();
        verifyPost();
        doLogout();
    }
}
