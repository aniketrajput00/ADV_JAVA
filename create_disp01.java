import java.sql.*;
import java.util.*;

class insert_disp01
{
  public static void main(String arg[])throws Exception 
  {
    Scanner sc=new Scanner(System.in);
           Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
           Connection con=DriverManager.getConnection("Jdbc:Odbc:cdj");
           Statement st=con.createStatement();
           st.executeUpdate("insert into student values(108,'hari',36)");
              System.out.println("record inserted.....");
             ResultSet rs=st.executeQuery("select * from student");
         while(rs.next())
         {
          System.out.println(rs.getInt(1));
          System.out.println(rs.getString(2));
          System.out.println(rs.getFloat(3));
         }
    rs.close();
    st.close();
    con.close();
  }
}