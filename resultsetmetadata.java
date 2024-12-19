import java.sql.*;

class resultsetmetadata
{
 public static void main(String arg[])throws Exception
 {
   Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
   Connection con=DriverManager.getConnection("Jdbc:Odbc:cdj");
   Statement st=con.createStatement();
   ResultSet rs=st.executeQuery("select * from student");
   ResultSetMetaData rm=rs.getMetaData();
   int col=rm.getColumnCount();
  System.out.println("Number of column="+col);
  for(int i=1;i<=col;i++)
  {
   System.out.println("column name="+rm.getColumnName(i));
  System.out.println("column type="+rm.getColumnTypeName(i));
  System.out.println("column size="+rm.getColumnDisplaySize(i));
  }
 rs.close();
 st.close();
 con.close();
 }
}