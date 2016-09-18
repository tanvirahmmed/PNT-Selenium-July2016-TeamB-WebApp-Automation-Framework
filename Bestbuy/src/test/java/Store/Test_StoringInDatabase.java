package Store;
import Common.Base;
import StoreInDB.StoreInDatabase;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import utility.ConnectMySqlDB;

public class Test_StoringInDatabase extends Base {

//    @Test(priority = 3)
//    public void storeDataInDB() throws Exception {
//
//        //Making Objects of "StoreInDatabase"
//        StoreInDatabase search = PageFactory.initElements(driver, StoreInDatabase.class);
//        //Making Objects of "ConnectMySqlDB"
//        ConnectMySqlDB THREEConnectMySqlDB = new ConnectMySqlDB();
//
//        //Getting Method from factory
//        search.searchFor("Laptop");
//        sleepFor(5);
//
//        THREEConnectMySqlDB.InsertDataFromWebelementListToMySql(StoreInDatabase.allSKU, "amazon", "items");
//    }


    @Test(priority = 7)
    public void storeDataInDB() throws Exception {
        sleepFor(5);
        clickByCss(".close");


        StoreInDatabase src = PageFactory.initElements(driver, StoreInDatabase.class);
        ConnectMySqlDB connectMySqlDB = new ConnectMySqlDB();

        src.searchFor("Laptop");
        sleepFor(5);

        connectMySqlDB.InsertDataFromWebelementListToMySql(StoreInDatabase.allmodel, "bestbuy", "items" );

    }
}
