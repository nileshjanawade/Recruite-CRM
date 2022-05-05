package org.Testing_CRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class CandidatePage {
    public WebDriver driver;

    private By candidatesIcon = By.id("sTest-candidateIcon");
    private By addCandidateBtn = By.id("sTest-addCandidateBtn");
    private By candidateFirstName = By.id("sTest-candidateFirstName");
    private By candidateLastName = By.id("sTest-candidateLastName");
    private By candidateEmail = By.xpath("//input[@type='email']");
    private By candidateMobile = By.name("phone");
    private By candidateAddBtn = By.xpath("//button[text()='Submit']");
    private By selectAllCheckboxes = By.xpath("(//input[@type='checkbox'])[1]");
    private By successMessageCandidateAdded = By.xpath("//div[text()='Candidate Added']");


    public CandidatePage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement candidateIcon() {
        return driver.findElement(candidatesIcon);
    }

    public WebElement addCandidateButton() {
        return driver.findElement(addCandidateBtn);

    }

    public WebElement getCandidateFirstName() {
        return driver.findElement(candidateFirstName);
    }

    public WebElement getCandidateLasttName() {
        return driver.findElement(candidateLastName);
    }

    public WebElement getCandidateEmail() {
        return driver.findElement(candidateEmail);
    }

    public WebElement getCandidateMobile() {
        return driver.findElement(candidateMobile);
    }

    public WebElement candidateAddBtn() {
        return driver.findElement(candidateAddBtn);
    }
    public WebElement getSelectMulttipleCheckboxes(){
        return driver.findElement(selectAllCheckboxes);
    }
    public boolean getSuccessMessageCandidateAdded(){
        return driver.findElement(successMessageCandidateAdded).isDisplayed();
    }
}
