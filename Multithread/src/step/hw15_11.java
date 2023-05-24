package step;
//(改習題3)
//hw15_11,
class CTest extends Thread implements Runnable
{
private String id;
private int sec;
public CTest(String str,int s)
{
   id=str;
   sec=s;
}
public void run()
{
   for(int i=1;i<=5;i++)
   {
      try
      {
         sleep(sec);
      }
      catch(InterruptedException e){}
      System.out.println(id+" "+i);
   }
}
}

public class hw15_11
{
public static void main(String args[])
{
   CTest hi=new CTest("Hello",1000);
   CTest bye=new CTest("Good bye",2500);
   Thread t1=new Thread(hi);
   Thread t2=new Thread(bye);
   t1.start();
   t2.start();
}
}

/* output--------------------
Hello 1
Hello 2
Good bye 1
Hello 3
Hello 4
Good bye 2
Hello 5
Good bye 3
Good bye 4
Good bye 5
---------------------------*/
