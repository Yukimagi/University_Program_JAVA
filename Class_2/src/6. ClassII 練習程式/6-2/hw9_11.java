// hw9_11, 分數類別的應用
class CRational   // 分數類別
{
   public int n;
   public int d;

   public void setND(int num,int den)
   {
      n=num;
      d=den;
   }
   public CRational add(CRational r)
   {
      display(this,r,'+');
      CRational obj=new CRational();
      obj.n=this.n*r.d+this.d*r.n;
      obj.d=this.d*r.d;
      return obj;
   }
   public CRational sub(CRational r)
   {
      display(this,r,'-');
      CRational obj=new CRational();
      obj.n=this.n*r.d-this.d*r.n;
      obj.d=this.d*r.d;
      return obj;
   }
   public CRational mul(CRational r)
   {
      display(this,r,'*');
      CRational obj=new CRational();
      obj.n=this.n*r.n;
      obj.d=this.d*r.d;
      return obj;
   }
   public CRational div(CRational r)
   {
      display(this,r,'/');
      CRational obj=new CRational();
      obj.n=this.n*r.d;
      obj.d=this.d*r.n;
      return obj;
   }
   public void display(CRational r1,CRational r2,char ch)   // 顯示分數
   {
      System.out.print("(");
      System.out.print(r1.n+"/"+r1.d);
      System.out.print(")");
      System.out.print(ch);
      System.out.print("(");
      System.out.print(r2.n+"/"+r2.d);
      System.out.print(")=");
   }
}

public class hw9_11
{
   public static void main(String args[])
   {
      CRational aaa=new CRational();
      CRational bbb=new CRational();
      CRational ccc;

      aaa.setND(2,5);
      bbb.setND(3,7);

      ccc=aaa.add(bbb);   // 加法
      show(ccc);

      ccc=aaa.sub(bbb);   // 減法
      show(ccc);

      ccc=aaa.mul(bbb);   // 乘法
      show(ccc);

      ccc=aaa.div(bbb);   // 除法
      show(ccc);
   }
   public static void show(CRational obj)         // 顯示分數
   {
      System.out.println(obj.n+"/"+obj.d);
   }
}

/* output----------
(2/5)+(3/7)=29/35
(2/5)-(3/7)=-1/35
(2/5)*(3/7)=6/35
(2/5)/(3/7)=14/15
-----------------*/