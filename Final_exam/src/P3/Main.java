package P3;
import java.util.*;
class my_thread extends Thread{
	int N;
	public void run(int N)
	   {
	      for(int i=1;i<=1;i++)
	      {
	    	  int sum=1;
	    	  try
	          {
	             sleep(20);
	          }
	          catch(InterruptedException e){}
	    		  sum=1;
	    		  for(int j=2;j<=N;j++) {
	    			  sum=sum+j;
	    		  }
	    		  System.out.print(sum);
	      }
	   }
}
public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		my_thread my=new my_thread();
		int r=0;
		r=scan.nextInt();
		for(int i=0;i<r;i++) {
			int x=i+1;
			System.out.println("Round "+x+":");
			for(int j=0;j<3;j++) {
			int a=scan.nextInt();
			my.run(a);
			if(j<2) {
				System.out.print(" ");
			}
			else {
				System.out.print("");
			}
			}
			System.out.print("\n");
			if(i<r-1) {
			System.out.println();
			}
		}
	}
}
