package Airport_GUI;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSetMetaData;
import java.sql.ResultSet;
import java.sql.Statement;
import splashscreen.SplashScreen;
public class Conn 
{
    static Statement stmt;
    static Connection connection;
    
    public static void main(String[] args) {
            String connectionString = "jdbc:sqlserver://localhost:1433;databaseName=project_database;user=ashraf;password=ashraf;encrypt=true;trustServerCertificate=true";
            try{
                connection =DriverManager.getConnection(connectionString);
                    System.out.println("connection establish");
                    stmt = connection.createStatement();
                    new Login().setVisible(true);

//                    new Employees().setVisible(true);
                // Execute a SELECT query and get the result set
//                ResultSet rs = stmt.executeQuery("SELECT * FROM employees");
//
//                // Get the ResultSetMetaData. This will be used for column names
//                ResultSetMetaData rsmd = rs.getMetaData();
//                int columnCount = rsmd.getColumnCount();
//
//                // Iterate through the result set and print the data
//                while (rs.next()) {
//                    for (int i = 1; i <= columnCount; i++ ) {
//                        String name = rsmd.getColumnName(i);
//                        String value = rs.getString(i);
//                        System.out.println(name + ": " + value);
//                    }
//                    System.out.println("-------------------");
//                }
//
//                // Close the result set
//                rs.close();
//
//                // Close the statement
//                stmt.close();

                }
            catch (SQLException e){
                System.out.println("error connection ");
                e.printStackTrace();}
    }
//    public static void insert(String Table,String[] values)
//    {
//        
//    }
}
    
