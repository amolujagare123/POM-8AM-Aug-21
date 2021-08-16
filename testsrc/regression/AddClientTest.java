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
        addClient.setClientName("amol");
        addClient.setClientSurname("ujagare");
        addClient.setClientAdd1("xyz");
        addClient.setClientAdd2("pqr");
        addClient.setClientCity("pune");
        addClient.clickSave();

    }
}
