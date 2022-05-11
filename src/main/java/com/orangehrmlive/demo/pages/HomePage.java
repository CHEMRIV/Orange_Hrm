package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {
    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//body/div[@id='wrapper']/div[@id='branding']/a[1]/img[1]")
    WebElement orangeHrmLogo;

    @FindBy(xpath = "//b[contains(text(),'Admin')]")
    WebElement adminText;

    @FindBy(xpath = "//b[contains(text(),'PIM')]")
    WebElement pimText;

    @FindBy(xpath = "//b[contains(text(),'Leave')]")
    WebElement leaveText;

    @FindBy(xpath = "//h1[contains(text(),'Dashboard')]")
    WebElement dashBoardText;

    @FindBy(xpath = "//a[@id='welcome']")
    WebElement welcomeText;

    @FindBy(xpath = "//b[contains(text(),'Admin')]")
    WebElement adminTab;

    @FindBy(xpath = "//a[@id='welcome']")
    WebElement profileLogo;

    @FindBy(xpath = "//a[contains(text(),'Logout')]")
    WebElement logout;

    public String getOrangeHRMlogo() {
        return getTextFromElement(orangeHrmLogo);
    }

    public String getAdminText() {
        return getTextFromElement(adminText);
    }

    public String getPimText() {
        return getTextFromElement(pimText);
    }



    public String getLeaveText() {
        return getTextFromElement(leaveText);
    }

    public String dashBoardText() {
        return getTextFromElement(dashBoardText);
    }

    public String getWelcomeText() {
        String str = welcomeText.getText();
        String result = str.substring(0, 7);
        return result;
    }

    public void clickOnAdminTab()
    {
        clickOnElement(adminTab);
    }

    public void clickOnUserProfileLogo()
    {
        clickOnElement(profileLogo);
    }

    public void mouseHoverAndClickOnLogOut()
    {
        mouseHoverToElementAndClick(logout);
    }

}
