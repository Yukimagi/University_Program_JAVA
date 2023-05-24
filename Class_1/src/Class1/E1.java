package Class1;

class Cddd//設類別Cddd的定義為
{
   String name;
   double height;
   double weight;
}
public class E1 {

	public static void main(String args[])
	   {
	      double bmi;
	      //試在main()函數裡建立Cddd類別型態的物件student
	      Cddd student=new Cddd();
	      
	      /*(b)
			將student資料成員name設值為Sandy，
			height的值設為165.5(單位為公分)，
			weight的值設為58.2(單位為公斤)。*/
	      student.name="Sandy";
	      student.height=165.5;
	      student.weight=58.2;
	      
	      student.height/=100;
	      
	      /*– (c)利用BMI=weight(Kg)/height^2(M)
	       * 	计算此學生的身體質量指數BMI值。*/
	      bmi=student.weight/(student.height*student.height);

	      /*(d)印出student的資料及BMI值。*/
	      System.out.println("name="+student.name);
	      System.out.println("height="+student.height*100+"cm");
	      System.out.println("weight="+student.weight+"kg");
	      System.out.println("BMI="+bmi);
	   }
}
/* output---------------
name=Sandy
height=165.5cm
weight=58.2kg
BMI=21.248436943802993
----------------------*/
