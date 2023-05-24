package mid_practice;

import java.util.Scanner;
public class prctice {

	public static void main(String[] args) { 
		Scanner guess=new Scanner(System.in);
		String ans=guess.next();
		String s;
		int a=0;
		int b=0;
		int []record=new int[4];
		for(int i=0;i<4;i++) {
			record[i]=0;
		}
		while(guess.hasNext()) {
			s=guess.next();
			for(int i=0;i<4;i++) {
				if(s.charAt(i)==ans.charAt(i)) {
					record[i]=1;
					a++;
				}
			}
			for(int i=0;i<4;i++) {
				for(int j=0;j<4;j++) {
					if(s.charAt(i)!=ans.charAt(i) && s.charAt(i)==ans.charAt(j)) {
						if(record[0]==0 && j==0) {
							b++;
							record[0]=1;
							break;
						}
						if(record[1]==0 && j==1) {
							b++;
							record[1]=1;
							break;
						}
						if(record[2]==0 && j==2) {
							b++;
							record[2]=1;
							break;
						}
						if(record[3]==0 && j==3) {
							b++;
							record[3]=1;
							break;
						}
					}
				}
			}
			System.out.println(a+"A "+b+"B");
			a=0;
			b=0;
			for(int i=0;i<4;i++) {
				record[i]=0;
			}
		}
	}
}
