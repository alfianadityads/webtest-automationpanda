package pagesfactory.homepage;

import context.TestContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pagesfactory.BasePage;

public class HomePage extends BasePage {

    @FindBy(xpath = "//article[@class='post-17262 post type-post status-publish format-standard has-post-thumbnail hentry category-career']//h1[@class='entry-title']")
    WebElement homePageTitle;

    public HomePage(TestContext context) {
        super(context);
        PageFactory.initElements(context.driver, this);
    }
}
