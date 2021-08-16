package pages.Clients;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddClient {

    public AddClient(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath="//input[@id='client_name']")
    WebElement clientName;

    public void setClientName(String name)
    {
        clientName.sendKeys(name);
    }

    @FindBy(xpath="//input[@id='client_surname']")
    WebElement clientSurname;

    public void setClientSurname(String surname)
    {
        clientSurname.sendKeys(surname);
    }


    @FindBy(id="client_address_1")
    WebElement clientAdd1;

    public void setClientAdd1(String add1)
    {
     clientAdd1.sendKeys(add1);
    }


    @FindBy(id="client_address_2")
    WebElement clientAdd2;

    public void setClientAdd2(String add2)
    {
        clientAdd2.sendKeys(add2);
    }

    @FindBy(id="client_city")
    WebElement clientCity;

    public void setClientCity(String city)
    {
        clientCity.sendKeys(city);
    }

    @FindBy(xpath="//button[normalize-space()='Save']")
    WebElement save;

    public void clickSave()
    {
       save.click();
    }

}
