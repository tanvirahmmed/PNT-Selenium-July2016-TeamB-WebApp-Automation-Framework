package CommonMethods;

import common.Base;
import utility.ConnectMySqlDB;

import java.io.IOException;
import java.sql.*;

/**
 * Created by rinko on 9/2/2016.
 */
public class CommonMyTargetMethods extends Base {

    public boolean isAlreadyLogIn = false;
    public ResultSet rs = null;
    Connection connect = null;
    Statement statement = null;
    PreparedStatement ps = null;
    ResultSet resultSet = null;

    public void MemberLogin() throws Exception {

        String[] userCre = loginCredential(); // To get the module login details

        if (!isAlreadyLogIn) {
            clickByXpath("//*[@id='js-toggleRightNavLg']");
            sleepFor(2);
            clickByXpath("//*[@id='rightNav-signIn']");
            sleepFor(2);
            typeByXpath("//*[@id='logonIdSide']", userCre[0]);
            sleepFor(2);
            typeByXpath("//*[@id='logonPasswordSide']", userCre[1]);
            sleepFor(2);
            clickByXpath("//*[@id='signin-btn']");
            sleepFor(2);
            isAlreadyLogIn = true;
        }

    }


    public void MemberLogOut() throws InterruptedException {


        if (isAlreadyLogIn) {
            clickByXpath("//*[@id='js-toggleRightNavLg']");
            clickByXpath("//*[@id='guest-sign-out']");
            sleepFor(20);
        }
    }


    public String[] loginCredential() throws SQLException, IOException, ClassNotFoundException {
        ConnectMySqlDB objMySqlObj = new ConnectMySqlDB();


     //   ConnectMySqlDB objData = new ConnectMySqlDB();

        //objData.c

        String LoginId = "";
        String LoginPass = "";
        String[] loginCre = {"test1", "test1"};
        connect = objMySqlObj.connectToDatabase2();
        statement = connect.createStatement();
        // statement = connect.createStatement();
        resultSet = statement.executeQuery("select * from tbl_test_module_login_access where ModuleName = 'Target'");


        if (resultSet.next()) {
            loginCre[0] = resultSet.getString(3);
            loginCre[1] = resultSet.getString(4);

        }
        return loginCre;
    }


    public String[] getRegistrationTestData() throws SQLException, IOException, ClassNotFoundException {
        ConnectMySqlDB objMySqlObj = new ConnectMySqlDB();
        String LoginId = "";
        String LoginPass = "";
        String[] loginCre = {"FirstName", "LastName", "EmailID@gmail.com", "Rinko321"};
        connect = objMySqlObj.connectToDatabase2();
        statement = connect.createStatement();
        // statement = connect.createStatement();
        resultSet = statement.executeQuery("select * from tbl_registration_test_data limit 0,1");


        if (resultSet.next()) {
            loginCre[0] = resultSet.getString(2);
            loginCre[1] = resultSet.getString(3);
            loginCre[2] = resultSet.getString(4);
            loginCre[3] = resultSet.getString(5);

        }
        return loginCre;
    }

}
