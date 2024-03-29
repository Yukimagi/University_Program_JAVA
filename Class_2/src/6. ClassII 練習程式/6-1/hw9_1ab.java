// hw9_1ab,
class CRectangle
{
   int width;
   int height;

   public CRectangle(int w,int h)
   {
      width=w;
      height=h;
      System.out.println("constructor CRectangle(int w,int h) called");
   }
   public CRectangle()
   {
      width=10;
      height=8;
      System.out.println("constructor CRectangle() called");
   }
   public void show()
   {
      System.out.println("width="+width);
      System.out.println("height="+height);
   }
}

public class hw9_1ab
{
   public static void main(String args[])
   {
      CRectangle rec1=new CRectangle(5,2);
      rec1.show();
      CRectangle rec2=new CRectangle();
      rec2.show();
   }
}

/* output----------------------------------
constructor CRectangle(int w,int h) called
width=5
height=2
constructor CRectangle() called
width=10
height=8
-----------------------------------------*/
