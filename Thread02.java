
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

public class Thread02
{
 public static void main(String arg[])
 {
   A ob=new A();
   Thread th=new Thread(ob);
    th.start();
 } 
}