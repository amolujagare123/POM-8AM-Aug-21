package regression.Clients;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.Clients.AddClient;
import pages.Menu;
import util.DoLogin;

import java.io.IOException;

import static utility.DataProviderMethod.getMyData;

public class AddClientTestDataProvider extends DoLogin {

    @Test (dataProvider = "getData")
    public void addClientTest(String name,String surname,String language,
                              String address1,String address2,String city,
                              String state,String zip,String country ,
                              String gender,String birthdate,String phone ,
                              String fax,String mobile,String email,
                              String web,String vat,String tax,
                              String expected , String xpathActual)
    {
        Menu menu = new Menu(driver);
        menu.clickAddClient();

        AddClient addClient = new AddClient(driver);

        addClient.setClientName(name);
        addClient.setClientSurname(surname);
        addClient.setLanguage(language);
        addClient.setClientAdd1(address1);
        addClient.setClientAdd2(address2);
        addClient.setClientCity(city);
        addClient.setClientState(state);
        addClient.setClientZip(zip);
        addClient.setCountry(country);
        addClient.setGender(gender);
        addClient.setClientBirthDate(birthdate); // MM/dd/yyyy
        addClient.setClientPhone(phone);
        addClient.setClientFax(fax);
        addClient.setClientMobile(mobile);
        addClient.setClientEmail(email);
        addClient.setClientWeb(web);
        addClient.setClientVat(vat);
        addClient.setClientTax(tax);
        addClient.clickSave();

        String actual = "";
        try {
            actual = driver.findElement(By.xpath(xpathActual)).getText();
        }
        catch (Exception e)
        {

        }


        Assert.assertEquals(actual,expected,"incorrect msg or record is not added properly");

    }

    @DataProvider
    public Object[][] getData() throws IOException {
        return getMyData("Data/InvoicePlane.xlsx","addClientData");
    }
}
