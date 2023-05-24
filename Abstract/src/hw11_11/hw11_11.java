package hw11_11;

//hw11_11, 多重繼承的練習
/*(1) 介面的資料成員必須初始化
(2) 介面裡的函數必須全部都定義成abstract*/
interface Data
{
public void showData();
}
interface Test
{
public void showScore();
public double calcu();
}
class CStu implements Data,Test
{
protected String id;    // 學號
protected String name;  // 姓名
protected int mid;      // 期中考成績
protected int finl;     // 期末考成績
protected int common;   // 平時成績

public CStu(String s1,String s2,int m,int f,int c)
{
   id=s1;
   name=s2;
   mid=m;
   finl=f;
   common=c;
}
public void show()
{
   showData();
   showScore();
}
public void showScore()
{
   System.out.println("期中考成績:"+mid);
   System.out.println("期末考成績:"+finl);
   System.out.println("平時成績:"+common);
   System.out.println("學期成績:"+calcu());
}
public void showData()
{
   System.out.println("學號:"+id);
   System.out.println("姓名:"+name);
}
public double calcu()
{
   return (mid*0.3+finl*0.3+common*0.4);
}
}

public class hw11_11
{
public static void main(String args[])
{
   CStu stu=new CStu("940001","Fiona",90,92,85);
   stu.show();
}
}

/* output---------
學號:940001
姓名:Fiona
期中考成績:90
期末考成績:92
平時成績:85
學期成績:88.6
----------------*/