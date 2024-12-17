import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class awt01 extends Frame implements ActionListener
{
 Connection con;
 Statement st;
 Label l1,l2,l3;
 TextField t1,t2,t3;
 Button b1,b2;
 awt01()
 {
   try{ 
          Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
          con=DriverManager.getConnection("Jdbc:Odbc:cdj");
          st=con.createStatement();
         }catch(Exception e){}
          setVisible(true);
          setSize(500,500);
          setLayout(new FlowLayout());
          l1=new Label("Enter roll no:");
          l2=new Label("Enter name:");
          l3=new Label("Enter per:");
          t1=new TextField(10);
          t2=new TextField(10);
          t3=new TextField(10);
          b1=new Button("save");
          b2=new Button("Exit");
           add(l1); add(t1);
           add(l2); add(t2);
           add(l3); add(t3);
           add(b1);add(b2);
           b1.addActionListener(this);
           b2.addActionListener(this);
      }
 public void actionPerformed(ActionEvent ae)
 {
   if(ae.getSource()==b1)
   {
     try{
            int rno=Integer.parseInt(t1.getText());
            String s1=t2.getText();
            float p=Float.parseFloat(t3.getText());
            int k=st.executeUpdate("insert into student values("+rno+",'"+s1+"',"+p+")");
            if(k>=1)
             JOptionPane.showMessageDialog(this,"Record inserted...");
           }catch(Exception e){}
   }
 if(ae.getSource()==b2)
 {
   dispose(); 
 }
 }
public static void main(String arg[])
{
 new awt01();
}
}