package Class1;
//hw8_9,
/*試設計一個CCalculator,資料成員包括a、b及c，
型態為int。請立建該類別的物件obj,並完成下列的各函數的程式設計:
– (a)定義set_vaue(int x,int y, int z)函數，用來設定資料成員之值，將
x設值為25，y設值為3, z設值為7。
– (b) 定義show函數,可用來列印所有資料成員。
– (c)定義add()函數,可用來傳回三數之和。
– (d)定義sub()函數,可用來傳回a-b-c之值。
– (e)定義mul()函數,可用來傳回三數之乘積。
– (f)定義avg()函數,可用來傳回三數之平均值,傳回值型態設為double
。*/
class CCalculator//試設計一個CCalculator,資料成員包括a、b及c，型態為int。
{
int a;
int b;
int c;

void set_value(int x,int y,int z)//(a)定義set_vaue(int x,int y, int z)函數，用來設定資料成員之值，將x設值為25，y設值為3, z設值為7。
{
   a=x;
   b=y;
   c=z;
}
void show()//(b) 定義show函數,可用來列印所有資料成員。
{
   System.out.println("a="+a+", b="+b+", c="+c);
}
int add()//(c)定義add()函數,可用來傳回三數之和。
{
   System.out.print(a+"+"+b+"+"+c+"=");
   return (a+b+c);
}

int sub()//(d)定義sub()函數,可用來傳回a-b-c之值。
{
   System.out.print(a+"-"+b+"-"+c+"=");
   return (a-b-c);
}

int mul()//(e)定義mul()函數,可用來傳回三數之乘積。
{
   System.out.print(a+"*"+b+"*"+c+"=");
   return a*b*c;
}

double avg()//(f)定義avg()函數,可用來傳回三數之平均值,傳回值型態設為double
{
   return ((a+b+c)/3.0);
}
}
public class E3 {
	public static void main(String args[])
	   {
	      CCalculator obj=new CCalculator();

	      obj.set_value(25,3,7);//將x設值為25，y設值為3, z設值為7。
	      obj.show();
	      System.out.println(obj.add());
	      System.out.println(obj.sub());
	      System.out.println(obj.mul());
	      System.out.println("average="+obj.avg());
	   }
}
/* output------------------
a=25, b=3, c=7
25+3+7=35
25-3-7=15
25*3*7=525
average=11.666666666666666
--------------------------*/
