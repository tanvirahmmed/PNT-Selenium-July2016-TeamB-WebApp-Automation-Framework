package ReadNews_Test;
import Factory.ReadNews.ReadNews;
import common.Base;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
public class ReadNews_Test extends Base {

    String title = "Technology and Science News - ABC News";
    @Test(priority = 5)
    public void TestSignIn() throws InterruptedException {
        // PAGE_FACTORY INITIALIZATION
        ReadNews src = PageFactory.initElements(driver, ReadNews.class);
        // TESTs
        src.readNews(title);
    }
}