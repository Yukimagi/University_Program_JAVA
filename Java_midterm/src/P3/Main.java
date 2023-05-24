package P3;

import java.util.Scanner;


class Fractions
{
        private long numerator=0L;				
        private long denominator=0L;			
        
        public void set_fractions_numerator(int n)
        {
        	numerator=n;				
        }
        public void set_fractions_denominator(int d)
        {
        	denominator=d;				
        }
        public void show_the_fractions()
        {
        	System.out.println(numerator+"/"+denominator);	
        }
        public void show_is_equal(Fractions f)
        {
        	
        	boolean test = ((double)(this.numerator * f.denominator) / (double)(this.denominator * f.numerator)== 1f);
        	if(this.numerator==0&&(f.numerator==0||f.denominator==0)) {
        		test=true;
        	}
        	else if(this.denominator==0&&(f.numerator==0||f.denominator==0)) {
        		test=true;
        	}

        	if (test == true) {		

        		System.out.println("TRUE");	

        	} 
        	else {							

        		System.out.println("FALSE");	

        	}

        }    
}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);  
        
        Fractions fraction1 = new Fractions();  
        int numerator1 = input.nextInt();  
        int denominator1 = input.nextInt();               
        fraction1.set_fractions_numerator(numerator1);  
        fraction1.set_fractions_denominator(denominator1);    
          
        Fractions fraction2 = new Fractions();  
        int numerator2 = input.nextInt();  
        int denominator2 = input.nextInt();  
        fraction2.set_fractions_numerator(numerator2);  
        fraction2.set_fractions_denominator(denominator2);  
          
        Fractions fraction3 = new Fractions();  
        int numerator3 = input.nextInt();  
        int denominator3 = input.nextInt();  
        fraction3.set_fractions_numerator(numerator3);  
        fraction3.set_fractions_denominator(denominator3);  
          
        fraction1.show_the_fractions();  
        fraction2.show_the_fractions();   
        fraction3.show_the_fractions();   
          
        fraction1.show_is_equal(fraction2);  
        fraction1.show_is_equal(fraction3);  
          
        int new_numerator1 = input.nextInt();  
        int new_denominator1 = input.nextInt();       
        fraction1.set_fractions_numerator(new_numerator1);  
        fraction1.set_fractions_denominator(new_denominator1);        
          
        fraction1.show_is_equal(fraction2);  
        fraction1.show_is_equal(fraction3);  
	}

}