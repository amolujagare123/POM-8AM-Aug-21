package regression;

import org.testng.annotations.Test;
import pages.Clients.AddClient;
import pages.Menu;
import util.DoLogin;

public class AddClientTest extends DoLogin {

    @Test
    public void addClientTest()
    {
        Menu menu = new Menu(driver);
        menu.clickAddClient();

        AddClient addClient = new AddClient(driver);

        addClient.setLanguage("Thai");
        addClient.setCountry("Jordan");
        addClient.setGender("Female");
        addClient.setClientBirthDate("12/05/1985"); // MM/dd/yyyy

      /*  addClient.setClientName("Rahul");
        addClient.setClientSurname("ujagare");
        addClient.setClientAdd1("xyz");
        addClient.setClientAdd2("pqr");
        addClient.setClientCity("pune");
        addClient.setClientState("MH");
        addClient.setClientZip("78787878");
        addClient.setClientPhone("78787878");
        addClient.setClientFax("78787878");
        addClient.setClientMobile("78787878");
        addClient.setClientEmail("amol@gmail.com");
        addClient.setClientWeb("www.gmail.com");
        addClient.setClientVat("42224");
        addClient.setClientTax("424424");
        addClient.clickSave();*/

    }
}
