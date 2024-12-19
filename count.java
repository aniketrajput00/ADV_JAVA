import java.sql.*;

class count
{
 public static void main(String arg[])throws Exception
 {
   int cnt=0;
   Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
   Connection con=DriverManager.getConnection("Jdbc:Odbc:cdj");
   Statement st=con.createStatement();
   ResultSet rs=st.executeQuery("select * from student");
   while(rs.next())
   {
    cnt++;
   }
 System.out.println("Count="+cnt);
 rs.close();
 st.close();
 con.close();
 }
}