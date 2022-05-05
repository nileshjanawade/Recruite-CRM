package org.Testing_CRM;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import resources.BasePage;


import java.io.IOException;


public class AddCandidatePage extends BasePage {
    public WebDriver driver;
    private static Logger log = LogManager.getLogger(HomePage.class.getName());
    CandidatePage Candidate;


    @BeforeTest
    public void openUrl() throws IOException {
        driver = launchBrowser();

    }
    @Test(dataProvider="getData")
    public void loginPage(String name,String password){
        driver.get(prop.getProperty("url"));
        driver.manage().window().maximize();
        LoginPage login = new LoginPage(driver);
        login.getEmail().sendKeys(name);
        login.getPassword().sendKeys(password);
        login.loginButton().click();
        log.info("Entered username/password and click on login button.");
    }

    @Test(dependsOnMethods = "loginPage")
    public void addCandidate() throws InterruptedException {
        Candidate = new CandidatePage(driver);
        Candidate.candidateIcon().click();
        Candidate.addCandidateButton().click();
        Candidate.getCandidateFirstName().sendKeys(RandomStringUtils.randomAlphabetic(6));
        Candidate.getCandidateLasttName().sendKeys(RandomStringUtils.randomAlphabetic(5));
        Candidate.getCandidateMobile().sendKeys(RandomStringUtils.randomNumeric(10));
        Candidate.getCandidateEmail().sendKeys(RandomStringUtils.randomAlphanumeric(10) + "@gmail.com");
        Candidate.candidateAddBtn().click();
        log.info("Entered all mandatory details in Add Candidate curtain page and clicked on sumbit");
    }

    @Test
    public void multiSelectCandidateCheckboxes()  {
        Candidate = new CandidatePage(driver);
        Candidate.candidateIcon().click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()", Candidate.getSelectMulttipleCheckboxes());
    }

    @DataProvider
    public Object[][] getData(){
        Object[][] data = new Object[2][2];
        data[0][0]="invalidemial@lcl.com";
        data[0][1]="invalid";
        data[1][0]="neel.janawade@gmail.com";
        data[1][1]="Admin@123";
        return data;
    }

    @AfterTest
    public void closeBrowser() {
        driver.quit();
        log.info("Closed all tabs");
    }
}
