import java.sql.*;

class count01
{
 public static void main(String arg[])throws Exception
 {
   //int cnt=0;
   Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
   Connection con=DriverManager.getConnection("Jdbc:Odbc:cdj");
   Statement st=con.createStatement();
   ResultSet rs=st.executeQuery("select  count(*) from student");
    while(rs.next())
   {
    System.out.println("Count="+rs.getInt(1));
   }
 rs.close();
 st.close();
 con.close();
 }
}