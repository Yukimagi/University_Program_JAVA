package traversal;

//hw16_13,
import java.util.*;
public class hw16_13
{
public static void main(String args[])
{
   ArrayList<Integer> alist=new ArrayList<Integer>();
   for(int i=1;i<=10;i++)
      alist.add((int)(Math.random()*100));
   System.out.print("ArrayList集合的內容:");
   for(int i:alist)
      System.out.print(i+" ");
}
}

/* output----------------------------------------
ArrayList集合的內容:79 25 37 98 16 91 22 17 1 6
-----------------------------------------------*/
