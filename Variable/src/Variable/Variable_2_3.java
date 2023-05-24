package Variable;

//import java.text.NumberFormat;
//import java.util.Locale;
import java.util.Scanner;//載入Scanner類別//這次主要使用這個函示庫

public class Variable_2_3 {
//2-3
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner shop=new Scanner(System.in);//宣告Scanner類別的物件
	String Item="Item";
	String Quantity="Quantity";
	String Price="Price";
	String Total="Total";
	String item1;//string要大寫(因為要可空格因此用string)
	int quantity1;
	float price1;
	String item2;//string要大寫(因為要可空格因此用string)
	int quantity2;
	float price2;
	String item3;//string要大寫(因為要可空格因此用string)
	int quantity3;
	float price3;
	float total=0.0f;
	double sum=0.0f;
	
	System.out.println("Input name of item 1:");//println的ln代表換行
	item1=shop.nextLine();//輸入string值包含空白...(不包含為next())
	System.out.println("Input quantity of item 1:");
	quantity1=shop.nextInt();//輸入int值
	System.out.println("Input price of item 1:");
	price1=shop.nextFloat();//輸入float值
	
	System.out.println("Input name of item 2:");//println的ln代表換行
	item2=shop.nextLine();//輸入string值包含空白...(不包含為next())
	item2=shop.nextLine();//輸入string值包含空白...(不包含為next())//因為無法讀到所以在輸一次
	System.out.println("Input quantity of item 2:");
	quantity2=shop.nextInt();//輸入int值
	System.out.println("Input price of item 2:");
	price2=shop.nextFloat();//輸入float值
	
	System.out.println("Input name of item 3:");//println的ln代表換行
	item3=shop.nextLine();//輸入string值包含空白...(不包含為next())
	item3=shop.nextLine();//輸入string值包含空白...(不包含為next())//因為無法讀到所以在輸一次
	System.out.println("Input quantity of item 3:");
	quantity3=shop.nextInt();//輸入int值
	System.out.println("Input price of item 3:");
	price3=shop.nextFloat();//輸入float值
	
	System.out.println("your bill:");
	System.out.print(String.format("%1$-30s",Item));//String.format("%1$-x",a)使a右邊補空格x(也可不加直接用<最後面>)
	System.out.printf(String.format("%1$-10s",Quantity));
	System.out.printf(String.format("%1$-10s",Price));
	System.out.printf(String.format("%1$-10s\n",Total));
	
	System.out.printf(String.format("%1$-30s",item1));
	System.out.printf(String.format("%1$-10d",quantity1));
	System.out.printf(String.format("%1$-10.2f",price1));
	total=quantity1*price1;
	sum=total+sum;
	System.out.printf(String.format("%1$-10.2f\n",total));
	
	System.out.printf(String.format("%1$-30s",item2));
	System.out.printf(String.format("%1$-10d",quantity2));
	System.out.printf(String.format("%1$-10.2f",price2));
	total=quantity2*price2;
	sum=total+sum;
	System.out.printf(String.format("%1$-10.2f\n",total));
	
	System.out.printf(String.format("%1$-30s",item3));
	System.out.printf(String.format("%1$-10d",quantity3));
	System.out.printf(String.format("%1$-10.2f",price3));
	total=quantity3*price3;
	sum=total+sum;
	System.out.printf(String.format("%1$-10.2f\n",total));
	System.out.print("\n");
	//String.format 裡面不一定要是變數
	String s="Subtotal";
	String s2="6.25% sales tax";
	System.out.printf(String.format("%1$-50s",s));
	System.out.printf(String.format("%1$-10.2f\n",sum));
	System.out.printf("%1$-50s",s2);
	double sum2=sum*0.0625;
	System.out.printf("%1$-10.2f\n",sum2);
	System.out.printf("%1$-50s",Total);
	sum=sum+sum*0.0625;
	System.out.printf("%1$-10.2f",sum);
	}

}
