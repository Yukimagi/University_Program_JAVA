package A1105505_HW1_P3;//測資時不要交

import java.util.Arrays;//輸入涵式庫
import java.util.Scanner;//輸入涵式庫

public class Main {//public class Main(題目要求)

	public static void main(String[] args) {
		Scanner guess = new Scanner(System.in);/*宣告Scanner guess變數*/
		int a;//宣告變數電腦輸入的值
        int[] digit_ans= new int[10];//宣告變數存電腦個別數字
        int b;//宣告變數
        a=guess.nextInt();//讀入變數
        
        digit_ans[0]=a/1000;//以下是將輸入的數字做分割
        a=a%1000;
        digit_ans[1]=a/100;
        a=a%100;
        digit_ans[2]=a/10;
        a=a%10;
        digit_ans[3]=a;
      
        while(guess.hasNext()) {//重複讀入直到break跳脫while迴圈
        	int x=0;//宣告變數A數量
        	int y=0;//宣告變數B數量
        	b=guess.nextInt();//讀入變數
        	
        	boolean check[]=new boolean[4];//宣告變數(boolean值陣列設定)(確定A)
    		Arrays.fill(check, false);//將boolean值陣列設定為false
    		
    		boolean used[]=new boolean[4];//宣告變數(boolean值陣列設定)(確定用過的)
    		Arrays.fill(used, false);//將boolean值陣列設定為false
        	
        	int[] digit_in= new int[10];//宣告變數
        	digit_in[0]=b/1000;//以下是將輸入的數字做分割
            b=b%1000;
            digit_in[1]=b/100;
            b=b%100;
            digit_in[2]=b/10;
            b=b%10;
            digit_in[3]=b;
            for(int i=0;i<4;i++) {//計算A數量(如果相等且同位置即是)
            	if(digit_ans[i]==digit_in[i]) {
            		x++;
            		check[i]=true;
            		used[i]=true;
            	}
            	
            }
            for(int i=0;i<4;i++) {//計算B數量
            	if(check[i]==true) {//先看是不是A算過
            		continue;//暫停本次迴圈繼續計算下一個
            	}
            	for(int j=0;j<4;j++) {//看是否相同且是否用過(計算過)
            	     if((digit_in[i]==digit_ans[j])&&(!used[j])) {
            			y++;
            			used[j]=true;
            			break;//跳脫for迴圈
            		 }
            	}
            }
            
            System.out.printf("%dA %dB\n",x,y);//輸出結果
            if(x==4&&y==0) {//當是最終4A時
            	break;//break跳出while迴圈
            }
            
        }
        
	}



}
