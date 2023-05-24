package FlowControl;

import java.util.Scanner;

public class flowcontrol_3_2 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input_1,input_2;    
        input_1=scanner.nextInt();        
        input_2=scanner.nextInt();
        
        while (scanner.hasNext()) {                    
            int input_now;        
            input_now=scanner.nextInt();            
            if(input_now==input_1+input_2) {
            	System.out.print("RIGHT!\n");
            	break;
            }
            else {
            	System.out.print("WRONG!\n");
            }
        }
    }

}
