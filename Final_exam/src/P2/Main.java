package P2;

//涵式庫
import java.util.ArrayList;
import java.util.Scanner;

class PriorityQueue<T>{
	ArrayList<T> alist=new ArrayList<T>();
	ArrayList<Integer> plist=new ArrayList<Integer>();	
	public void Add_String(int p,T item) {
		alist.add(item);     		
		plist.add(p);
	} 
	public void Add_Int(int p,T item) {
		alist.add(item);     		
		plist.add(p);
	} 
	
	public T Remove_max(){
		int i=-1;	
		int count=0;
		if(alist.isEmpty()) {			
			System.out.println("empty");
			return null;				
		}
		else {							
			for(Integer element:plist) {
				if(element>i) {			
					count=plist.indexOf(element);
					i=element;			
				}
			}
			T str=alist.get(count);		
			alist.remove(count);		
			plist.remove(count);	
			return str;					
		}
	}
	
	public T Remove_min(){
		int i=999999999;	
		int count=0;
		if(alist.isEmpty()) {			
			System.out.println("empty");
			return null;				
		}
		else {							
			for(Integer element:plist) {
				if(element<i) {			
					count=plist.indexOf(element);
					i=element;			
				}
			}
			T str=alist.get(count);		
			alist.remove(count);		
			plist.remove(count);	
			return str;					
		}
	}
	public T Clear(){					
		if(alist.isEmpty()) {			
			System.out.println("empty");
			return null;				
		}
		else {							
			alist.clear();				
			plist.clear();
			System.out.println("clear done");
			return null;				
		}
	}
	public T Show() {					
		if(alist.isEmpty()) {			
			System.out.println("now:empty"); 
			return null;
		}
		else {							
			System.out.print("now:");
			for(T element:alist) {		
				System.out.print(plist.get(alist.indexOf(element))+":"+element+"/");
			}
			System.out.println();
			return null;
		}
	}
	
	public T Show_sorted() {		
		
		if(alist.isEmpty()) {			
			System.out.println("now(s):empty"); 
			return null;
		}
		else {		
			ArrayList<T> alist2=new ArrayList<T>();				
			ArrayList<Integer> plist2=new ArrayList<Integer>();
			for(T test:alist) {
				alist.add(test);
			}
			
			System.out.println("now(s):");
			for(T element:alist) {		
				System.out.println(plist.get(alist.indexOf(element))+":"+element+"/");
			}
			System.out.println();
			return null;
		}
	}
	
	public void test_all_type() {
		
	}
}

public class Main {
	public static void main(String[] args) {
		
		PriorityQueue<String> q=new PriorityQueue<String>();
		PriorityQueue<Integer> q2=new PriorityQueue<Integer>();
		Scanner scan=new Scanner(System.in);				
		String cmd;				
		int p;	
		int item2;
		String item;			
		while(scan.hasNext()) {	
			cmd=scan.next();	
			
			switch(cmd) {			
				case"A":{			
					p=scan.nextInt();
					item=scan.next();
					q.Add_String(p, item);	
					break;
				}
				case"a":{			
					p=scan.nextInt();
					item2=scan.nextInt();
					q2.Add_Int(p, item2);	
					break;
				}
				case"R":{
					String r=q.Remove_max();
					if(r==null) {		
						break;			
					}
					else {
					System.out.println(r);
					}
					break;				
				}
				case"r":{			
					String r=q.Remove_min();
					if(r==null) {		
						break;			
					}
					else {
					System.out.println(r);
					}
					break;				
				}
				case"S":{			
					q.Show();		
					break;			
				}
				case"C":{			
					q.Clear();		
					break;			
				}
				case"E":{			
					return;			
				}
				default:{			
					break;
				}
			
			}
		}
		
	}

}
