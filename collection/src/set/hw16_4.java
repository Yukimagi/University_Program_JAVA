package set;

//hw16_4,
import java.util.*;
public class hw16_4
{
public static void main(String args[])
{
   int sum=0;
   HashSet<Integer> hset=new HashSet<Integer>();
   TreeSet<Integer> tset=new TreeSet<Integer>();

   hset.add(65);
   hset.add(29);
   hset.add(18);
   hset.add(34);
   System.out.println("HashSet的內容:"+hset);

   tset.add(97);
   tset.add(62);
   tset.add(53);
   System.out.println("TreeSet的內容:"+tset);

   tset.addAll(hset);
   System.out.println("加入新元素後，TreeSet的內容:"+tset);

   sum=tset.first()+tset.last();
   System.out.print(tset.first()+"與"+tset.last());
   System.out.println("的平均值為 "+sum/2.0);
}
}

/* output-----------------------------------------------
HashSet的內容:[34, 18, 65, 29]
TreeSet的內容:[53, 62, 97]
加入新元素後，TreeSet的內容:[18, 29, 34, 53, 62, 65, 97]
18與97的平均值為 57.5
------------------------------------------------------*/
