package traversal;

//hw16_15,
import java.util.*;
public class hw16_15
{
public static void main(String args[])
{
   int sum=0;
   LinkedList<Integer> llist=new LinkedList<Integer>();

   for(int i=1;i<=10;i++)
      llist.add((int)(Math.random()*100));
   System.out.println("LinkedList內容:"+llist);

   ListIterator<Integer> litr=llist.listIterator(llist.size());
   System.out.print("反向走訪LinkedList內容:");
   while(litr.hasPrevious())
   {
      int elm=litr.previous();
      System.out.print(elm+" ");
      sum+=elm;
   }
   System.out.println("\nsum="+sum);
}
}

/* output-------------------------------------------------
LinkedList內容:[81, 13, 6, 91, 41, 94, 84, 91, 71, 12]
反向走訪LinkedList內容:12 71 91 84 94 41 91 6 13 81
sum=584
--------------------------------------------------------*/
