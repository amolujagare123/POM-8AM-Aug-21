package pages.Clients;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddClient {

    public AddClient(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
        this.driver=driver;
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

    @FindBy(xpath="//input[@id='client_state']") WebElement clientState;

    public void setClientState(String state)
    {
        clientState.sendKeys(state);
    }

    @FindBy(xpath="//input[@id='client_zip']") WebElement clientZip;

    public void setClientZip(String zip)
    {
        clientZip.sendKeys(zip);
    }

    @FindBy(xpath="//input[@id='client_phone']") WebElement clientPhone;

    public void setClientPhone(String phone)
    {
        clientPhone.sendKeys(phone);
    }


    @FindBy(xpath="//input[@id='client_fax']") WebElement clientFax;

    public void setClientFax(String fax)
    {
        clientFax.sendKeys(fax);
    }

    @FindBy(xpath="//input[@id='client_mobile']") WebElement clientMobile;

    public void setClientMobile(String mobile)
    {
        clientMobile.sendKeys(mobile);
    }

    @FindBy(xpath="//input[@id='client_email']") WebElement clientEmail;

    public void setClientEmail(String email)
    {
        clientEmail.sendKeys(email);
    }


    @FindBy(xpath="//input[@id='client_web']") WebElement clientWeb;

    public void setClientWeb(String web)
    {
        clientWeb.sendKeys(web);
    }

    @FindBy(xpath="//input[@id='client_vat_id']") WebElement clientVat;

    public void setClientVat(String vat)
    {
        clientVat.sendKeys(vat);
    }


    @FindBy(xpath="//input[@id='client_tax_code']") WebElement clientTax;

    public void setClientTax(String tax)
    {
        clientTax.sendKeys(tax);
    }


    @FindBy(id="select2-client_language-container")
    WebElement languageContainer;

    @FindBy(xpath="//input[@role='searchbox']")
    WebElement searchBox;

    WebDriver driver;

    public void setLanguage(String language)
    {
        languageContainer.click();
        searchBox.sendKeys(language);

        driver.findElement(By.xpath("//li[normalize-space()='"+language+"']")).click();

    }

    @FindBy(id="select2-client_country-container")
    WebElement countryContainer;

    public void setCountry(String country)
    {
        countryContainer.click();
        searchBox.sendKeys(country);

        driver.findElement(By.xpath("//li[normalize-space()='"+country+"']")).click();

    }

    @FindBy(id="select2-client_gender-container")
    WebElement genderContainer;

    public void setGender(String gender)
    {
        genderContainer.click();
        driver.findElement(By.xpath("//li[normalize-space()='"+gender+"']")).click();
    }

    @FindBy(id="client_birthdate")
    WebElement clientBirthDate;

    public void setClientBirthDate(String bDate)
    {
      //  clientBirthDate.sendKeys(bDate);

        // Javascript executor

        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("arguments[0].setAttribute('value','"+bDate+"')",clientBirthDate);

    }
}
