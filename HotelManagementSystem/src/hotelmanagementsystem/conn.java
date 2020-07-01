
package hotelmanagementsystem;
import java.sql.*;
/**
 *
 * @author Pranav
 */
public class conn {
    
    Connection c;
    Statement s;
    
    public conn(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql:///hotelproject" , "root" , "");
            s = c.createStatement();
            
        }catch(Exception ae){
            ae.printStackTrace();
        }
    }
    
    
}
