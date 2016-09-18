package ToExcelAndFactory;
import utility.DataReader;
import java.io.IOException;
public class ToExcel {

    DataReader dr = new DataReader();               // MAKING AND OBJECT OF DataReader();

    public String [] getData()throws IOException {  // METHOD RETURNING AN ARRAY
        String path = "Data/Search_Item.xls";
        String [] st = dr.fileReader(path);         // STORING THE SEARCH ITEMS IN THE ARRAY

        return st;
    }

}
