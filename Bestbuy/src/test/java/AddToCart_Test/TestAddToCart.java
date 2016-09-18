package AddToCart_Test;
import FACROTY.AddToCart.AddToCart;
import common.Base;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
public class TestAddToCart extends Base{


    String item = "ipad pro";

    @Test(priority = 8)
    public void TestSignIn() throws InterruptedException {


        // PAGE_FACTORY INITIALIZATION
        AddToCart src = PageFactory.initElements(driver, AddToCart.class);


        // THIS IS FOR POPUP
        sleepFor(2);            // THIS IS FOR POPUP
        clickByCss(".close"); // THIS IS FOR POPUP


        // TEST
        src.addToCart(item);

    }
}
