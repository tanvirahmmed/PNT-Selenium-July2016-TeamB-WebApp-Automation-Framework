package Login_Test;
import Factory.Login.Login;
import common.Base;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
public class Login_Test extends Base{

    String email = "PEOPLETECH@YAHOO.COM";
    String password = "selenium2016";

    @Test
    public void TestSignIn() throws InterruptedException {
        // PAGE_FACTORY INITIALIZATION
        Login src = PageFactory.initElements(driver, Login.class);
        // TEST
        src.signIn(email, password );
    }
}