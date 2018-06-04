package myprojects.automation.assignment3.tests;

import myprojects.automation.assignment3.BaseScript;
import myprojects.automation.assignment3.GeneralActions;
import myprojects.automation.assignment3.utils.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import java.util.List;


public class CreateCategoryTest extends BaseScript {
    public static void main(String[] args) throws InterruptedException {
        // TODO prepare driver object
        EventFiringWebDriver driver = getConfiguredDriver();
        GeneralActions actions = new GeneralActions(driver);
        String testCategName = "Test Category";
        driver.get(Properties.getBaseAdminUrl());

        // login
        actions.login("webinar.test@gmail.com", "Xcg7299bnSmMuRLp9ITw");

        // create category
        actions.createCategory(testCategName);

        // check that new category appears in Categories table
        WebElement filterName = driver.findElement(By.xpath("//input[@name='categoryFilter_name']"));
        filterName.sendKeys(testCategName);
        filterName.sendKeys(Keys.ENTER);
        actions.waitForContentLoad();

        List<WebElement> categories = driver.findElements(By.xpath("//tr//td[@class='pointer'][1]"));
        Boolean catPresent = false;
        for (WebElement element : categories) {
            if (element.getText().equals(testCategName)) {
                catPresent = true;
                break;
            }
        }
        System.out.println("New category is present? " + catPresent);
        // finish script
        driver.close();
    }
}
