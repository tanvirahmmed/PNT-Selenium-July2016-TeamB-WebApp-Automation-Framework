package Searchs;
import Common.Base;
import FromDatabaseAndFactory.DBFactory;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import utility.ConnectMySqlDB;

import java.util.List;
public class Test_FromDataBase extends Base {

    @Test (priority = 2)
    public void searchUsingDB() throws Exception {
        sleepFor(3);
        clickByCss(".close");

        DBFactory search = PageFactory.initElements(driver, DBFactory.class);
        ConnectMySqlDB THREEConnectMySqlDB = new ConnectMySqlDB();

        //Creating a variable that reads data and stores as lists
        List<String> values = THREEConnectMySqlDB.readDataBase("Search", "items");

        for(String readOneByOne:values) {
            search.searchFor(readOneByOne);
            sleepFor(2);
            search.clearSearchInput();
        }
    }
}