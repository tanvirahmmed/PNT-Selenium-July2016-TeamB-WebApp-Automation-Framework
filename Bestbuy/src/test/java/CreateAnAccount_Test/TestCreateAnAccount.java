package CreateAnAccount_Test;
import Common.Base;
import FACROTY.CreateAnAccount.CreateAnAccount;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
public class TestCreateAnAccount extends Base {

        String firstName = "PEOPLE";
        String lastName = "TECH";
        String email = "PEOPLETECH@YAHOO.COM";
        String password = "selenium2016";
        String phoneNumber = "0132565897";


    @Test(priority = 4)
    public void testCreateAccount() throws InterruptedException {


        // PAGE_FACTORY INITIALIZATION
        CreateAnAccount src = PageFactory.initElements(driver, CreateAnAccount.class);


        // THIS IS FOR POPUP
        sleepFor(2);            // THIS IS FOR POPUP
        clickByCss(".close"); // THIS IS FOR POPUP


        // TEST
        src.createAccount(firstName,lastName,email,password,phoneNumber);
    }
}