package A1105505_HW2_P2;

import java.util.*; 

class Pizza
{
        private String sizeofpizza;	/*定義私有變數pizza大小*/
        private int cheeseNo;		/*定義私有變數cheese數量*/
        private int pepperoniNo;	/*定義私有變數pepperoni數量*/
        private int hamNo;			/*定義私有變數hamNo數量*/
        public Pizza() {
        	sizeofpizza = "";		/*以下是將私有變數初始化*/
        	cheeseNo = 0;
        	pepperoniNo = 0;
        	hamNo = 0;
        }
        public Pizza(String size, int cno , int pno , int hno ) {	/*這裡是可以一次存全部*/
        	sizeofpizza=size;		/*將傳入的pizza大小存到私有變數中*/
        	cheeseNo=cno;			/*將傳入的cheese數量存到私有變數中*/
        	pepperoniNo=pno;		/*將傳入的pepperoni數量存到私有變數中*/
        	hamNo=hno;				/*將傳入的ham數量存到私有變數中*/
        }
        public String get_pizza_size() {
        	/*回傳pizza大小*/
        	return sizeofpizza;
        }
        public int get_cheese_num() {
        	/*回傳cheese數量*/
        	return cheeseNo;
        }
        public int get_pepperoni_num() {
        	/*回傳pepperoni數量*/
        	return pepperoniNo;
        }
        public int get_ham_num() {
        	/*回傳ham數量*/
        	return hamNo;
        }
        public void set_pizza_size(String size) {
        	/*將傳入的pizza大小存到私有變數中*/
        	sizeofpizza=size;
        }
        public void set_cheese_num(int cno) {
        	/*將傳入的cheese數量存到私有變數中*/
        	cheeseNo=cno;
        }
        public void set_pepperoni_num(int pno) {
        	/*將傳入的pepperoni數量存到私有變數中*/
        	pepperoniNo=pno;
        }
        public void set_ham_num(int hno) {
        	/*將傳入的ham數量存到私有變數中*/
        	hamNo=hno;
        }
        public double pizza_cost() {
        	double sum=0.0;										/*定義double變數sum以計算全部的金額*/
        	if(sizeofpizza.equalsIgnoreCase("small")) {			/*不管大小寫，如果是small*/
        		
        		sum=cheeseNo*2+pepperoniNo*2+hamNo*2+10.0;		/*回傳佐料*2+10的花費*/
        		
        	}
        	else if(sizeofpizza.equalsIgnoreCase("medium")) {	/*不管大小寫，如果是medium*/
        		
        		sum=cheeseNo*2+pepperoniNo*2+hamNo*2+12.0;		/*回傳佐料*2+12的花費*/
        		
        	}
        	else if(sizeofpizza.equalsIgnoreCase("large")) {	/*不管大小寫，如果是large*/
        		
        		sum=cheeseNo*2+pepperoniNo*2+hamNo*2+14.0;		/*回傳佐料*2+14的花費*/
        		
        	}
        	else {
        		sum=0.0;										/*如果都錯則傳0.0*/
        	}
			return sum;											/*回傳總金額*/
        }
        
        public String get_description() {						/*以下是依題目要求的方式撰寫輸出*/
        														//ex:
        	System.out.println("pizza");							//pizza
        	System.out.println("size:"+this.sizeofpizza);			//size:medium
        	System.out.println("cheese:"+this.cheeseNo);			//cheese:1
        	System.out.println("pepperoni:"+this.pepperoniNo);		//pepperoni:4
        	System.out.println("ham:"+this.hamNo);					//ham:5
        	System.out.printf("cost:$"+pizza_cost());				//cost:$32.0
        	return "\n";
        	
        }
}

/* PRESET CODE BEGIN - NEVER TOUCH CODE BELOW */  

 
  
public class Main   
{     
    public static void main(String[] args)  
    {     
        Scanner input = new Scanner(System.in);    
          
        String pizza1_size = input.nextLine();  
        int pizza1_cheese = input.nextInt();  
        int pizza1_pepperoni = input.nextInt();  
        int pizza1_ham = input.nextInt();  
        Pizza pizza1 = new Pizza(pizza1_size,pizza1_cheese,pizza1_pepperoni,pizza1_ham);  
  
        String pizza1_size_new = input.next();  
        pizza1.set_pizza_size(pizza1_size_new);  
        System.out.println("set size:"+pizza1.get_pizza_size());  
          
        int pizza1_cheese_new = input.nextInt();  
        pizza1.set_cheese_num(pizza1_cheese_new);  
        System.out.println("set cheese:"+pizza1.get_cheese_num());  
          
        System.out.println(pizza1.get_description());  
          
        String pizza2_size = input.next();  
        int pizza2_cheese = input.nextInt();  
        int pizza2_pepperoni = input.nextInt();  
        int pizza2_ham = input.nextInt();         
        Pizza pizza2 = new Pizza(pizza2_size,pizza2_cheese,pizza2_pepperoni,pizza2_ham);  
          
        int pizza2_pepperoni_new = input.nextInt();  
        pizza2.set_pepperoni_num(pizza2_pepperoni_new);  
        System.out.println("set pepperoni:"+pizza2.get_pepperoni_num());  
          
        int pizza2_ham_new = input.nextInt();     
        pizza2.set_ham_num(pizza2_ham_new);  
        System.out.println("set ham:"+pizza2.get_ham_num());  
          
        System.out.println(pizza2.get_description());  
    }  
}  
  
/* PRESET CODE END - NEVER TOUCH CODE ABOVE*/  
