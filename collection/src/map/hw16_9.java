package map;

//hw16_9,
import java.util.*;
public class hw16_9
{
public static void main(String args[])
{
   HashMap<Integer,Integer> hmap=new HashMap<Integer,Integer>();
   for(int i=0;i<5;i++)
      hmap.put(i,(int)(100*Math.random()));

   TreeSet<Integer> tset=new TreeSet<Integer>(hmap.values());
   HashSet<Integer> hset=new HashSet<Integer>(hmap.keySet());

   System.out.println("HashMap的內容: "+hmap);
   System.out.println("TreeSet的內容: "+tset);
   System.out.println("HashSet的內容: "+hset);
}
}

/* output-------------------------------------
HashMap的內容: {0=0, 1=22, 2=30, 3=90, 4=78}
TreeSet的內容: [0, 22, 30, 78, 90]
HashSet的內容: [0, 1, 2, 3, 4]
--------------------------------------------*/
