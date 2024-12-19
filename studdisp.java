import java.sql.*;
import java.util.*;

class studdisp
{
 public static void main(String arg[])throws Exception
 {
   Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
   Connection con=DriverManager.getConnection("Jdbc:Odbc:cdj");
   Statement st=con.createStatement();
   Scanner sc=new Scanner(System.in);
  System.out.println("Enter roll no to search:");
   int rno=sc.nextInt();
  ResultSet rs=st.executeQuery("select * from student where rno="+rno);
 if(rs.next())
 {
   //System.out.println("student roll no="rs.getInt(1));
   System.out.println(" student name="+rs.getString(2));
   System.out.println("student per="+rs.getFloat(3));
 } 
else
{
 System.out.println("Record not found...");
}
}
}