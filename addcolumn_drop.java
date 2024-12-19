import java.sql.*;
import java.util.*;

class addcolumn_drop
{
 public static void main(String arg[])throws Exception
 {
   try{
        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        Connection con=DriverManager.getConnection("Jdbc:Odbc:cdj");
        Statement st=con.createStatement();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter table name:");
        String tbn=sc.next();
        System.out.println("Enter cloumn name:");
        String cln=sc.next();
        System.out.println("Enter datatype:");
        String dt=sc.next();
     st.executeUpdate("alter table "+tbn+" add column "+cln+" "+dt+"");
        System.out.println("column added...");
        System.out.println("Enetr table name to drop:");
        String tbn1=sc.next();
      st.executeUpdate("drop table "+tbn1+"");
        System.out.println("table drop...");
   }catch(Exception e)
  {
        System.out.println(e);   
 }
 }
}