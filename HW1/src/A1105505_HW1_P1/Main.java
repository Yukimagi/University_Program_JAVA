package A1105505_HW1_P1;//測資時不要交(package)名稱

import java.util.Scanner;//輸入涵式庫

public class Main {

	public static void main(String[] args) {
        Scanner add = new Scanner(System.in);/*宣告Scanner add變數*/
        int no1,no2;    //宣告變數
        no1=add.nextInt();//讀入變數        
        no2=add.nextInt();//讀入變數
        
        while (add.hasNext()) {//重複讀入直到break跳脫while迴圈                    
            int ans;//宣告變數        
            ans=add.nextInt();//讀入變數            
            if(ans==no1+no2) {//當讀入的變數ans值為解答正確
            	System.out.print("RIGHT!\n");//輸出RIGHT!
            	break;//跳出while迴圈
            }
            else {//當讀入的變數ans值為解答不正確
            	System.out.print("WRONG!\n");//輸出WRONG!
            }
        }
        //程式結束
    }

}
