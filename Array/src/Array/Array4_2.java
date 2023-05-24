package Array;

/*Reads in 5 scores and shows how much each
score differs from the highest score.
Output:
Enter 5 scores:
80 99.9 75 100 85.5
The highest score is 100
The scores are:
80 differs from max by 20
99.9 differs from max by 0.1*/

import java.util.Scanner;//輸入涵式庫//載入Scanner類別

public class Array4_2 {

	public static void main(String[] args) {
		Scanner score=new Scanner(System.in);
		float s[];
		s=new float [5];
		System.out.print("Enter 5 scores:\n");
		for(int i=0;i<5;i++) {
			s[i]=score.nextFloat();
		}
		float max=0.0f;
		for(int i=0;i<5;i++) {
			if(s[i]>max) {
				max=s[i];
			}
		}
		System.out.printf("The highest score is %2.1f\n", max);
		System.out.print("The scores are:\n");
		for(int i=0;i<5;i++) {
			System.out.printf("%2.1f differs from max by %2.1f\n", s[i],max-s[i]);
		}

	}
}