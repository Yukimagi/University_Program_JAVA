package hw11_14;

//hw11_14a,
interface iVolume
{
public void showData();    // 顯示球體的資料
public double vol();       // 計算球體積
}
abstract class CSphere implements iVolume
{
final double PI=3.14;
protected int x;
protected int y;
}


class CCircle extends CSphere//*****
{
protected int radius;

public CCircle(int a,int b,int r)
{
   x=a;
   y=b;
   radius=r;
}
public void showData()
{
   System.out.println("球心:("+x+","+y+")");
   System.out.println("半徑:"+radius);
   System.out.println("球體積:"+vol());
}
public double vol()
{
   return ((4.0/3)*PI*radius*radius*radius);
}
}



public class hw11_14a
{
public static void main(String args[])
{
   CCircle cir=new CCircle(8,6,2);
   cir.showData();
}
}

/* output------------------
球心:(8,6)
半徑:2
球體積:33.49333333333333
-------------------------*/
