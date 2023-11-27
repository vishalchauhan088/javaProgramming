import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateDatabase {
    public static void main(String[] args) {
        // JDBC URL for MySQL in XAMPP
        try{
             Class.forName("com.mysql.cj.jdbc.Driver");
        }
        catch(Exception e){
            e.getMessage();
        }
       

        String jdbcUrl = "jdbc:mysql://localhost:3306/mysql"; // mysql is the default system database

        // Database credentials (default username is 'root' with no password)
        String username = "root";
        String password = "";

        // SQL query to create a new database
        String sql = "CREATE DATABASE new_database"; // Change 'my_new_database' to your desired name

        try (Connection connection = DriverManager.getConnection(jdbcUrl, username, password);
             Statement statement = connection.createStatement()) {

            // Execute the SQL query to create the database
            statement.executeUpdate(sql);
            System.out.println("Database created successfully!");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
