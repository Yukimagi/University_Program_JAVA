package Class1;
/*設有一CSphere類別，可用來表示一個圓球。此類別內含
x,y,z三個資料成員,用來代表圓心的位置，此外有一radius資
料成員，代表圓球的半徑。其部份程式碼撰寫如上:
– (a)試在CSphere類別裡加入setLocation()函數,用來設定圓球之圓心位
置，請將其設定為(3,4,5)
。
– (b)在CSphere類別裡加入setRadius()函數,用來設定圓球之半徑。請設半徑為1。
– (c)在CSphere類別裡加入surfaceArea(),用來傳回CSphere物件的表面積。
– (d)在CSphere類別裡加入volume(),用來傳回CSphere物件的體積。
– (e)在CSphere類別裡加入showCenter()函數,用來顯示CSphere物件之圓心座標。*/
//hw8_16,
class CSphere
/*設有一CSphere類別，可用來表示一個圓球。此類別內含
x,y,z三個資料成員,用來代表圓心的位置，此外有一radius資
料成員，代表圓球的半徑*/
{
private int x;          // 圓心x軸
private int y;          // 圓心y軸
private int z;          // 圓心z軸
private int radius;     // 圓心半徑

void setLocation(int a,int b,int c) 
//(a)試在CSphere類別裡加入setLocation()函數,用來設定圓球之圓心位置，請將其設定為(3,4,5)
{
   x=a;
   y=b;
   z=c;
}
void setRadius(int r)   
//(b)在CSphere類別裡加入setRadius()函數,用來設定圓球之半徑。請設半徑為1。
{
   radius=r;
}
double surfaceArea()    // (c)在CSphere類別裡加入surfaceArea(),用來傳回CSphere物件的表面積。
{
   return 4*3.14*radius*radius*radius;
}
double volume()//(d)在CSphere類別裡加入volume(),用來傳回CSphere物件的體積。
{
   return ((double)(3.0/4)*3.14*radius*radius*radius);
}
void showCenter()//(e)在CSphere類別裡加入showCenter()函數,用來顯示CSphere物件之圓心座標。
{
   System.out.println("x="+x+", y="+y+", z="+z);
}
}

public class E4
{
public static void main(String args[])
{
   CSphere cs=new CSphere();

   cs.setLocation(3,4,5);//設定圓球之圓心位置，請將其設定為(3,4,5)
   cs.setRadius(1);//(b)在CSphere類別裡加入setRadius()函數,用來設定圓球之半徑。請設半徑為1。
   cs.showCenter();
   System.out.println("surface area="+cs.surfaceArea());
   System.out.println("volume="+cs.volume());
}
}

/* output-------------
x=3, y=4, z=5
surface area=12.56
volume=2.355
--------------------*/
