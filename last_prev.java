import java.sql.*;

class last_prev
{
  public static void main(String arg[])throws Exception
  {
    Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
    Connection con=DriverManager.getConnection("Jdbc:Odbc:cdj");
    Statement st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
    ResultSet rs=st.executeQuery("select * from student");
    rs.last();
    System.out.println("last student roll no="+rs.getInt(1));
    System.out.println("last student name="+rs.getString(2));
    System.out.println("last student per="+rs.getFloat(3));
    rs.previous();
    System.out.println("secondlast student roll no="+rs.getInt(1));
    System.out.println("secondlast student name="+rs.getString(2));
    System.out.println("secondlast student per="+rs.getFloat(3));
  }
}