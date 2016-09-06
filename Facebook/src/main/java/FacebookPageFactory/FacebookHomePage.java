package FacebookPageFactory;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by rinko on 8/31/2016.
 */
public class FacebookHomePage {


  /*  typeByXpathValue("//*[@id='email']","rinko.ewu@gmail.com");
    typeByXpathValue("//*[@id='pass']","rinko11435");
    clickByXpath("//*[@id='loginbutton']");
    sleepFor(15);*/




    @FindBy(how = How.XPATH, using = "//*[@id='email']")
    public static WebElement userEmail;

    @FindBy(how = How.XPATH, using = "//*[@id='pass']")
    public static WebElement UserPass ;

    @FindBy(how = How.XPATH, using = "//*[@id='pass']")
    public static WebElement SubmitBtn ;


    @FindBy(how = How.ID, using = "u_0_1")
    public static WebElement firstName ;

    @FindBy(how = How.ID, using = "u_0_3")
    public static WebElement lastName ;


    @FindBy(how = How.ID, using = "u_0_5")
    public static WebElement mobileNo ;


    @FindBy(how = How.ID, using = "u_0_8")
    public static WebElement newPassword ;


    @FindBy(how = How.ID, using = "u_0_a")
    public static WebElement mobileNoRe ;


    @FindBy(how = How.ID, using = "month")
    public static WebElement month ;

    @FindBy(how = How.ID, using = "day")
    public static WebElement day ;

    @FindBy(how = How.ID, using = "year")
    public static WebElement year ;

    @FindBy(how = How.ID, using = "u_0_d")
    public static WebElement male ;

    @FindBy(how = How.ID, using = "u_0_d")
    public static WebElement female ;

    @FindBy(how = How.ID, using = "u_0_i")
    public static WebElement btnNewRegSubmit ;


    public void faceBookLogin(String uID, String Pass){
        userEmail.sendKeys(uID);
        UserPass.sendKeys(Pass);
        SubmitBtn.sendKeys(Keys.ENTER);
    }

    public void faceBookReg(String [] RegData){
        //userEmail.sendKeys(uID);
        //UserPass.sendKeys(Pass);

        final Select selectBox = new Select(month);
        selectBox.selectByValue(RegData[4]);


        firstName.sendKeys(RegData[0]);
        lastName.sendKeys(RegData[1]);
        mobileNo.sendKeys(RegData[2]);
        mobileNoRe.sendKeys(RegData[3]);
        month.sendKeys(RegData[4]);
        day.sendKeys(RegData[5]);
        year.sendKeys(RegData[6]);
        male.sendKeys(RegData[7]);
        btnNewRegSubmit.sendKeys(Keys.ENTER);

    }

    public void clearSearchInput(){
        userEmail.clear();
    }
}
