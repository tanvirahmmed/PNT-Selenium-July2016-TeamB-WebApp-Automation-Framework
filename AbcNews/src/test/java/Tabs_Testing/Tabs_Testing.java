package Tabs_Testing;
import Factory.Tabs.Tabs;
import common.Base;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
public class Tabs_Testing extends Base {

    @Test
    public void TestSignIn() throws InterruptedException {
        // PAGE_FACTORY INITIALIZATION
        Tabs src = PageFactory.initElements(driver, Tabs.class);
        // TESTs
        src.tabs();
    }
}