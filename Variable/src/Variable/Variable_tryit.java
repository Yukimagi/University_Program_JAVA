
package Variable;
//import java.text.NumberFormat;
//import java.util.Locale;
import java.util.Scanner;//載入Scanner類別//這次主要使用這個函示庫

public class Variable_tryit {
//2-try it
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner KB=new Scanner(System.in);//宣告Scanner類別的物件
	int age=0;
	String Address="";
	System.out.println("Enter your age");//println的ln代表換行
	age=KB.nextInt();//輸入整數
	System.out.print("Enter your address(不要有空格)");
	Address=KB.next();//原出錯於 nextLine()//到\n前(前面出現過)，將nextline改next即可
	//Address=KB.nextLine();//輸入字串(到空格前)//也可再輸入一次
	System.out.println("I am "+age+" years old");
	System.out.println("My address: "+Address);
	}

}

