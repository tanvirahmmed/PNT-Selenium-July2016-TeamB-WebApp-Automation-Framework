package Searchs;
import Common.Base;
import FromExcelAndFactory.FromExcel;
import FromExcelAndFactory.Excel_Factory;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.io.IOException;
public class Test_FromExcel extends Base{

    @Test (priority = 1)
    public void searchUsingExcelFile()throws IOException,InterruptedException{
        //Handling PopUp!
        sleepFor(5);
        clickByCss(".close");

        //Initialize Search Page factory
        Excel_Factory search = PageFactory.initElements(driver, Excel_Factory.class);

        //Read search.data from excel file
        FromExcel itemsToBeSearched = new FromExcel();
        String [] value = itemsToBeSearched.getData();

        for(String read:value) {        // READING DATA 1 BY 1.
            search.searchFor(read);     // SENDING DATA 1 BY 1 TO "EXCEL_FACTORY > SearchFor"
            sleepFor(2);
            search.clearSearchInput(); // CLEARING THE SEARCH FIELD EVERY TIME.
        }
    }
}