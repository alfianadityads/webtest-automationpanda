package pagesfactory.homepage;

import context.TestContext;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePageValidation extends HomePage {
    public HomePageValidation(TestContext testContext) {
        super(testContext);
    }

    public boolean isOnHomePage() {
        return getWait().until(ExpectedConditions.visibilityOf(homePageTitle)).isDisplayed();
    }
}
