class A extends Thread
{
 public void run()
 {
  for(int i=1;i<=5;i++)
  {
   System.out.println("A of i="+i);
  }
 }
}

class B extends Thread
{
 public void run()
 {
  for(int i=1;i<=5;i++)
  {
   System.out.println("B of i="+i);
  }
 }
}

class c extends Thread
{
 public void run()
 {
  for(int i=1;i<=5;i++)
  {
   System.out.println("c of i="+i);
  }
 }
}

public class multiThread01
{
 public static void main(String arg[])
 {
  A ob1=new A();
  B ob2=new B();
  c ob3=new c();
 
  ob1.start();
  ob2.start();
  ob3.start();
 }
}