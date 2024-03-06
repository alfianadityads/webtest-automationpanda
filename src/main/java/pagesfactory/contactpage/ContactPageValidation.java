package pagesfactory.contactpage;

import context.TestContext;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ContactPageValidation extends ContactPage {

    public ContactPageValidation(TestContext testContext) {
        super(testContext);
    }

    public boolean isOnContactPage() {
        return getWait().until(ExpectedConditions.visibilityOf(contactTitle)).isDisplayed();
    }

    public boolean successMessage() {
        return getWait().until(ExpectedConditions.visibilityOf(successMessage)).isDisplayed();
    }

    public boolean errorMessage() {
        return getWait().until(ExpectedConditions.visibilityOf(errorMessage)).isDisplayed();
    }
}
