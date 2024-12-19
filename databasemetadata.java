import java.sql.*;

class databasemetadata
{
 public static void main(String arg[])throws Exception
 {
   Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
   Connection con=DriverManager.getConnection("Jdbc:Odbc:cdj");
   DatabaseMetaData dm=con.getMetaData();
   System.out.println("database name="+dm.getDatabaseProductName());
   System.out.println("database driver name="+dm.getDriverName());
   System.out.println("database version="+dm.getDatabaseProductVersion());
   System.out.println("database username="+dm.getUserName());
   System.out.println("database driver version="+dm.getDriverVersion());
 }
}