package P2;
import java.util.*;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);  
        
        long S=0L,D=0L;
        while(input.hasNext()) {
        	S=input.nextLong();
        	D=input.nextLong();
        	long num=S;
        	while(num<D) {
        		S++;
        		num=num+S;
        	}
        	System.out.println(S);
        }
        
	}

}
