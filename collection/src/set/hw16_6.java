package set;

//hw16_6,
import java.util.*;
public class hw16_6
{
public static void main(String args[])
{
   LinkedList<Integer> llist=new LinkedList<Integer>();

   for(int i=1;i<=10;i++)
      llist.add((int)(Math.random()*100));
   System.out.println("LinkedList的內容:"+llist);

   System.out.println("第一個元素="+llist.getFirst());
   System.out.println("最後一個元素="+llist.getLast());
   System.out.print(llist.getFirst()+"*"+llist.getLast()+"=");
   System.out.println(llist.getFirst()*llist.getLast());
}
}

/* output------------------------------------------------
LinkedList的內容:[51, 83, 34, 42, 40, 99, 18, 53, 32, 86]
第一個元素=51
最後一個元素=86
51*86=4386
------------------------------------------------------*/
