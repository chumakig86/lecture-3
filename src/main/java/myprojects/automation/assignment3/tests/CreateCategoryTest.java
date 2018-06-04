package myprojects.automation.assignment3.tests;

import myprojects.automation.assignment3.BaseScript;
import myprojects.automation.assignment3.GeneralActions;
import myprojects.automation.assignment3.utils.Properties;
import org.openqa.selenium.support.events.EventFiringWebDriver;


public class CreateCategoryTest extends BaseScript {
    public static void main(String[] args) throws InterruptedException {
        // TODO prepare driver object
        EventFiringWebDriver driver = getConfiguredDriver();


        GeneralActions actions = new GeneralActions(driver);

        driver.get(Properties.getBaseAdminUrl());

        // login
        actions.login("webinar.test@gmail.com", "Xcg7299bnSmMuRLp9ITw");
        // ...

        // login

        // create category

        // check that new category appears in Categories table

        // finish script
    }
}
