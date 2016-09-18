package utility;

import org.openqa.selenium.WebElement;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

/**
 * Created by rrt on 8/21/2016.
 */

public class ConnectMySqlDB {


    Connection connect = null;
    Statement statement = null;
    PreparedStatement ps = null;
    ResultSet resultSet = null;

    public static Properties loadProperties() throws IOException {
        Properties prop = new Properties();
        InputStream ism = new FileInputStream("C:\\Users\\rinko\\IdeaProjects\\Team-B-FrameworkAutomation\\Team-B-FrameworkAutomation\\Generic\\src\\MySql.properties"); //FileInputStream("src\\MySql.properties");
        prop.load(ism);
        ism.close();

        return prop;
    }
    public void connectToDatabase() throws IOException, SQLException, ClassNotFoundException {
        Properties prop = loadProperties();
        String driverClass = prop.getProperty("MYSQLJDBC.driver");
        String url = prop.getProperty("MYSQLJDBC.url");
        String userName = prop.getProperty("MYSQLJDBC.userName");
        String password = prop.getProperty("MYSQLJDBC.password");
        Class.forName(driverClass);
        connect = DriverManager.getConnection(url,userName,password);
        System.out.println("Database is connected");

    }

    public List<String> readDataBase(String tableName, String columnName)throws Exception{
        List<String> data = new ArrayList<String>();

        try {
            connectToDatabase();
            statement = connect.createStatement();
            resultSet = statement.executeQuery("select * from " + tableName);
            data = getResultSetData(resultSet, columnName);

        } catch (ClassNotFoundException e) {
            throw e;
        }finally{
            close();
        }
        return data;
    }


    private void close() {
        try{
            if(resultSet != null){
                resultSet.close();
            }
            if(statement != null){
                statement.close();
            }
            if(connect != null){
                connect.close();
            }
        }catch(Exception e){

        }
    }
    private List<String> getResultSetData(ResultSet resultSet2,String columnName) throws SQLException {
        List<String> dataList = new ArrayList<String>();
        while(resultSet.next()){
            String itemName = resultSet.getString(columnName);
            dataList.add(itemName);
        }
        return dataList;
    }

    //
    public ResultSet executeMySQLSelectQuery(String Query)throws Exception{

        try {
            connectToDatabase();
            statement = connect.createStatement();
            resultSet = statement.executeQuery(Query);
            //data = getResultSetData(resultSet, columnName);
            // return resultSet;
            if (resultSet.next()) {//get first result
                String DaTa = resultSet.getString(2);//coloumn 1
                System.out.println(DaTa);
            }

        } catch (ClassNotFoundException e) {
            throw e;
        }finally{
            close();
        }
        return resultSet;
    }

    public void InsertDataFromWebelementListToMySql(List<WebElement> list, String tableName, String columnName){
        //InsertDataFromArryListToMySql //  public void InsertDataFromArryToMySql()
        try {
            connectToDatabase();

            //  connect.createStatement("INSERT into tbl_insertionSort set SortingNumbers=1000");

            for (int i = 0; i <list.size() ; i++) {
                // System.out.println(st);

                ps = connect.prepareStatement("INSERT INTO " +tableName+ " VALUES('"  +list.get(i).getText()+  " ') ");
                //ps.setObject(1,st);
                ps.executeUpdate();
                //System.out.println(list[n]);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        //connection = ConnectionConfiguration.getConnection();
    }
    public Connection connectToDatabase2() throws IOException, SQLException, ClassNotFoundException {
        Properties prop = loadProperties();
        String driverClass = prop.getProperty("MYSQLJDBC.driver");
        String url = prop.getProperty("MYSQLJDBC.url");
        String userName = prop.getProperty("MYSQLJDBC.userName");
        String password = prop.getProperty("MYSQLJDBC.password");
        Class.forName(driverClass);
        connect = DriverManager.getConnection(url,userName,password);
        //  System.out.println("Database is connected");
        return connect;
    }
}