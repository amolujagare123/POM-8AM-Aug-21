package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotPassword {

    public ForgotPassword(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//input[@id='email']")
    WebElement txtEmail;

    @FindBy (xpath = "//button[@type='submit']")
    WebElement btnReset;

    public void setTxtEmail(String email)
    {
        txtEmail.sendKeys(email);
    }

    public void clichReset()
    {
        btnReset.click();
    }

}
