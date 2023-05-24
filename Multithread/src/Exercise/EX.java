package Exercise;

//Java implementation of the above approach
import java.util.*;


class GFG extends Thread{
	
	char  first='e';
	char second='e';
	private int win1;
	private int win2;

public void get_win(int x) {
	if(x==1) {
	win1=win1+1;
	System.out.println("贏了~"+win1+"次!");
	}
	else if(x==2) {
		win2=win2+1;
		System.out.println("贏了~"+win2+"次!");
	}
	
}

public static int compare(char first, char second)
{
  
 // If both players have the same move
 // then it's a draw
 if (first == second)
     return 0;

 if (first == 'R')
 {
     if (second == 'S')
         return 1;
     else
         return -1;
 }
 if (first == 'P')
 {
     if (second == 'R')
         return 1;
     else
         return -1;
 }
 if (first == 'S')
 {
     if (second == 'P')
         return 1;
     else
         return -1;
 }
 
 return 0;
}
//Function that returns 1 if first player wins,
//0 in case of a draw and -1 if second player wins
public void run()
{
   for(int i=1;i<=5;i++)
   {
      for(int j=0;j<100000000;j++);
      Random random=new Random();
  		int a=random.nextInt(3)+1;
  		if(a==1) {
  			first='R';
  		}
  		else if(a==2) {
  			first='P';
  		}
  		else {
  			first='S';
  		}
  		Random random2=new Random();
  		int a2=random.nextInt(3)+1;
  		if(a2==1) {
  			second='R';
  		}
  		else if(a2==2) {
  			second='P';
  		}
  		else {
  			second='S';
  		}
  		
  		
  		while(first!='e'&&second!='e') {
			int test=compare(first,second);
			if(test==1) {
				System.out.println("first win!!");
				get_win(1);
			}
			else if(test==-1) {
				System.out.println("second win!!");
				get_win(2);
			}
			first='e';
			second='e';
		}
   }
}

}

public class EX {
	public static void main(String args[])
	{
		
		GFG p1=new GFG();
		p1.start();

		
		
	}
}


