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

    // Following Page objects for Home page Search by Name

//.//*[@id='u_5_2']/input[1]
    @FindBy(how = How.CSS, using = "._1frb")
    public static WebElement SearchTextClick ;

    @FindBy(how = How.CSS, using = "._1frb")
    public static WebElement SearchTextBox ;

    @FindBy(how = How.CSS, using = "._585_")
    public static WebElement SearchTextButton ;



    @FindBy(how = How.XPATH, using = "//*[@id='u_0_2']/div[1]/div[1]/div/a/span")
    public static WebElement ClickforMyHome ;


    @FindBy(how = How.XPATH, using = "//*[@id='findFriendsNav']")
    public static WebElement FindFriendLink ;


    @FindBy(how = How.CSS, using = "._42ft _4jy0 _4jy3 _4jy1 selected _51sy")
    public static WebElement AddFriendButtoon ;


    public void faceBookSearchByName(String Name)
    {
        SearchTextClick.click();
        SearchTextBox.sendKeys(Name);
        SearchTextButton.click();

    }

    public void AddFriend()
    {
        FindFriendLink.click();
        AddFriendButtoon.click();
        //SearchTextButton.click();
    }


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
