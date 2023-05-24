package FlowControl;

public class FlowControl {
//3-1
	public static void main(String[] args) {

	  System.out.print("\n1.\n");
      for(int i=1;i<6;i++) {
	    for(int j=0;j<i;j++) {
	      System.out.print("*");
        }
	   System.out.print("\n"); 
      }
      System.out.print("\n2.\n");
      for(int i=5;i>0;i--) {
	    for(int j=0;j<i;j++) {
	      System.out.print("*");
        }
	    System.out.print("\n");
      }
      System.out.print("\n3.\n");
      for(int i=1;i<4;i++) {
    	  for(int j=0;j<2*i-1;j++) {
    		  System.out.print("*");
    	  }
    	  System.out.print("\n");
      }
      for(int i=2;i>0;i--) {
    	  for(int j=0;j<2*i-1;j++) {
    		  System.out.print("*");
    	  }
    	  System.out.print("\n");
      }
	}
	

}
