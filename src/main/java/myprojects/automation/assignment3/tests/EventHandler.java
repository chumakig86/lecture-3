package myprojects.automation.assignment3.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;

public class EventHandler implements WebDriverEventListener {
    @Override
    public void beforeAlertAccept(WebDriver webDriver) {

    }

    @Override
    public void afterAlertAccept(WebDriver webDriver) {

    }

    @Override
    public void afterAlertDismiss(WebDriver webDriver) {

    }

    @Override
    public void beforeAlertDismiss(WebDriver webDriver) {

    }

    @Override
    public void beforeNavigateTo(String s, WebDriver webDriver) {
        System.out.println("Navigating to: " + s);
    }

    @Override
    public void afterNavigateTo(String s, WebDriver webDriver) {
        System.out.println("Successfully navigated to: " + s);
    }

    @Override
    public void beforeNavigateBack(WebDriver webDriver) {

    }

    @Override
    public void afterNavigateBack(WebDriver webDriver) {

    }

    @Override
    public void beforeNavigateForward(WebDriver webDriver) {

    }

    @Override
    public void afterNavigateForward(WebDriver webDriver) {

    }

    @Override
    public void beforeNavigateRefresh(WebDriver webDriver) {

    }

    @Override
    public void afterNavigateRefresh(WebDriver webDriver) {

    }

    @Override
    public void beforeFindBy(By by, WebElement webElement, WebDriver webDriver) {
        System.out.println("Looking for element " + by);
    }

    @Override
    public void afterFindBy(By by, WebElement webElement, WebDriver webDriver) {
        System.out.println("Successfully found element " + by);
    }

    @Override
    public void beforeClickOn(WebElement webElement, WebDriver webDriver) {
        System.out.println("Clicking on " + webElement);
    }

    @Override
    public void afterClickOn(WebElement webElement, WebDriver webDriver) {
        System.out.println("Clicked");
    }

    @Override
    public void beforeChangeValueOf(WebElement webElement, WebDriver webDriver, CharSequence[] charSequences) {
        System.out.println("Entering " + charSequences[0] + " to " + webElement);
    }

    @Override
    public void afterChangeValueOf(WebElement webElement, WebDriver webDriver, CharSequence[] charSequences) {
        System.out.println("Entered");
    }

    @Override
    public void beforeScript(String s, WebDriver webDriver) {

        System.out.println("Running script " + s);
    }

    @Override
    public void afterScript(String s, WebDriver webDriver) {

        System.out.println("Script run successfully.");
    }

    @Override
    public void onException(Throwable throwable, WebDriver webDriver) {

    }
}
