package list;

//hw16_7,
import java.util.*;
public class hw16_7
{
public static void main(String args[])
{
   LinkedList<String> llist=new LinkedList<String>();
   ArrayList<String> alist=new ArrayList<String>();

   llist.add("apple");
   llist.add("guava");
   System.out.println("LinkedList的內容:"+llist);

   alist.add("tomato");
   alist.add("apple");
   alist.add("papaya");
   alist.add("grape");
   System.out.println("ArrayList的內容:"+alist);

   alist.addAll(llist);
   System.out.println("加入新元素後，ArrayList的內容:"+alist);

   System.out.print("第一個apple的索引值=");
   System.out.println(alist.indexOf("apple"));
   System.out.print("最後一個apple的索引值=");
   System.out.println(alist.lastIndexOf("apple"));
}
}

/* output--------------------------------------------------------------------
LinkedList的內容:[apple, guava]
ArrayList的內容:[tomato, apple, papaya, grape]
加入新元素後，ArrayList的內容:[tomato, apple, papaya, grape, apple, guava]
第一個apple的索引值=1
最後一個apple的索引值=4
----------------------------------------------------------------------------*/
