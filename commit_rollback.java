import java.sql.*;
import java.util.*;

class commit_rollback
{
 public static void main(String arg[])throws Exception
 {
   Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
   Connection con=DriverManager.getConnection("Jdbc:Odbc:cdj");
   con.setAutoCommit(false);
   Statement st=con.createStatement();
   Scanner sc=new Scanner(System.in);
   System.out.println("Enetr roll no to delete:");
   int rno=sc.nextInt();
   int k=st.executeUpdate("delete from student where rno="+rno);
   System.out.println("record deleted....");
   System.out.println("are you sure? yes/no:");
   String s1=sc.next();
   if(s1.equals("yes"))
   {
     con.commit();
    System.out.println("record is deleted....");
   }
  else
  {
    con.rollback();
    System.out.println("record is rollback....");
  }
 st.close();
 con.close();
 }
}
