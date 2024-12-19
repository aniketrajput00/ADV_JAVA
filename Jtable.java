import javax.swing.*;

public class Jtable extends JFrame
{
  JTable tb;
  Jtable()
  {
    setVisible(true);
    setSize(500,500);
    setLayout(null);
    String cols[]={"rno","name","per"};
    String data[][]={{"101","sai","65.44"},{"102","ram","65.55"},{"103","sham","75.88"}};
    tb=new JTable(data,cols);
    JScrollPane jsp=new JScrollPane(tb);
    jsp.setBounds(50,100,400,200);
   add(jsp); 
  }
public static void main(String arg[])
{
 new Jtable();
}
}