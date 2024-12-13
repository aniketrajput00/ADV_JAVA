
class A extends Thread
{
 Thread th;
  A()
  {
    th=new Thread(toihis);
    th.start();
  }
 public void run()
 {
   for(int i=1;i<=5;i++)
   {
     System.out.println("Value="+i);
   }
 }
}

public class Thread04
{
 public static void main(String arg[])
 {
   A ob=new A();
 } 
}