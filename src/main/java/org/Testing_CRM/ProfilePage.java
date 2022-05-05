package org.Testing_CRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public class ProfilePage {
    public WebDriver driver;

    private By profileDashbaord = By.cssSelector("img[class='user-dropdown-link']");
    private By profileOption = By.id("sTest-profileInAppBtn");
    private By profileimg = By.cssSelector("label.upload");
    private By properProfileImg = By.cssSelector("i.mdi-camera");
    private By saveProfileButton = By.id("sTest-btnSaveProfile");

    public ProfilePage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getProfileIcon() {
        return driver.findElement(profileDashbaord);
    }

    public WebElement getProfileOption() {
        return driver.findElement(profileOption);
    }

    public WebElement getProfileImg() {
        return driver.findElement(profileimg);
    }

    public WebElement getProperProfileImg() {
        return driver.findElement(properProfileImg);
    }

    public void uploadProfileImg() throws IOException {
        Runtime.getRuntime().exec("C://Users/njanawade/Desktop/FileUpload.exe");
    }

    public WebElement getSaveProfileButton() {
        return driver.findElement(saveProfileButton);
    }

}
