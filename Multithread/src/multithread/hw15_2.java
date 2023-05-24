package multithread;
import java.util.*;//涵式庫

/*class CTest extends Thread//從Thread類別言身子類別Ctest
{
   private String id;//建構原設定成員id
   public CTest(String str)
   {
      id=str;
   }
   public void run()//改寫Thread類別的run()函數
   {
      for(int i=1;i<=5;i++)
      {
         for(int j=0;j<100000000;j++);//空迴圈用來拖慢
         System.out.println(id+" "+i);
      }
   }
}

public class hw15_2
{
   public static void main(String args[])
   {
      CTest hi=new CTest("Hello");
      CTest bye=new CTest("Good bye");
      hi.run();//呼叫run
      bye.run();
   }
}
*/
/* output--------------------
Hello 1
Hello 2
Hello 3
Hello 4
Hello 5
Good bye 1
Good bye 2
Good bye 3
Good bye 4
Good bye 5
---------------------------*/


