package traversal;

//hw16_14,
import java.util.*;
public class hw16_14
{
public static void main(String args[])
{
   int sum=0;
   TreeSet<Integer> tset=new TreeSet<Integer>();
   for(int i=1;i<=10;i++)
      tset.add((int)(Math.random()*100));

   System.out.print("TreeSet集合內容:");
   for(int i:tset)
   {
      System.out.print(i+" ");
      sum+=i;
   }
   System.out.println("\n平均值="+(double)sum/tset.size());
}
}

/* output------------------------------------
TreeSet集合內容:6 16 20 42 54 71 80 82 83 91
平均值=54.5
-------------------------------------------*/