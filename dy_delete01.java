import java.sql.*;
import java.util.*;

class dy_delete01
{
  public static void main(String arg[])throws Exception 
  {
    Scanner sc=new Scanner(System.in);
    try{
           Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
           Connection con=DriverManager.getConnection("Jdbc:Odbc:cdj");
           PreparedStatement ps=con.prepareStatement("delete from student where rno=? ");
              System.out.println("Enter roll no to delete record:");
              int rno=sc.nextInt();
             ps.setInt(1,rno);
             ps.executeUpdate();
             System.out.println("Record deleted....."+rno);
          }catch(Exception e)
          {
             System.out.println(e);
           }
  }
}