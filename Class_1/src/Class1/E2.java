package Class1;
//hw8_5,
/*(a)試在main()函數裡, CBox類別建立一個box物件,並將其length、
width與height三個資料成員的值均設為1。
– (b)試在CBox類別裡,定義volume()函數,用來傳回box物件的表體積。
– (c)試在CBox類別裡,定義surfacaArea()函數,用來傳回box物件的表面積。
– (d)試在CBox類別裡,加入showData()函數,用來顯示box物件length,
width, height三個資料成員的值。
– (e)試在CBox類別裡,加入showAll()函數用來示box物件length, width,
height三個資料成員的值，以及其表面積與體積。*/
class CBox
{
int length;
int width;
int height;

int volume()//(b)試在CBox類別裡,定義volume()函數,用來傳回box物件的表體積。
{
   return length*width*height;
}
int surfaceArea()//(c)試在CBox類別裡,定義surfacaArea()函數,用來傳回box物件的表面積。
{
   return 2*((length*width)+(width*height)+(length*height));
}
void showData()//(d)試在CBox類別裡,加入showData()函數,用來顯示box物件length,width, height三個資料成員的值。
{
   System.out.println("length="+length);
   System.out.println("width="+width);
   System.out.println("height="+height);
}
void showAll()//(e)試在CBox類別裡,加入showAll()函數用來示box物件length, width,height三個資料成員的值，以及其表面積與體積。*/
{
   showData();
   System.out.println("surface area="+surfaceArea());
   System.out.println("volume="+volume());
}
}
public class E2 {
/*(a)試在main()函數裡, CBox類別建立一個box物件,並將其length、
width與height三個資料成員的值均設為1。*/
	 public static void main(String args[])
	   {
	      CBox box;
	      box=new CBox();

	      box.length=3;//這3個可修正為1
	      box.width=6;
	      box.height=9;

	      box.showAll();
	   }
}
/* output----------------
length=3
width=6
height=9
surface area=198
volume=162
-----------------------*/