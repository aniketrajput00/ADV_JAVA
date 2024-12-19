import java.sql.*;
class insertdemo
{
    public static void main(String arg[])throws Exception
    {
        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        Connection con=DriverManager.getConnection("Jdbc:Odbc:cdj");
        Statement st=con.createStatement();
        int k=st.executeUpdate("insert into student values(102,'shri',89)");
        if(k>=1)
            System.out.println("Record insert Successfully");

        st.close();
        con.close();
    }
}