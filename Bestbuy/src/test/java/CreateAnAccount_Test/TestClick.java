package CreateAnAccount_Test;

import Test_Factory.Factory_Test;
import common.Base;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestClick extends Base {

    @Test(priority = 3)
    public void testClick() throws InterruptedException {
        Factory_Test factory_test = PageFactory.initElements(driver, Factory_Test.class);

        sleepFor(2);
        clickByCss(".close");

        factory_test.justClick();
    }
}
