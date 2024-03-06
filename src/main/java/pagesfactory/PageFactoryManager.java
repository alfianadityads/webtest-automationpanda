package pagesfactory;

import context.TestContext;
import pagesfactory.contactpage.ContactPageAction;
import pagesfactory.contactpage.ContactPageValidation;
import pagesfactory.homepage.HomePageValidation;

public class PageFactoryManager {

    private static HomePageValidation homePageValidation;

    private static ContactPageAction contactPageAction;

    private static ContactPageValidation contactPageValidation;

    public static HomePageValidation getHomePageValidation(TestContext context) {
        return homePageValidation == null ? new HomePageValidation(context) : homePageValidation;
    }

    public static ContactPageAction getContactPageAction(TestContext context) {
        return contactPageAction == null ? new ContactPageAction(context) : contactPageAction;
    }

    public static ContactPageValidation getContactPageValidation(TestContext context) {
        return contactPageValidation == null ? new ContactPageValidation(context) : contactPageValidation;
    }
}
