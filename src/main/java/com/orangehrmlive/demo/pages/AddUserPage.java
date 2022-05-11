package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddUserPage extends Utility {

    public AddUserPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h1[@id='UserHeading']")
    WebElement addUserText;

    @FindBy(xpath = "//select[@id='systemUser_userType']")
    WebElement userRoleDropDown;

    @FindBy(xpath = "//input[@id='systemUser_employeeName_empName']")
    WebElement employeeName;

    @FindBy(xpath = "//input[@id='systemUser_userName']")
    WebElement userName;

     @FindBy(xpath = "//select[@id='systemUser_status']")
    WebElement statusDropDown;

    @FindBy(xpath = "//input[@id='systemUser_password']")
    WebElement password;

    @FindBy(xpath = "//input[@id='systemUser_confirmPassword']")
    WebElement confirmPassword;

    @FindBy(xpath = "//input[@id='btnSave']")
    WebElement saveButton;

    @FindBy(xpath = "//input[@id='btnCancel']")
    WebElement cancelButton;


    public void selectUserRole(String role)
    {
        selectByVisibleTextFromDropDown(userRoleDropDown,role);
    }

    public void enterEmployeeName(String eName)
    {
        sendTextToElement(employeeName,eName);
    }

    public void enterUserName(String uName)
    {
        sendTextToElement(userName,uName);
    }

    public void selectStatusFromDropDown(String status)
    {
        selectByVisibleTextFromDropDown(statusDropDown,status);
    }

    public void enterPassword(String pwd)
    {
        sendTextToElement(password,pwd);
    }

    public void enterConfirmPassword(String cPwd)
    {
        sendTextToElement(password,cPwd);
    }
    public void clickOnSaveButton()
    {
        clickOnElement(saveButton);
    }

    public void clickOnCancelButton()
    {
        clickOnElement(cancelButton);
    }

    public String getaddUserText()
    {
        return getTextFromElement(addUserText);
    }






}
