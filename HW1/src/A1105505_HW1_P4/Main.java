package A1105505_HW1_P4;//測資時不要交(package)名稱

import java.util.Scanner;//輸入涵式庫

public class Main {//public class Main(題目要求)
	

           public static void main(String[] args) {
               Scanner color = new Scanner(System.in);/*宣告Scanner color變數*/
               String s;//宣告變數
               boolean test=true;//宣告變數設boolean值為true
                while(color.hasNext()) {//重複讀入直到break跳脫while迴圈
	              s=color.next();//讀入變數
	              test=true;//設boolean值為true
	                if((s.charAt(4)=='R')||(s.charAt(4)=='G')||(s.charAt(4)=='B')) {/*當最後一個值是RGB時做以下判斷*/
	                  for(int i=0;i<4;i++) {//在前4個值中判斷
	    	            if((s.charAt(i)=='R')||(s.charAt(i)=='G')||(s.charAt(i)=='B')) {//如果是RGB
	    	              if(i==0) {//第一個值是否相等
	    		            if(s.charAt(0)==s.charAt(1)) {
	    			          System.out.print("INVALID\n");//是，做錯誤回應
	    			          test=false;//將test設錯誤
	    			          break;//跳出for迴圈
	    		             }
	    	              }
	    	              else {//第2~4個值是否相等
	    		            if((s.charAt(i)==s.charAt(i+1))||(s.charAt(i)==s.charAt(i-1))) {
		    		          System.out.print("INVALID\n");//是，做錯誤回應
		    		          test=false;//將test設錯誤
		    		          break;//跳出for迴圈
	    		            }
		                  }
	    	            }
	    	            else {//在一開始1~4的值如果非RGB則會到這裡輸出結果為錯誤
	    		         System.out.print("INVALID\n");
		    	         test=false;
	    	            }
	                   }
	               }
	               else {//在一開始第5的值如果非RGB則會到這裡輸出結果為錯誤
	    	         System.out.print("INVALID\n");
		             test=false;
	               }
	    	 
	             if(test==true) {//最後都沒報錯則輸出正確回應
		    	    System.out.printf("VALID:%S\n",s);
			       
		         }
	       
	       }
	      
	     


       }
}
