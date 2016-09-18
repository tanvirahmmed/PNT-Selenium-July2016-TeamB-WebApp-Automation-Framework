package FromDatabaseAndFactory;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DBFactory {

    @FindBy(how = How.XPATH, using = ".//*[@id='gh-search-input']")
    public static WebElement searchInput;


    public void searchFor(String item){
        searchInput.sendKeys(item, Keys.ENTER);
    }

    public void clearSearchInput(){
        searchInput.clear();
    }
}
