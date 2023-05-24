package Variable;

import java.util.Scanner;//載入Scanner類別//這次主要使用這個函示庫

public class Variable_2_2 {
//2-2
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner BMI=new Scanner(System.in);//宣告Scanner類別的物件
	int wt=0;
	double ht=0.0;
	System.out.println("Enter your weight(kg)");//println的ln代表換行
	wt=BMI.nextInt();//輸入double值
	System.out.println("Enter your height(m)");
    ht=BMI.nextDouble();
	//Address=KB.next();//輸入字串(到空格前)
	System.out.print("Your BMI is:");
	System.out.printf("%4.2f\n",wt/(ht*ht));//記得要使用%2.2f之類的要用printf(d是用於整數)
	}

}
