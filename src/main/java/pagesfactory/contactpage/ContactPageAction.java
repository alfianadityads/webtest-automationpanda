package pagesfactory.contactpage;

import context.TestContext;

public class ContactPageAction extends ContactPage {

    public ContactPageAction(TestContext testContext) {
        super(testContext);
    }

    public void clickContactButton() {
        btnContact.click();
    }

    public ContactPageAction inputAllFields(String name, String email, String message) {
        inputName.sendKeys(name);
        inputEmail.sendKeys(email);
        inputMessage.sendKeys(message);
        return this;
    }

    public void clickContactMe() {
        btnContactMe.click();
    }

}
