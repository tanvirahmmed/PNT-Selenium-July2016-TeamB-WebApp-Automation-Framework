package searchItems;


import methods.CommonMethods;
import org.testng.annotations.Test;

/**
 * Created by AFMErshadul on 9/1/2016.
 */
public class AddToList extends CommonMethods {
    //Test-10: add things to the cart from today's deal
    @Test(priority = 4)
    public void addToCart() throws InterruptedException{

        clickByXpath(".//*[@id='nav-xshop']/a[2]");
        sleepFor(2);
        clickByXpath(".//*[@id='widgetFilters']/div[1]/div/span[8]/div/label/input");
        sleepFor(2);
        scrollDown();
        scrollUp();
        sleepFor(2);
        clickByXpath(".//*[@id='widgetFilters']/div[1]/div/span[8]/div/label/input");
        sleepFor(2);
        clickByXpath(".//*[@id='100_dealView_3']/div/div[2]/div/div[5]/div/span/span/span/a");
        sleepFor(2);
        clickByXpath(".//*[@id='add-to-wishlist-button-submit']");
        //clickByCss(".nav-cart-icon.nav-sprite");
        sleepFor(2);
    }
}
