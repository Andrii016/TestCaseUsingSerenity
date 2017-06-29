package andreii.page;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


@DefaultUrl("https://vk.com")
public class VKHomePage extends PageObject {

    @FindBy(id = "index_email")
    public WebElement phoneElement;

    @FindBy(id = "index_pass")
    public WebElement passwordElement;

    @FindBy(id = "index_login_button")
    public WebElement pressloginbutton;
    @FindBy(xpath = ".//*[@id='l_pr']/a/span/span[3]")
    public WebElement openHomeScreen;
    @FindBy(xpath = ".//*[@id='wall_tabs']/li[4]/a")
    public WebElement openPostPage;
    @FindBy(id = "post_field")
    public WebElement addNewPost;
    @FindBy(xpath = ".//*[@id='send_post']")
    public WebElement sendPost;
    @FindBy(xpath = ".//*[@id='l_pr']/a/span/span[3]")
    public WebElement pressHomeScreen;
    @FindBy(xpath = ".//*[@id='top_profile_link']")
    public WebElement clickOnProfile;
    @FindBy(xpath = ".//*[@id='top_logout_link']")
    public WebElement makeLogout;






}

