package regression;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;
import pages.Login;

public class LoginTest {

    @Test
    public void loginTest()
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://[::1]/ip/index.php/sessions/login");

        Login login = new Login(driver);

        login.setTxtUser("amolujagare@gmail.com");
        login.setTxtPass("admin123");
        login.clickLogin();
    }

}
