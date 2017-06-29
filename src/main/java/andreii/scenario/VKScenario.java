package andreii.scenario;


import andreii.configuration.Properties;
import andreii.page.VKHomePage;
import net.thucydides.core.annotations.Step;
import org.junit.Test;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;


public class VKScenario extends AbstractScenario  {

    private VKHomePage homePage = new VKHomePage();

    @Step
    public void openLoginPage() {
        homePage.setDriver(driver);
        homePage.open();
    }

    @Step
    public void doLogin() {
        homePage.phoneElement.sendKeys (Properties.getInstance ().userPhone);
        homePage.passwordElement.sendKeys (Properties.getInstance ().userPassword);
        homePage.pressloginbutton.click();
    }

    @Step
    public void openHomePage() {
        homePage.openHomeScreen.click();
    }

    @Step
    public void addWallPost() {
        homePage.openPostPage.click ();
        homePage.addNewPost.sendKeys (Properties.getInstance ().userPost);
        homePage.sendPost.click ();
    }

    @Step
    private void shouldFindPost() {
        homePage.pressHomeScreen.click ();

        WebElement firstPost = homePage.findBy ("#page_wall_posts .wall_post_text");
        assertNotNull (firstPost);
        assertEquals(firstPost.getText (),Properties.getInstance ().userPost);

        //assertEquals(driver.getTitle().contains (""));
//        if(homePage.getTitle().contains("Make Post")){
//            System.out.println("Text is present");
//        }else{
            //homePage.containsText ("test");
        }

    @Step
        private  void shouldNotFoundPost() {
        final String INCORRECT_POST = "Incorrect";
            WebElement firstPost = homePage.findBy ("#page_wall_posts .wall_post_text");
            assertNotNull (firstPost);
            assertNotEquals(firstPost.getText (),INCORRECT_POST);
        }

    //private void assertEquals(boolean contains) {
   // }


    @Step
    public void doLogout() {
        homePage.clickOnProfile.click ();
        homePage.makeLogout.click ();
        if(homePage.getTitle().contains("ВКонтакте для мобильных устройств")){
            System.out.println("Text is present");
        }else{
            System.out.println("Text is absent");
        }

    }

    @Override
    public void play() {
        openLoginPage();
        doLogin();
        openHomePage();
        addWallPost();
        shouldFindPost ();
        shouldNotFoundPost ();
        doLogout();
    }
}
