package UITesting;

import org.openqa.selenium.support.Color;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.Login;
import util.OpenUrl;

import java.util.Locale;

public class LoginTest extends OpenUrl {

    Login login;

    @BeforeClass
    public void initLogin()
    {
        login = new Login(driver);
    }

    // to check whether the textbox username is present
    // on the login page or not.
    @Test
    public void txtUsernameVisibility()
    {

    //    driver.navigate().to("http://scriptinglogic.com");
        boolean expected = true; // expected result

        boolean actual = false;
        try {
             actual = login.txtUser.isDisplayed(); // true
       }
        catch (Exception e)
        {

        }
        Assert.assertEquals(actual,expected,"element not present on the web page");
    }


    @Test
    public void btnLoginEnability()
    {

        //    driver.navigate().to("http://scriptinglogic.com");
        boolean expected = true; // expected result

        boolean actual = false;
        try {
            actual = login.btnLogin.isEnabled();// true / false
        }
        catch (Exception e)
        {

        }
        Assert.assertEquals(actual,expected,"btn Login is not enabled");
    }

    @Test // spelling of email lbl --> "Email"
    public void lblEmailSpellCheck()
    {
        String expected = "Email";

        String actual ="";
        try
        {
          actual = login.lblEmail.getText();
        }
        catch (Exception e)
        {

        }
        System.out.println("Expected="+expected);
        System.out.println("Actual="+actual);

        Assert.assertEquals(actual,expected,"Email spelling is incorrect");

    }

    @Test
    public void lblEmailFontCheck()
    {
        String expected = "14px";

        String actual = "";

        try
        {
            actual= login.lblEmail.getCssValue("font-size");
        }
        catch (Exception e)
        {

        }

        System.out.println("Expected="+expected);
        System.out.println("Actual="+actual);

        Assert.assertEquals(actual,expected,"incorrect font size");

    }
    @Test
    public void lblEmailFontFamily()
    {
        String expected  ="-apple-system, system-ui, BlinkMacSystemFont, \"Segoe UI\", Roboto, \"Helvetica Neue\", Arial, sans-serif";

        String actual = "";
        try
        {
            actual = login.lblEmail.getCssValue("font-family");
        }
        catch (Exception e)
        {

        }

        System.out.println("Expected="+expected);
        System.out.println("Actual="+actual);

        Assert.assertEquals(actual,expected,"incorrect font ");


    }

    @Test
    public void lblEmailFont()
    {
        String expected  = "Times New Roman";

        String actual = "";
        try
        {
            actual = login.lblEmail.getCssValue("font-family");
        }
        catch (Exception e)
        {

        }

        boolean result = actual.contains(expected);

        Assert.assertTrue(result,"given font is not in the font family");
    }

    @Test
    public void txtEmailWatermark()
    {
        String expected = "Email";
        String actual = "";
        try
        {
            actual = login.txtUser.getAttribute("placeholder");
        }
        catch (Exception e)
        {
        }

        System.out.println("Expected="+expected);
        System.out.println("Actual="+actual);

        Assert.assertEquals(actual,expected,"incorrect value ");

    }

    @Test
    public void btnColorCheck()
    {
        String expected = "#2C8EDD";
        String actual = "";
        try
        {
            String rgbColor = login.btnLogin.getCssValue("background-color");

            actual = Color.fromString(rgbColor).asHex().toUpperCase(Locale.ROOT);
        }
        catch (Exception e)
        {

        }

        System.out.println("Expected="+expected);
        System.out.println("Actual="+actual);

        Assert.assertEquals(actual,expected,"incorrect color");


    }
}
