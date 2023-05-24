package set;

//hw16_5,
import java.util.*;
public class hw16_5
{
public static void main(String args[])
{
   TreeSet<String> tset=new TreeSet<String>();
   tset.add("Everything has an end.");
   tset.add("Good to begin well, better to end well.");
   tset.add("You cannot tell a book by its cover.");
   tset.add("A good book is a light to the soul.");
   System.out.println("第一個元素: "+tset.first());
   System.out.println("最後一個元素:"+tset.last());
   System.out.println("小於By的元素:"+tset.headSet("By"));
}
}

/* output------------------------------------------
第一個元素: A good book is a light to the soul.
最後一個元素:You cannot tell a book by its cover.
小於By的元素:[A good book is a light to the soul.]
-------------------------------------------------*/
