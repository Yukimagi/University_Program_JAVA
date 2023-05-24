package A1105505_HW3_P2;

import java.util.*;//涵式庫
class PriorityQueue<T>//建立指定要求的class
{
	ArrayList<T> alist=new ArrayList<T>();				//建立儲存item之ArrayList
	ArrayList<Integer> plist=new ArrayList<Integer>();	//建立儲存priority之ArrayList
	public void add(int p,T item) {//加入arraylist
		alist.add(item);     		//各別加
		plist.add(p);
	} 
	
	public T remove(){//移除arraylist
		int i=-1;	//紀錄最大的priority
		int count=0;//紀錄最大的priority的index位置
		if(alist.isEmpty()) {			//如果是空的
			System.out.println("empty");//輸出empty
			return null;				//回傳null
		}
		else {							//非空
			for(Integer element:plist) {//遍歷所有plist
				if(element>i) {			//如果有更大的priority
					count=plist.indexOf(element);//紀錄index位置
					i=element;			//紀錄priority
				}
			}
			T str=alist.get(count);		//先暫存最大的priority到變數str
			alist.remove(count);		//各別移除
			plist.remove(count);	
			return str;					//回傳
		}
	}
	public T clear() {					//清空arraylist
		if(alist.isEmpty()) {			//如果是空的
			System.out.println("empty");//輸出empty
			return null;				//回傳null
		}
		else {							//非空
			alist.clear();				//各別清空
			plist.clear();
			return null;				//回傳null
		}
	}
	public T show() {					//展現題目要求
		if(alist.isEmpty()) {			//如果空就照下面的印法
			System.out.println("now:"); 
			System.out.println("-----");
			System.out.println("empty");
			System.out.println("-----");
			return null;
		}
		else {							//非空
			System.out.println("now:");
			System.out.println("-----");
			for(T element:alist) {		//遍歷所有alist並依照對印的index印出priority與item
				System.out.println(plist.get(alist.indexOf(element))+":"+element);
			}
			System.out.println("-----");
			return null;
		}
	}
}

public class Main {
	public static void main(String[] args) {
		
		PriorityQueue<String> q=new PriorityQueue<String>();//class object宣告
		Scanner scan=new Scanner(System.in);				//scanner物件宣告
		String cmd;				//輸入的指令變數宣告
		int p;					//輸入的priority變數宣告
		String item;			//輸入的item變數宣告
		while(scan.hasNext()) {	//當有下一輸入
			cmd=scan.next();	//讀cmd
			
			switch(cmd) {			//將cmd值對應switch
				case"A":{			//當是A
					p=scan.nextInt();//讀入p
					item=scan.next();//讀入item
					q.add(p,item);	//加入ArrayList
					break;
				}
				case"R":{			//當是R
					String r=q.remove();//儲存移除的回傳值
					if(r==null) {		//如果是null
						break;			//跳出迴圈
					}
					else {
					System.out.println(r);//印出移除值
					}
					break;				//跳出迴圈
				}
				case"S":{			//當是S
					q.show();		//展示
					break;			//跳出迴圈
				}
				case"C":{			//當是C
					q.clear();		//清除
					break;			//跳出迴圈
				}
				case"E":{			//當是E
					return;			//結束程式
				}
				default:{			//其他break
					break;
				}
			
			}
		}
		
	}

}
