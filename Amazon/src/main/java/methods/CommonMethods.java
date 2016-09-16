package methods;

import common.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utility.ConnectMySqlDB;
import java.io.IOException;
import java.sql.*;

/**
 * Created by AFMErshadul on 9/7/2016.
 */
public class CommonMethods extends Base {

        public boolean isAlreadyLogIn = false;
        public ResultSet rs = null;
        Connection connect = null;
        Statement statement = null;
        PreparedStatement ps = null;
        ResultSet resultSet = null;

        public void UserLogin() throws Exception {

           // String[] userCre = loginCredential(); // To get the module login details

            if (!isAlreadyLogIn) {
                clickByXpath(".//*[@id='nav-link-yourAccount']/span[2]");
                sleepFor(2);
                typeByXpath(".//*[@id='ap_email']", "nahreen789@gmail.com");
                sleepFor(2);
                typeByXpath(".//*[@id='ap_password']", "0606440");
                sleepFor(2);
                clickByXpath(".//*[@id='signInSubmit']");
                sleepFor(2);
                isAlreadyLogIn = true;
            }

        }


//        public void MemberLogOut() throws InterruptedException {
//
//
//            if (isAlreadyLogIn) {
//                mouseHoverByXpath(".//*[@id='nav-link-yourAccount']/span[2]");
//                clickByXpath(".//*[@id='nav-item-signout']/span");
//                sleepFor(20);
//            }
//        }
//
//
//        public String[] loginCredential() throws SQLException, IOException, ClassNotFoundException {
//            ConnectMySqlDB objMySqlObj = new ConnectMySqlDB();
//
//
//            //   ConnectMySqlDB objData = new ConnectMySqlDB();
//
//            //objData.c
//
//            String LoginId = "";
//            String LoginPass = "";
//            String[] loginCre = {"test1", "test1"};
//            connect = objMySqlObj.connectToDatabase2();
//            statement = connect.createStatement();
//            // statement = connect.createStatement();
//            resultSet = statement.executeQuery("select * from AmazonInfo where ModuleName = 'Amazon'");
//
//
//            if (resultSet.next()) {
//                loginCre[0] = resultSet.getString(3);
//                loginCre[1] = resultSet.getString(4);
//
//            }
//            return loginCre;
//        }



    public void scrollDown() {
        ((JavascriptExecutor) driver).executeScript("scroll(0, 3000)");
    }
    public void scrollUp() {
        ((JavascriptExecutor) driver).executeScript("scroll(0, -3000)");
    }

    public void mouseHoverByXpath(String locator) {
        try {
            WebElement element = driver.findElement(By.xpath(locator));
            Actions action = new Actions(driver);
            action.moveToElement(element).perform();
        } catch (Exception ex) {
            System.out.println("First attempt has been done, This is second try");
            WebElement element = driver.findElement(By.cssSelector(locator));
            Actions action = new Actions(driver);
            action.moveToElement(element).perform();
        }
    }
}
