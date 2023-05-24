package set;

//hw16_3,
import java.util.*;
public class hw16_3
{
public static void main(String args[])
{
   int sum=0;
   HashSet<Integer> hset=new HashSet<Integer>();
   TreeSet<Integer> tset=new TreeSet<Integer>();
   //順序可能不同， HashSet物件裡的元素都是唯一存在的
   hset.add(36);
   hset.add(15);
   //hset.add(2);
   //由小到大 元素不能重複出現
   tset.add(52);
   tset.add(23);
   tset.add(32);
   tset.add(69);
   tset.add(10);
   tset.add(7);
   tset.add(36);
   tset.add(15);

   System.out.println("HashSet內容:"+hset);
   System.out.println("TreeSet內容:"+tset);

   if(tset.contains(32))
   {
      tset.remove(32);
      System.out.println("tset的元素32已被刪除...");
      System.out.println("刪除後的tset內容:"+tset);
   }
   else
      System.out.println("tset中沒有元素32");

   System.out.print("tset中是否包含"+hset+"的元素? ");
   if(tset.containsAll(hset))
      System.out.println("Yes!");
   else
      System.out.println("No!");
}
}

/* output---------------------------------------
HashSet內容:[36, 15]
TreeSet內容:[7, 10, 15, 23, 32, 36, 52, 69]
tset的元素32已被刪除...
刪除後的tset內容:[7, 10, 15, 23, 36, 52, 69]
tset中是否包含[36, 15]的元素? Yes!
----------------------------------------------*/
