import java.sql.*;

class PrintData{
    public static void main(String[] args){

        //including driver

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }
        catch(Exception e){
            e.getStackTrace();
        }

        // jdbc url

        String url = "jdbc:mysql://localhost:3306/mysql";

        String sql = "SELECT * FROM STUDENT.STUDENT";

        try{
            Connection con = DriverManager.getConnection(url,"root","");
             Statement statement = con.createStatement();

             ResultSet result = statement.executeQuery(sql);


             //processing the data;

             

             while(result.next()){
                int roll = result.getInt("roll");
                String name = result.getString("name");
                int marks = result.getInt("marks");

                System.out.println(roll + "     "+ name + "     "+marks);

             }
             
        }
        catch(Exception e){

        }
       

    }
}