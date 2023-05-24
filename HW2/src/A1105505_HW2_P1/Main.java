package A1105505_HW2_P1;



import java.util.*;  

class Fraction
{
        private int numerator;				/*定義私有變數*/
        private int denominator;			/*定義私有變數*/
        
        public void set_numerator(int n)
        {
        	numerator=n;				/*將傳入的數值n存入私有變數numerator(分子)*/
        }
        public void set_denominator(int d)
        {
        	denominator=d;				/*將傳入的數值d存入私有變數denominator(分母)*/
        }
        public void displays_fraction()
        {
        	System.out.println(numerator+"/"+denominator);	/*由於只要output做出運算後的樣子，因此用字串方式print出來*/
        }
        public void displays_equals(Fraction fraction)
        {
        	/*因為如果直接除並比較可能會有0/999之類的問題之類的結果，
        	 * 所以透過(this自己的分子*被比的分母)/(this自己的分母*被比的分子)==1來算
        	 * ex:2/4=1/2
        	 *    2*2/4*1=1
        	 * 另外因為這樣算就會有<1的有小數進而產生0，因此用強制轉型float判斷*/
        	
        	boolean equaltest = 
        	((float)(this.numerator * fraction.denominator) / (float)(this.denominator * fraction.numerator)== 1);

        	if (equaltest == true) {		/*如果boolean結果true*/

        		System.out.println("YES");	/*輸出yes*/

        	} 
        	else {							/*否則(false)*/

        		System.out.println("NO");	/*輸出no*/

        	}

        }    
}
  
public class Main {  
  
    public static void main(String[] args) {  
      
        Scanner input = new Scanner(System.in);  
          
        Fraction fraction1 = new Fraction();  
        int numerator1 = input.nextInt();  
        int denominator1 = input.nextInt();               
        fraction1.set_numerator(numerator1);  
        fraction1.set_denominator(denominator1);      
          
        Fraction fraction2 = new Fraction();  
        int numerator2 = input.nextInt();  
        int denominator2 = input.nextInt();  
        fraction2.set_numerator(numerator2);  
        fraction2.set_denominator(denominator2);  
          
        fraction1.displays_fraction();  
        fraction2.displays_fraction();    
          
        fraction1.displays_equals(fraction2);  
        fraction2.displays_equals(fraction1);  
  
        int new_numerator2 = input.nextInt();  
        int new_denominator2 = input.nextInt();  
          
        fraction2.set_numerator(new_numerator2);  
        fraction2.set_denominator(new_denominator2);          
          
        fraction2.displays_fraction();    
          
        fraction2.displays_equals(fraction1);  
          
    }  
      
}  
  

