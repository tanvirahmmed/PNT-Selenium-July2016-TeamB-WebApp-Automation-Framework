package home.search;

import CommonMethods.CommonMyTargetMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

/**
 * Created by rinko on 9/2/2016.
 */
public class MyTargetAddToCart extends CommonMyTargetMethods {

    @Test
    public void myTargetAccountAddToCart() throws Exception {
        MemberLogin();
        driver.findElement(By.xpath("//*[@id='search']")).sendKeys("beats solo 2 wireless", Keys.ENTER);
          clickByCss(".btn.btn-primary.btn-sm.flip-active.clearfix.flip-plp-cart-btn.test-addToCartButton");
           sleepFor(2);
           clickByXpath("//*[@id='AddToCartAreaId']/div[1]/div/button");
           sleepFor(2);
          clickByXpath("//*[@id='block-ATC']/div[2]/div/div[2]/div/div[1]/div[2]/button");
        sleepFor(5);

    }



}
