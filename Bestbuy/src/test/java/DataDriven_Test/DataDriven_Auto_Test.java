//package DataDriven_Test;
//
//import Common.Base;
//import FACROTY.SignIn.SignIn;
//import org.openqa.selenium.support.PageFactory;
//import org.testng.annotations.DataProvider;
//import org.testng.annotations.Test;
//import utility.DataReader;
//
//import java.io.IOException;
//
//public class DataDriven_Auto_Test extends Base {
//
//    @Test(dataProvider = "Bestbuy1")
//    public void logIn (String email, String password) throws InterruptedException {
//
//        // PAGE_FACTORY INITIALIZATION
//        SignIn src = PageFactory.initElements(driver, SignIn.class);
//
//        // THIS IS FOR POPUP
//        sleepFor(2);
//        clickByCss(".close");
//
//        // TEST
//        src.signIn(email, password );
//        sleepFor(5);
//
//    }
//
//
////    @DataProvider(name = "Bestbuy1")
////    public Object[][] passData() throws IOException {
////
////        DataReader dataReader = new DataReader();
////
////       // Object[][] data = dataReader.fileReader("A:\\New folder\\Mentoring\\Mentoring_Ahlan_09-09-2016\\Ahlan_Habib_BootCamp\\Bestbuy\\Data\\Acc_Info.xls");
//////        int rows = dataReader.ge
//////        Object [][] data = new Object[3][2];
//////        data [0][0]= "Admin1";
//////        data [0][1]= "Password1";
//////
//////        data [1][0]= "Admin2";
//////        data [1][1]= "Password2";
//////
//////        data [2][0]= "PEOPLETECH@YAHOO.COM";
//////        data [2][1]= "selenium2016";
////        //return data;
////    }
////}