import java.util.*;
class A extends Thread
{
  String msg;
  int n;
  A(String msg,int n)
  {
     this.msg=msg;
     this.n=n;
     start();
  }
  public void run()
  {
    for(int i=0;i<n;i++)
   {
     try{
             sleep(2000);
             System.out.println("msg="+msg);
           }catch(Exception e){}
   }
  }
}
public class msgN
{
 public static void main(String arg[])
 {
   A ob1=new A("jay",5);
   A ob2=new A("shri",3);
   A ob3=new A("ram",2);
 }
}