package P1;


import java.util.ArrayList;
import java.util.Scanner;
import java.util.Comparator;
public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);	
		String cmd;								
		String term;							
		boolean f;								
		ArrayList<String> alist=new ArrayList<String>();
		
		while(scan.hasNext()) {					
			cmd=scan.next();					
			
				switch(cmd) {					
					case"A":{					
						term=scan.next();		
						if(alist.contains(term)) {
							alist.add(term);		
							System.out.println(term+" added");
						}
						else {					
						alist.add(term);		
						System.out.println(term+" added");
						}
						break;
					}
					case"C":{
						int c=0;
						if(alist.isEmpty()) {
							System.out.println("COUNT:empty");
						}
						else {
						for(String element:alist){
							c++;
						}
						System.out.println("COUNT:"+c);
						}
						break;
					}
					case"c":{
						ArrayList<String> tlist=new ArrayList<String>();
						int c=0;
						f=true;
						if(alist.isEmpty()) {
							System.out.println("COUNT(N):empty");
						}
						else {
						for(String element:alist){
							if(tlist.contains(element)) {
								continue;
							}
							else{
								c++;
								tlist.add(element);
							}
						}
						System.out.println("COUNT(N):"+c);
						}
						tlist.clear();
						break;
					}
					case"R":{					
						term=scan.next();		
						if(alist.contains(term)) {
						alist.remove(alist.indexOf(term));
						System.out.println(term+" deleted");
						}
						else {					
							System.out.println(term+" not existed");
						}
						break;
					}
					case"D":{					
						if(alist.isEmpty()) {	
							System.out.println("DISPLAY:empty");
						}
						else {
							int i=0;
							System.out.print("DISPLAY:");
						for(String element:alist) {
							if(i<alist.size()-1) {
								i++;
							System.out.print(element+"/");
							}
							else {
								System.out.print(element);
							}
						}
						System.out.println();
						}
						break;
					}
					case"d":{		
						ArrayList<String> tlist=new ArrayList<String>();
						if(alist.isEmpty()) {	
							System.out.println("DISPLAY(S):empty");
						}
						else {
							int i=0;
							System.out.print("DISPLAY(S):[");
							for(String element:alist) {
								tlist.add(element);
							}
							tlist.sort(Comparator.naturalOrder());
						for(String element:tlist) {
							if(i==0) {
								i++;
								System.out.print(element+",");
							}
							else if(i<tlist.size()-1) {
								i++;
							System.out.print(" "+element+",");
							}
							else {
								System.out.print(" "+element);
							}
						}
						System.out.println("]");
						}
						tlist.clear();
						break;
					}
					case"S":{					
						f=false;
						term=scan.next();		
						for(String element:alist){
							if(term.equals(element)) {
								f=(term.equals(element));
								break;					
							}
						}
						if(f) {							
							System.out.println(term+" found");
						}
						else {							
							System.out.println(term+" not found");
						}
						break;
					}
					case "E":{					                                                    
						return;					
					}
					default:{					
						
						break;
					}
				
			}
		}
	}

}
