package InfoSearch;

import utility.DataReader;

import java.io.IOException;

/**
 * Created by AFMErshadul on 9/8/2016.
 */
public class ServicesToBeSearched {
    DataReader dr = new DataReader();
    public String [] getData()throws IOException {
        String path = System.getProperty("user.dir")+"C:\\Users\\AFMErshadul\\IdeaProjects\\PNT-Selenium-July2016-TeamB-WebApp-Automation-Framework\\TDBank\\data2\\file1.xls";
        String [] st = dr.fileReader(path);
        return st;
    }
}
