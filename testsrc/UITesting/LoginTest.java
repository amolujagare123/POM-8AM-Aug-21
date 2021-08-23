package UITesting;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.Login;
import util.OpenUrl;

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
}
