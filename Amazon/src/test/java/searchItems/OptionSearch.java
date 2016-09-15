package searchItems;

import methods.CommonMethods;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by AFMErshadul on 9/1/2016.
 */
public class OptionSearch extends CommonMethods {
    //Test-11: off to college with screenshot
    @Test(priority = 7)
    public void options() throws InterruptedException, IOException {
        clickByCss(".nav-imageHref");
        sleepFor(2);
        getCurrentPageUrl();
        sleepFor(2);
        sleepFor(3);
    }

    @Test(priority = 8)
    public void career() throws InterruptedException, IOException {
        //Test-12: career search
        scrollDown();
        clickByXpath(".//*[@id='navFooter']/table/tbody/tr/td[1]/ul/li[1]/a");
        sleepFor(2);
        getCurrentPageUrl();
        typeByCssNEnter("#search_typeahead","Finance");
        sleepFor(3);
        navigateBack();

    }
    @Test(priority = 9)
    public void feedBackPositive() throws InterruptedException, IOException {
        //Test-13: Give a feedback on career page (with feedback u can upload)
        scrollDown();
        clickByXpath(".//*[@id='navFooter']/table/tbody/tr/td[1]/ul/li[1]/a");
        sleepFor(2);
        clickByCss("#feedback-modal-link");
        sleepFor(2);
        typeByXpath(".//*[@id='feedback-modal']/div/div/form/div/div[1]/div[2]/div/textarea", "Love this");
        sleepFor(2);
        clickByXpath(".//*[@id='feedback-modal']/div/div/form/div/div[2]/div/div/div/button[2]");
        sleepFor(3);
    }

    @Test(priority = 10)
    public void feedBackNegative() throws InterruptedException, IOException {
////        //Test-14: Give a feedback on career page (without feedback u can't upload)
        scrollDown();
        clickByXpath(".//*[@id='navFooter']/table/tbody/tr/td[1]/ul/li[1]/a");
        sleepFor(2);
        clickByCss("#feedback-modal-link");
        sleepFor(2);
        clickByXpath(".//*[@id='feedback-modal']/div/div/form/div/div[1]/div[2]/div/textarea");
        sleepFor(2);
        clickByXpath(".//*[@id='feedback-modal']/div/div/form/div/div[2]/div/div/div/button[2]");
        sleepFor(5);

    }
    @Test(priority = 11)
    public void currency() throws InterruptedException, IOException {
//       //Test-15: Currency Converter Supported Currencies
        scrollDown();
        clickByXpath(".//*[@id='navFooter']/table/tbody/tr/td[5]/ul/li[7]/a");
        sleepFor(2);
        waitUntilClickAble(By.xpath(".//*[@id='navFooter']/table/tbody/tr/td[5]/ul/li[7]/a"));
        sleepFor(5);
        clickByCss(".bxc-slideButton__title>a");
        sleepFor(5);
    }
    @Test(priority = 12)
    public void shopAllDept() throws InterruptedException, IOException {
        //Test-16: Shop all department
        clickByXpath(".//*[@id='popular-departments-ns_W6BZTZ7R16EYZC9XEMF8_4082_']/div[2]/div/a");
        clickByXpath(".//*[@id='a-page']/div[1]/div/div[1]/div[6]/div/a[14]");
        sleepFor(2);
        typeByXpath(".//*[@id='ap_email']", "nahreen_z@yahoo.com");
        sleepFor(2);
        typeByXpath(".//*[@id='ap_password']", "ferdous0606");
        sleepFor(2);
//        takeEnterKeys(".//*[@id='signInSubmit']");
        clickByXpath(".//*[@id='signInSubmit']");
        sleepFor(2);
    }


    @Test(priority = 13)
    public void stateBrows() throws InterruptedException, IOException {
//        //Test-17: browsing different state amazon site(ex-United Kingdom)
        scrollDown();
        clickByXpath(".//*[@id='navFooter']/div[3]/ul/li[12]/a");
        sleepFor(2);
        takeScreenShot();
        sleepFor(3);
    }
    //Test-6: Searing Iphone & come back
    @Test
    public void SearchIphone() throws InterruptedException{
        clickByCss("#searchDropdownBox");
        sleepFor(3);
        scrollDown();
        sleepFor(3);
        mouseHoverByCSS(".nav-search-scope.nav-sprite.nav-focus");
        //navigateRefresh();
        sleepFor(5);
        navigateBack();
        navigateForward();
        sleepFor(5);
    }
    public void searchItems() throws InterruptedException {
    //Test-7: searching for laptop from search button
    typeByCss("#twotabsearchtextbox", "Laptop");
    sleepFor(5);
    clickByCss(".nav-input");
    clickByXpath(".//*[@id='result_1']/div/div[2]/div/div/div/div/a/div/div/span");
    sleepFor(5);
    navigateBack();
    //scrollToElementByxpath(".//*[@id='nav-link-shopall']/span[2]");
    sleepFor(2);

}

    //    @Test(priority = 16)
    public void wishList() throws InterruptedException {
        //Test-9: searching from wishlist
        clickByXpath(".//*[@id='nav-link-wishlist']/span[2]");
        sleepFor(2);
        clickByXpath(".//*[@id='nav-subnav']/a[2]/span");
        clickByXpath(".//*[@id='gift-query-builder']/div[1]/div[1]/div/div[2]/div/div[3]/span/a/div[2]/span");
        sleepFor(2);
        clickByXpath(".//*[@id='landing-asins']/div/div[1]/div[4]/div/a/span");
        sleepFor(2);
        clickByXpath(".//*[@id='add-to-wishlist-button-submit']");
        sleepFor(5);

    }
    @Test(priority = 17)
    public void music() throws InterruptedException {
        //Test-37: music store of amazon
        clickByXpath(".//*[@id='popular-departments-ns_1N7BPVRANPB0KG8ZW08F_603_']/div[1]/div/div/div/div/div[2]/div[1]/div/a/img");
        clickByXpath(".//*[@id='anonCarousel1']/ol/li[3]/div[1]/a/span");
        clickByXpath(".//*[@id='dm_atcb_B01JID9FPA-announce']");
        sleepFor(3);

    }
}



