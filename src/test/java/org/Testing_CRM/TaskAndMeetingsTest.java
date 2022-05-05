package org.Testing_CRM;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import resources.BasePage;

import java.io.IOException;


public class TaskAndMeetingsTest extends BasePage {
    public WebDriver driver;
    private static Logger log = LogManager.getLogger(HomePage.class.getName());

    @BeforeTest
    public void openUrl() throws IOException {
        driver = launchBrowser();
        driver.get(prop.getProperty("url"));
        driver.manage().window().maximize();
        log.info("Entered the URl and Maximised");
    }

    @BeforeMethod
    public void loginPage() {
        LoginPage login = new LoginPage(driver);
        login.getEmail().sendKeys("neel.janawade@gmail.com");
        login.getPassword().sendKeys("Admin@123");
        login.loginButton().click();
        log.info("Entered username/password and click on login button.");

    }

    @Test
    public void actionsOnTask() throws InterruptedException {
        TasksAndMeetingsPage tmp = new TasksAndMeetingsPage(driver);
        tmp.getTaskAndMeetingsIcon().click();
        tmp.getSortbyDropDown().click();
        tmp.getselectTaskAndMeetingDropdown().click();
        tmp.getincompleteUpcomingRadioButton().click();
        tmp.getfilterByDateDropdown().click();
        tmp.getValuesOfFilterByDateInputDropDown().sendKeys("Last Month" + Keys.ENTER);

    }

    @AfterTest
    public void closeBrowser() {
        driver.quit();
        log.info("Closed all tabs");
    }
}
