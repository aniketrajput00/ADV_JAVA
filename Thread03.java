
class A extends Thread
{
 public void run()
 {
   for(int i=1;i<=5;i++)
   {
     System.out.println("Value="+i);
   }
 }
}

public class Thread03
{
 public static void main(String arg[])
 {
   A ob=new A();
    ob.start();
 } 
}