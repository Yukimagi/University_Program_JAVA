package Variable;

//import java.text.NumberFormat;
//import java.util.Locale;
import java.util.Scanner;//載入Scanner類別//這次主要使用這個函示庫

public class Variable_2_1 {
//2-1
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner rectangle=new Scanner(System.in);//宣告Scanner類別的物件
	float a=0.0f;//float要加f
	float b=0.0f;
	System.out.println("Enter rectangle 底.");//println的ln代表換行
	a=rectangle.nextFloat();//輸入float值
	System.out.println("Enter rectangle 高");
	b=rectangle.nextFloat();//輸入float值
	//Address=KB.next();//輸入字串(到空格前)
	System.out.print("rectangle面積 is:");
	System.out.printf("%4.2f\n",(a*b)/2);//記得要使用%2.2f之類的要用printf(d是用於整數)
	System.out.print("x\n");
	float c=0.0f;
	c=352*32;
	System.out.printf("%4.2f\n",c);
	}

}
