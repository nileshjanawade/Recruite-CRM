package org.Testing_CRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class DeleteCandidate {

    public WebDriver driver;

    private By candidateCheckBox = By.xpath("(//span[@class='check'])[2]");
    private By deleteIcon = By.id("sTest-deleteBulkBtn");
    private By inputConfirmDeleteWindow = By.cssSelector("input[name='Records Count']");
    private By deleteConfirmDeleteWindow = By.id("sTest-deleteForeverBtn");

    public DeleteCandidate(WebDriver driver){
        this.driver=driver;
    }
    public WebElement getCandidateCheckBox(){
        return driver.findElement(candidateCheckBox);
    }
    public WebElement getDeleteIcon(){
        return driver.findElement(deleteIcon);
    }
    public WebElement getinputCountOnDeleteWindow(){
        return driver.findElement(inputConfirmDeleteWindow);
    }
    public WebElement getdeleteButtonOnDeleteWindow(){
        return driver.findElement(deleteConfirmDeleteWindow);
    }


}
