package TestSignIn;
import Common.Base;
import FACROTY.SignIn.SignIn;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
public class TestSignIn extends Base{

        //String firstName = "PEOPLE";
        //String lastName = "TECH";
        String email = "PEOPLETECH@YAHOO.COM";
        String password = "selenium2016";
        //String phoneNumber = "0132565897";

    @Test(priority = 6)
    public void TestSignIn() throws InterruptedException {

            // PAGE_FACTORY INITIALIZATION
            SignIn src = PageFactory.initElements(driver, SignIn.class);

            // THIS IS FOR POPUP
            sleepFor(2);            // THIS IS FOR POPUP
            clickByCss(".close"); // THIS IS FOR POPUP

            // TEST
            src.signIn(email, password );
    }
}