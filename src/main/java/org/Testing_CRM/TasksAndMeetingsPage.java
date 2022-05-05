package org.Testing_CRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TasksAndMeetingsPage {
    public WebDriver driver;

    private By taskAndMeetingsIcon = By.id("sTest-tasknAppointmentIcon");
    private By sortBydropdown = By.cssSelector("a span[class='icon']");
    private By selectTaskAndMeetingDropdown = By.xpath("//a[text()='Tasks and Meetings']");
    private By incompleteUpcomingRadioButton = By.xpath("//span[contains(text(),'Incomplete / Upcoming')]//preceding-sibling::span[contains(@class,'check')]");
    private By completePastRadioButton = By.xpath("//span[contains(text(),'Complete / Past')]//preceding-sibling::span[contains(@class,'check')]");
    private By filterByDateDropdown = By.xpath("//label[contains(text(),'Filter By Date')]//following::div[@class='vs__actions']");
    private By valuesOfFilterByDateInputDropDown = By.xpath("//label[contains(text(),'Filter By Date')]//following::input[@type='search']");

    public TasksAndMeetingsPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getTaskAndMeetingsIcon() {
        return driver.findElement(taskAndMeetingsIcon);
    }

    public WebElement getSortbyDropDown(){
       return driver.findElement(sortBydropdown);

    }
    public WebElement getselectTaskAndMeetingDropdown(){
        return driver.findElement(selectTaskAndMeetingDropdown);

    }
    public WebElement getincompleteUpcomingRadioButton(){
        return driver.findElement(incompleteUpcomingRadioButton);

    }
    public WebElement getCompletePastRadioButton(){
        return driver.findElement(completePastRadioButton);

    }
    public WebElement getfilterByDateDropdown(){
        return driver.findElement(filterByDateDropdown);

    }
     public WebElement getValuesOfFilterByDateInputDropDown(){
        return driver.findElement(valuesOfFilterByDateInputDropDown);
     }


}
