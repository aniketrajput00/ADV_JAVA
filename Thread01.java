
class A extends Thread
{
 A()
 {
   start();
 }
 public void run()
 {
  for(int i=1;i<=5;i++)
  {
    System.out.println("value="+i);
  }
 }
}

public class Thread01
{
 public static void main(String arg[])
 {
   A ob=new A();
 }
}