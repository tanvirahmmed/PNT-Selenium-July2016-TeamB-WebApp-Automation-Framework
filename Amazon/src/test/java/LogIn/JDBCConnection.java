package LogIn;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.sql.*;

/**
 * Created by AFMErshadul on 9/6/2016.
 */
public class JDBCConnection {


    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Connection connect = DriverManager.getConnection("jdbc:mysql://202.168.254.25/teambtestdb", "teamb", "teamb321");
        Statement st = connect.createStatement();
        ResultSet RS = st.executeQuery("select * from UserInfo where Name = 'Shakir'");
        while (RS.next()) {
            System.setProperty("webdriver.chrome.driver", "C:\\supporting_exe\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.amazon.com/ap/signin?_encoding=UTF8&openid.assoc_handle=usflex&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2F%3Fref_%3Dnav_ya_signin");
            driver.findElement(By.xpath(".//*[@id='ap_email']")).sendKeys(RS.getString("Email"));
            driver.findElement(By.xpath(".//*[@id='ap_password']")).sendKeys(RS.getString("Password"));
//            System.out.println(RS.getString("Name"));
//            System.out.println(RS.getString("Email"));
//            System.out.println(RS.getString("Password"));

        }

    }
}

//    public static void main(String[] args) throws SQLException, ClassNotFoundException {
//        Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/qadbt", "Nahreen", "Nahreen0606440");
//        Statement statement = connect.createStatement();
//        ResultSet result = statement.executeQuery("select * from EmployeeInfo where name='Ahlan'");
//        //System.setProperty("webdriver.chrome.driver", "C:\\supporting_exe\\chromedriver.exe");
//        while (result.next()) {
//            System.out.println(result.getString("Location"));
//        }
//        connect.close();
//    }
//}