import java.sql.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.DriverManager;
//import org.h2.*;
public class hsample{
    public static void main(String[] a)
            throws Exception {      
 

 //DeleteDbFiles.execute("~", "/home/develop4/Documents/newd", true);
Class.forName("org.h2.Driver");
        Connection conn = DriverManager.
            getConnection("jdbc:h2:/home/develop4/Documents/newdb","sa","");
        // add application code here
	if(conn==null)
		{
	
System.out.println("ajitkkuma");	
	}
else
{
System.out.println("ajit");

}
        conn.close();
    }
}
# checkout
