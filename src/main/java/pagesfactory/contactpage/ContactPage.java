package pagesfactory.contactpage;

import context.TestContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pagesfactory.BasePage;

public class ContactPage extends BasePage {

    @FindBy(xpath = "//a[.='Contact']")
    WebElement btnContact;

    @FindBy(xpath = "//input[@class='name  grunion-field']")
    WebElement inputName;

    @FindBy(xpath = "//input[@class='email  grunion-field']")
    WebElement inputEmail;

    @FindBy(xpath = "//textarea[@class='textarea  grunion-field']")
    WebElement inputMessage;

    @FindBy(css = "//textarea[@class='textarea  grunion-field']")
    WebElement btnContactMe;

    @FindBy(css = ".entry-title")
    WebElement contactTitle;

    @FindBy(id = "contact-form-success-header")
    WebElement successMessage;

    @FindBy(xpath = "//a[.='Email(required)']")
    WebElement errorMessage;

    public ContactPage(TestContext context) {
        super(context);
        PageFactory.initElements(context.driver, this);
    }
}
