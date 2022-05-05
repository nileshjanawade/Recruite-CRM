package org.Testing_CRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    public WebDriver driver;

    private By emailText = By.id("sTestEmail");
    private By passwordText = By.id("sTestPassword");
    private By loginButton = By.id("sTestLoginBtn");


    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getEmail() {
        return driver.findElement(emailText);

    }

    public WebElement getPassword() {
        return driver.findElement(passwordText);

    }

    public WebElement loginButton() {
        return driver.findElement(loginButton);

    }
}
