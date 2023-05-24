package Array;

import java.util.Scanner;//輸入涵式庫//載入Scanner類別

public class Array4_1 {

	public static void main(String[] args) {
		//1.
		int A[]={53,27,69,12,3,96};//宣告整數陣列A，並設定初始值
		System.out.println("印出陣列A的值");
		for(int i=0;i<6;i++) {
			System.out.print(A[i]);
			System.out.print("\n");
		}
		
		
		System.out.println("計算陣列");
		//2.
		System.out.println("A中的奇數與偶數各有多少");
		int odd=0;//奇數 數目計算
		int even=0;//偶數 數目計算
		int eA[];//偶數 存arr
		eA=new int[6];
		int oA[];//奇數 存arr
		oA=new int[6];
		for(int i=0;i<6;i++) {
			if((A[i]%2)==0) {
				eA[even]=A[i];
				even++;
			}
			else {
				oA[odd]=A[i];
				odd++;
			}
		}
		System.out.printf("A中的奇數有: %d\n偶數有: %d\n",odd,even);
		
		//3.
		int max=0;
		for(int i=0;i<6;i++) {
			if(oA[i]>max) {
				max=oA[i];
			}
		}
		System.out.printf("奇數的最大值: %d\n",max);
		max=0;
		for(int i=0;i<6;i++) {
			if(eA[i]>max) {
				max=eA[i];
			}
		}
		System.out.printf("偶數的最大值: %d\n",max);
		//4.
		Scanner arr = new Scanner(System.in);/*宣告Scanner arr變數*/
		System.out.print("請輸入陣列A的六個值\n");
		for(int i=0;i<6;i++) {
			A[i]=arr.nextInt();
		}
	}

}
