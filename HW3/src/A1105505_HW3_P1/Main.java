package A1105505_HW3_P1;

import java.util.*; //涵式庫
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);	//scanner物件宣告
		String cmd;								//輸入的指令變數宣告
		String term;							//輸入的term變數宣告
		boolean f;								//判斷是否找到的變數宣告
		ArrayList<String> alist=new ArrayList<String>();//建立儲存term之ArrayList
		
		while(scan.hasNext()) {					//當有下一輸入
			cmd=scan.next();					//讀cmd
			
				switch(cmd) {					//將cmd值對應switch
					case"A":{					//當是A
						term=scan.next();		//讀入term
						if(alist.contains(term)) {//如果已contains則輸出existed
							System.out.println(term+" existed");
						}
						else {					//否則增加term於最後的index
						alist.add(term);		
						System.out.println(term+" added");
						}
						break;
					}
					case"D":{					//當是D
						term=scan.next();		//讀入term
						if(alist.contains(term)) {//如果已contains則移除term
						alist.remove(term);
						System.out.println(term+" deleted");
						}
						else {					//否則輸出不存在
							System.out.println(term+" not existed");
						}
						break;
					}
					case"d":{					//當是d
						if(alist.isEmpty()) {	//如果array list無值則輸出空
							System.out.println("empty");
						}
						else {
						for(String element:alist) {//否則用for each展示全部的元素
							System.out.print(element+"/");
						}
						System.out.println();
						}
						break;
					}
					case"S":{					//當是S
						f=false;
						term=scan.next();		//讀入term
						for(String element:alist){//用for each找
							if(term.equals(element)) {//當找到
								f=(term.equals(element));//另存boolean值
								break;					//跳出迴圈
							}
						}
						if(f) {							//如果是true則輸出找到
							System.out.println(term+" found");
						}
						else {							//否則輸出沒找到
							System.out.println(term+" not found");
						}
						break;
					}
					case"s":{					//當是s
						f=false;
						term=scan.next();			//讀入term
						for(String element:alist){	//用for each找
							if(term.equals(element)) {		//當找到
								f=(term.equals(element));;	//另存boolean值
								break;						//跳出迴圈
							}
						}
						char yORn;					//存yes or no的變數
						if(f) {						//如果是true則輸出找到
							System.out.println(term+" found");
							yORn=scan.next().charAt(0);//讀入yes or no
							if(yORn=='y') {			//如果是y則deleted
								alist.remove(term);
								System.out.println(term+" deleted");
							}
							if(yORn=='n') {			//如果是n則not deleted
								System.out.println(term+" not deleted");
							}
						}
						else {						//否則輸出沒找到
							System.out.println(term+" not found");
							yORn=scan.next().charAt(0);
							if(yORn=='y'||yORn=='n')//不管是y or n都不會deleted
							System.out.println(term+" not deleted");
						}
						break;
					}
					case "E":{					//當是E                                                        
						return;					//結束程式
					}
					default:{					//其餘break
						
						break;
					}
				
			}
		}
	}

}
