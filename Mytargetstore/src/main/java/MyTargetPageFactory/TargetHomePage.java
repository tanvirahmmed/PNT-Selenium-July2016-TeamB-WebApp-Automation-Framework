package MyTargetPageFactory;

import common.Base;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by rinko on 9/1/2016.
 */
public class TargetHomePage extends Base {


    @FindBy(how = How.ID, using = "searchLabel")
    public static WebElement HomePageSearchBox;

    @FindBy(how = How.ID, using = "search")
    public static WebElement HomePageSearchBoxId;

    @FindBy(how = How.XPATH, using = "//*[@id='js-toggleRightNavLg']")
    public static WebElement MyAccountLinko;



    @FindBy(how = How.XPATH, using = "//*[@id='rightNav-signIn']")
    public static WebElement LoginLink;
    @FindBy(how=How.XPATH, using = "//*[@id='logonIdSide']")
    public static WebElement UserId;

    @FindBy(how=How.XPATH, using = "//*[@id='logonPasswordSide']")
    public static WebElement UserPass;

    @FindBy(how=How.XPATH, using = "//*[@id='signin-btn']")
    public static WebElement LoginBtn;




    @FindBy(how = How.XPATH, using = "//*[@id='js-toggleRightNavLg']")
    public static WebElement MyAccountSignOutLink;

    @FindBy(how = How.XPATH, using = ".//*[@id='guest-sign-out']")
    public static WebElement MyAccountSignOut;

    @FindBy(how = How.ID, using = "rightNav-createAccount")
    public static WebElement createAccountLink;


    @FindBy(how = How.ID, using = "newEmailSide")
    public static WebElement Email;

    @FindBy(how = How.ID, using = "firstNameSide")
    public static WebElement firstName;

    @FindBy(how = How.ID, using = "lastNameSide")
    public static WebElement lastName;

    @FindBy(how = How.CSS, using = "js-adaptiveInput.js-newAccLogonPassword")
    public static WebElement logonPassword;


    @FindBy(how=How.XPATH, using = "//*[@id='guest-registration-form']/div[6]/button")
    public static WebElement regBtn;



// Method to user for basic search

    public void myTargetStoreBasicSearch(String SearchKeyword){
        HomePageSearchBox.sendKeys(SearchKeyword,Keys.ENTER);

    }


    public void myTargetLogin(String userID, String userPass)
    {
        MyAccountLinko.click();;
        LoginLink.click();
        UserId.sendKeys(userID);
        UserPass.sendKeys(userPass);
        LoginBtn.click();
    }

    // Methods for registration

    public void myTargetReq(String [] loginData) throws InterruptedException {
        MyAccountLinko.click();
        sleepFor(2);
        createAccountLink.click();
        sleepFor(2);
        Email.sendKeys(loginData[0]);
        sleepFor(2);
        firstName.sendKeys(loginData[1]);
        sleepFor(2);
        lastName.sendKeys(loginData[2]);
        sleepFor(2);
        typeByCss(".js-adaptiveInput.js-newAccLogonPassword",loginData[3]);
        sleepFor(2);
        regBtn.click();
    }

    public void clearSearchInput(){
        HomePageSearchBoxId.clear();
    }




}
