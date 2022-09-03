package stepdefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utilities.DBUtils;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
public class DBStepDefs {
    @Given("user connects to the database")
    public void user_connects_to_the_database() {
        DBUtils.createConnection();//Using create connection method from util
    }
    @Given("user gets {string} from {string} table")
    public void user_gets_from_table(String column, String table) {
//        SELECT * FROM tp_customer;
        String query = "select "+column+" from "+table;
//        executing the query we are going customer table
        DBUtils.executeQuery(query);
    }
    @Given("user reads all the {string} column data")
    public void user_reads_all_the_column_data(String column) throws SQLException {
// go to the next row 1st column has no data
        DBUtils.getResultset().next();
//      Now currently we are in the first row, this method will return only first data
        Object columnData1 =  DBUtils.getResultset().getObject(column);
        System.out.println(columnData1);
//      go to 2nd row
        DBUtils.getResultset().next(); // we are on the row 2 now
        Object columnData2 =  DBUtils.getResultset().getObject(column);
        System.out.println(columnData2);
//      Iterate ssn
        while (DBUtils.getResultset().next()){//keeps going next line if there is data in the next line
            Object nextColumnData = DBUtils.getResultset().getObject(column);
            System.out.println(nextColumnData);
        }
    }
    @Then("verify {string} table {string} column contains {string}")
    public void verify_table_column_contains(String table, String column, String data) {
//        1.get all the column data
//        table = jhi_user
//        column = login
//        data = murtaza
//
//        DBUtils.getColumnData("select * from jhi_user","login");
        List<Object> allColumnData =  DBUtils.getColumnData("select * from "+table,column);
        System.out.println(allColumnData);
        Assert.assertTrue(allColumnData.contains(data));
//    List<Object> expectedData = new ArrayList<>();
//    expectedData.add(data);
//
//    Assert.assertTrue(allColumnData.containsAll(expectedData));
    }
    @Then("read the row count of {string} table")
    public void read_the_row_count_of_table(String table) throws Exception {
        int rowCount = DBUtils.getRowCount();
        System.out.println(table+" row count: " + rowCount);
    }
    @Then("read the column names of {string} table")
    public void read_the_column_names_of_table(String table) {
        String query = "select * from "+table;
        List<String> allColumnNames = DBUtils.getColumnNames(query);
        System.out.println(allColumnNames);
    }

    @Then("close the database connection")
    public void close_the_database_connection() {
        DBUtils.closeConnection();
    }
}