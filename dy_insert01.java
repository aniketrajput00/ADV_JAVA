import java.sql.*;
import java.util.*;

class dy_insert01
{
  public static void main(String arg[])throws Exception 
  {
    Scanner sc=new Scanner(System.in);
    try{
           Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
           Connection con=DriverManager.getConnection("Jdbc:Odbc:cdj");
           PreparedStatement ps=con.prepareStatement("insert into student values(?,?,?)");
            for(int i=1;i<=5;i++)
            {
              System.out.println("Enter roll no:");
              int rno=sc.nextInt();
              System.out.println("Enter name:");
              String s1=sc.next();
              System.out.println("Enter per:");
              float p=sc.nextFloat();
      
             ps.setInt(1,rno);
             ps.setString(2,s1);
             ps.setFloat(3,p);
             ps.executeUpdate();
             System.out.println("Record inserted.....");
            }
          }catch(Exception e)
          {
             System.out.println(e);
           }
  }
}