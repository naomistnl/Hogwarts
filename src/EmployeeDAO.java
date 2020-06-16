
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class EmployeeDAO {

    //code to connect to DB
    public static Connection accessDB() {
        Connection conn = null;
        String url = "jdbc:sqlite:/users/naomi/Hogwarts.db";

        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }
        //pull all info from DB and print to console
    public static void queryDB() {
        String sql = "SELECT EmpName, Gender, DOB, Address, Postcode, EmployeeNumber, Department, StartDate, Salary, Email FROM Employee";

        try {
            try (Connection conn = EmployeeDAO.accessDB();
                 Statement stmt = conn.createStatement();
                 ResultSet rs = stmt.executeQuery(sql)) {

                while (rs.next()) {
                    System.out.println(rs.getString("EmpName") + "\t" +
                            rs.getString("Gender") + "\t" +
                            rs.getInt("DOB") + "\t" +
                            rs.getString("Address") + "\t" +
                            rs.getString("Postcode") + "\t" +
                            rs.getInt("EmployeeNumber") + "\t" +
                            rs.getString("Department") + "\t" +
                            rs.getInt("StartDate") + "\t" +
                            rs.getInt("Salary") + "\t" +
                            rs.getString("Email"));
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

}




