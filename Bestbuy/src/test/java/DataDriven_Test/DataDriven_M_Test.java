package DataDriven_Test;
import Common.Base;
import FACROTY.SignIn.SignIn;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDriven_M_Test extends Base{

    // | MANUAL | 2D OBJECT ARRAY |

    @Test(dataProvider = "Bestbuy")
    public void logIn (String email, String password) throws InterruptedException {

        // PAGE_FACTORY INITIALIZATION
        SignIn src = PageFactory.initElements(driver, SignIn.class);

        // THIS IS FOR POPUP
        sleepFor(2);
        clickByCss(".close");

        // TEST
        src.signIn(email, password );
        sleepFor(5);

    }


    @DataProvider(name = "Bestbuy")
    public Object[][] passData() {
        Object [][] data = new Object[3][2];
        data [0][0]= "Admin1";
        data [0][1]= "Password1";

        data [1][0]= "Admin2";
        data [1][1]= "Password2";

        data [2][0]= "PEOPLETECH@YAHOO.COM";
        data [2][1]= "selenium2016";
        return data;
    }
}