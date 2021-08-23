package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {


    public Login(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }

    // web elements - objects
    // actions (operative methods)
    // WebDriver driver;
    //WebElement txtUser = driver.findElement(By.xpath("//input[@id='email']"));

    @FindBy(xpath = "//input[@id='email']")
    public WebElement txtUser;

    @FindBy(xpath="//input[@id='password']")
    public WebElement txtPass;

    @FindBy (xpath="//button[@type='submit']")
    public WebElement btnLogin;

    @FindBy (xpath = "//a[@class='btn btn-default']")
    public WebElement lnkForgotPass;

    @FindBy (xpath = "//label[@for='email']")
    public WebElement lblEmail;


    public void setTxtUser(String user)
    {
        txtUser.sendKeys(user);
    }

    public void setTxtPass(String pass)
    {
        txtPass.sendKeys(pass);
    }

    public void clickLogin()
    {
        btnLogin.click();
    }

    public void clickForgotPass()
    {
        lnkForgotPass.click();
    }
}
