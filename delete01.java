import java.sql.*;
import java.util.*;

class delete01
{
  public static void main(String arg[])throws Exception
  {
    Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
    Connection con=DriverManager.getConnection("Jdbc:Odbc:cdj");
    Statement st=con.createStatement();
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter roll no to delete record:");
    int rno=sc.nextInt();
    int k=st.executeUpdate("delete from student where rno="+rno);
    if(k>=1)
     System.out.println("Record deleted.....");
    st.close();
    con.close(); 
  }
}