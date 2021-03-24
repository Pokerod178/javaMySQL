import java.sql.*;

public class Driver {
    public static void main(String[] args){
        try {
            Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "12345");
            Statement myStmt = myConn.createStatement();
            ResultSet myRs = myStmt.executeQuery("SELECT * FROM demo.test");
            while(myRs.next()){
                System.out.println(myRs.getString("number"));
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
