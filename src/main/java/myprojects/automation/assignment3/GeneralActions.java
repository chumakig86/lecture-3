package myprojects.automation.assignment3;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Contains main script actions that may be used in scripts.
 */
public class GeneralActions {
    private WebDriver driver;
    private WebDriverWait wait;

    public GeneralActions(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 30);
    }

    /**
     * Logs in to Admin Panel.
     *
     * @param login
     * @param password
     */
    public void login(String login, String password) {
        WebElement email = driver.findElement(By.id("email"));
        WebElement passwd = driver.findElement(By.id("passwd"));
        WebElement submit = driver.findElement(By.name("submitLogin"));
        email.sendKeys(login);
        passwd.sendKeys(password);
        submit.click();
    }

    /**
     * Adds new category in Admin Panel.
     *
     * @param categoryName
     */
    public void createCategory(String categoryName) {
        waitForContentLoad();
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        Actions builder = new Actions(driver);

        WebElement ctlgTab = driver.findElement(By.xpath("//li[@data-submenu='9']"));
        builder.moveToElement(ctlgTab).perform();
        WebElement ctg = driver.findElement(By.xpath("//li[@data-submenu='11']"));
        wait.until(ExpectedConditions.visibilityOf(ctg));

        builder.moveToElement(ctg).perform();
        builder.click(ctg).perform();
        WebElement descCategoryNew = driver.findElement(By.id("desc-category-new"));
        wait.until(ExpectedConditions.visibilityOf(descCategoryNew));
        descCategoryNew.click();
        driver.findElement(By.id("name_1")).sendKeys(categoryName);
        jse.executeScript("window.scrollBy(0,450)", "");
        driver.findElement(By.id("category_form_submit_btn")).click();
        System.out.println("Success  alert is displayed? " + driver.findElement(By.cssSelector(".alert.alert-success")).isDisplayed());

    }

    /**
     * Waits until page loader disappears from the page
     */
    public void waitForContentLoad() {
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ajax_running")));
    }

}
