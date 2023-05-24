package A1105505_HW1_P2;//測資時不要交(package)名稱

import java.util.Scanner;//輸入涵式庫

public class Main {//public class Main(題目要求)

	public static void main(String[] args) {
        Scanner max = new Scanner(System.in);/*宣告Scanner max變數*/
        int[] a= new int[10];//宣告變數
        int i=0;//宣告變數
        while(max.hasNext()) {//重複讀入直到break跳脫while迴圈
        	a[i]=max.nextInt();//讀入變數
        	if(a[i]==-1) {//當輸入之數字為-1跳脫while迴圈
        		break;//跳出while迴圈
        	}
        	else {
        		i++;//否則繼續輸入下一個陣列值
        	}
        }
        for(int j=0;j<i;j++) {//比較數字(將最大值放到最後一位)
        	if(a[j]>a[j+1]) {//如果第j個大於第j+1個
        		int b=a[j];//先宣告變數b存第j個
        		a[j]=a[j+1];//將第j+1個放入第j個
        		a[j+1]=b;//將j+1個存入b變數值
        	}
        }
        System.out.printf("MAX:%d\n",a[i]);//輸出結果(最大值)
        //程式結束
    }

}
