package P1;
import java.util.*;
public class Main {

	public static void main(String[] args) { 
		Scanner scan=new Scanner(System.in);
		int m,n;
		long a;
		m=scan.nextInt();
		n=scan.nextInt();
		long [][][] img=new long[m][n][3];
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				for(int k=0;k<3;k++) {
					a=scan.nextLong();
					if(a<0L) {
						a=0L;
					img[i][j][k]=a;
					}
					else if(a>255L) {
						a=255L;
						img[i][j][k]=a;
					}
					else {
						img[i][j][k]=a;
					}
				}
			}
		}
		String s;
		while(scan.hasNext()) {
			s=scan.next();
			if(s.equalsIgnoreCase("P")) {
				for(int i=0;i<img.length;i++) {     
				       for(int j=0;j<img[i].length;j++)
				       {
				    	   System.out.print("(");
				          for(int k=0;k<img[i][j].length;k++) {
				             System.out.print(img[i][j][k]+",");
				          }
				          System.out.print(")");
				       }
				       System.out.println();
				}
				System.out.println("-");
			}
			if(s.equalsIgnoreCase("R")) {
				for(int i=0;i<img.length;i++)
				       for(int j=0;j<img[i].length;j++)
				       {
				          img[i][j][0]+=30L;       
				          if(img[i][j][0]>255L)
				             img[i][j][0]=255L;
				       }
			}
			if(s.equalsIgnoreCase("G")) {
				for(int i=0;i<img.length;i++)
				       for(int j=0;j<img[i].length;j++)
				       {
				          img[i][j][1]-=30L;      
				          if(img[i][j][1]<0L)
				             img[i][j][1]=0L;
				       }
			}
			if(s.equalsIgnoreCase("E")) {
				break;
			}
		}
	
	
		
	}

}
