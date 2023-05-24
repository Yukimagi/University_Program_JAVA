package map;

//hw16_10,
import java.util.*;
public class hw16_10
{
public static void main(String args[])
{
   int count=0,key=0;
   TreeMap<Integer,Integer> tmap=new TreeMap<Integer,Integer>();

   while(count<=4)
   {
      key=(int)(100*Math.random());
      if(!tmap.containsKey(key))
      {
         tmap.put(key,count);
         count++;
      }
   }
   System.out.println("TreeMap的內容: "+tmap);

   HashSet<Integer> hset=new HashSet<Integer>();
   key=0;
   while(key<=100)
   {
      if(tmap.containsKey(key))
         hset.add(key);
      key++;
   }
   System.out.println("HashSet的內容: "+hset);
}
}

/* output-------------------------------------
TreeMap的內容: {15=2, 36=4, 82=1, 84=3, 90=0}
HashSet的內容: [84, 36, 82, 90, 15]
--------------------------------------------*/
