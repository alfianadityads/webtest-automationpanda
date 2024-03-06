package steps;

import context.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pagesfactory.PageFactoryManager;
import pagesfactory.contactpage.ContactPageAction;
import pagesfactory.contactpage.ContactPageValidation;
import pagesfactory.homepage.HomePageValidation;

public class ContactPageSteps {

    private final ContactPageAction action;

    private final HomePageValidation homePageValidation;

    private final ContactPageAction contactPageAction;

    private final ContactPageValidation contactPageValidation;

    public ContactPageSteps(TestContext context) {
        action = PageFactoryManager.getContactPageAction(context);
        homePageValidation = PageFactoryManager.getHomePageValidation(context);
        contactPageAction = PageFactoryManager.getContactPageAction(context);
        contactPageValidation = PageFactoryManager.getContactPageValidation(context);
    }

    @Given("User is on home page")
    public void userIsOnHomePage() {
        Assert.assertTrue(homePageValidation.isOnHomePage());
    }

    @And("User click contact page button")
    public void userClickContactPageButton() {
        contactPageAction.clickContactButton();
    }

    @And("User already on contact page")
    public void userAlreadyOnContactPage() {
        Assert.assertTrue(contactPageValidation.isOnContactPage());
    }

    @When("User provide all valid data")
    public void userProvideAllValidData() {
        action.inputAllFields("Hiraka", "hiraka@example.com", "Hello, good to see you!")
                .clickContactMe();
    }

    @Then("User see success message")
    public void userSeeSuccessMessage() {
        Assert.assertTrue(contactPageValidation.successMessage());
    }
}
