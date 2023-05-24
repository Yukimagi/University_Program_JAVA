package Array;
/*設某一公司有五種產品A、B、C、D與E其分別為
 * 12、16、10、14與15元；而該公司共有三位銷售員,
他們在某個月份的銷售量如下所示:
試寫一程式印出上表的內容,並計算:
(a)每一個銷售員的銷售總金額。
(b)每一項產品的銷售總金額。
(c)有最好業績(銷售金為最多者)的銷售員。
(d)銷售總金額為最多的產品。*/
import java.util.Scanner;

public class Array4_2_real {
//排序要全英文比較好排~
	public static void main(String[] args) {		
	Scanner score=new Scanner(System.in);
	int sale[][]= {{33,32,56,45,33},
			       {77,33,68,45,23},
			       {43,55,43,67,65}};
	int price[]= {12,16,10,14,15};
	System.out.printf("%1$-10s","sales");
	System.out.printf("%1$-10s","A");
	System.out.printf("%1$-10s","B");
	System.out.printf("%1$-10s","C");
	System.out.printf("%1$-10s","D");
	System.out.printf("%1$-10s","E");
	System.out.printf("%1$-10s\n","銷售總金額");
	int p[];//產品
	p=new int[5];
	int sTotal[];
	sTotal=new int[3];
	for(int i=0;i<3;i++) {
		System.out.printf("%1$-10s",i+1);
		for(int j=0;j<5;j++) {
			sTotal[i]=sale[i][j]+sTotal[i];
			System.out.printf("%1$-10d",sale[i][j]);
			p[j]=p[j]+sale[i][j]*price[j];
		}
		System.out.printf("%1$-10d\n",sTotal[i]);
	}
	System.out.printf("%1$-10s","ALL");
	System.out.printf("%1$-10d",p[0]);
	System.out.printf("%1$-10d",p[1]);
	System.out.printf("%1$-10d",p[2]);
	System.out.printf("%1$-10d",p[3]);
	System.out.printf("%1$-10d\n",p[4]);
	
	int max=0;//銷售員總金額
	int tmax=0;//產品總金額
	int smax=0;//who
	int pmax=0;//what p
	for(int i=0;i<3;i++) {
		if(sTotal[i]>max) {
			smax=i+1;
			max=sTotal[i];
		}
		
	}
	for(int i=0;i<5;i++) {
		if(p[i]>tmax) {
			pmax=i;
			tmax=p[i];
		}
		
	}
	char product[]= {'A','B','C','D','E'};
	System.out.printf("有最好業績的銷售員是:%d\n",smax);
	System.out.printf("銷售金額最多的產品是:產品%c\n",product[pmax]);
	
}
}