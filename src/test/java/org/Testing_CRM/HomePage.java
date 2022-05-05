package org.Testing_CRM;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import resources.BasePage;
import java.io.IOException;

public class HomePage extends BasePage {
    public WebDriver driver ;
    private static Logger log = LogManager.getLogger(HomePage.class.getName());
    @Test
    public void basePageNavigation() throws IOException {
        driver = launchBrowser();
        driver.get(prop.getProperty("url"));
        driver.manage().window().maximize();
        log.info("Entered the URl and Maximised");
    }

    @AfterTest
    public void closeBrowser() {
        driver.close();
        log.info("Closed all tabs");
    }
}
