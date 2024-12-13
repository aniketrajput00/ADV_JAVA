import java.util.*;

class A extends Thread
{
 A()
 {
   start();
 }
public void run()
{
  while(true)
 {
  try{
         sleep(2000);
         Random r1=new Random();
         int n=r1.nextInt(100);
        System.out.println("1 to 100 random number="+n);
       }catch(Exception e){}
 }
}
}

public class randomnum
{
 public static void main(String arg[])
 {
   A ob=new A();
 }
}