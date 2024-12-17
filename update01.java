import java.sql.*;
import java.util.*;

class update01
{
  public static void main(String arg[])throws Exception
  {
    Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
    Connection con=DriverManager.getConnection("Jdbc:Odbc:cdj");
    Statement st=con.createStatement();
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter roll no to update record:");
    int rno=sc.nextInt();
    System.out.println("Enter name:");
    String nm=sc.next();
    System.out.println("Enter per:");
    float p=sc.nextFloat();
    int k=st.executeUpdate("update student set name='"+nm+"',per="+p+" where rno="+rno);
    if(k>=1)
     System.out.println("Record updated.....");
    st.close();
    con.close(); 
  }
}