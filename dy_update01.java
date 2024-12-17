import java.sql.*;
import java.util.*;

class dy_update01
{
  public static void main(String arg[])throws Exception 
  {
    Scanner sc=new Scanner(System.in);
    try{
           Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
           Connection con=DriverManager.getConnection("Jdbc:Odbc:cdj");
           PreparedStatement ps=con.prepareStatement("update student set name=?,per=? where rno=?");
              System.out.println("Enter roll no to update:");
              int rno=sc.nextInt();
              System.out.println("Enter new name:");
              String s1=sc.next();
              System.out.println("Enter new per:");
              float p=sc.nextFloat();
      
             ps.setString(1,s1);
             ps.setFloat(2,p);
             ps.setInt(3,rno);
             ps.executeUpdate();
             System.out.println("Record updated.....");
          }catch(Exception e)
          {
             System.out.println(e);
           }
  }
}