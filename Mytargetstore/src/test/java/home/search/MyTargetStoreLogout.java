package home.search;

import CommonMethods.CommonMyTargetMethods;

/**
 * Created by rinko on 9/2/2016.
 */
public class MyTargetStoreLogout extends CommonMyTargetMethods {


    @org.testng.annotations.Test
    public void myTargetStoreLogOut() throws Exception {
        //initialize Search page factory
        //List<String> dataList = new ArrayList<String>();

        // ConnectMySqlDB conn = new ConnectMySqlDB();
        // dataList =  conn.readDataBase("tbl_test_module_login_access","ModuleName");  //conn.readDataBase("tbl_test_module_login_access","ModuleName");

       // TargetHomePage targetLogin =  PageFactory.initElements(driver, TargetHomePage.class); //new UserLoginPage();
       // targetLogin.myTargetLogin("rinko.ewu@gmail.com","Rinko321");
       // sleepFor(10);
       //targetLogin.myTargetLogOut();
       // sleepFor(50);

        MemberLogin();
        MemberLogOut();

    }
}
