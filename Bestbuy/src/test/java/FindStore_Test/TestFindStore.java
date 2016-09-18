package FindStore_Test;
import FACROTY.FineStore.FindStore;
import common.Base;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
public class TestFindStore extends Base {


    String zipcode = "90020";

    @Test(priority = 5)
    public void findStore() throws InterruptedException {
        sleepFor(2);
        clickByCss(".close");

        FindStore fs = PageFactory.initElements(driver, FindStore.class);
        fs.findStore(zipcode);
    }
}