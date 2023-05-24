package P4;

import java.util.Scanner;
class Date{
	private int month;
    private int day;
    private int year;
    public void set_month(int m) {
    	month=m;
    }
    public void set_day(int d) {
    	day=d;
    }
    public void set_year(int y) {
    	year=y;
    }
    public double get_age(Date D) {
    	double age=0.0;
    	double m=0.0;
    	age=(double)(D.year-1)-(double)(this.year-1)-1;
    	age=age+(float)((12f-this.month)/12f)+(float)(D.month/12f);
    	return age;
    }
    public boolean check_date(Date d) {
    	boolean t=true;
    	if(this.year<d.year) {
    		System.out.println("you haven't been born yet.");
    		t=false;
    	}
    	else if(month<0||month>12) {
    		System.out.println("an invalid month");
    		t=false;
    	}
    	else if(year<1000||year>9999) {
    		System.out.println("an invalid year");
			t=false;
		}
    	else if(day<0||day>31) {
    		System.out.println("an invalid day");
			t=false;
    	}
		else if(month==2&&day>29) {
			System.out.println("an invalid day");
			t=false;
		}
		else if(month==4&&day>30) {
			System.out.println("an invalid day");
			t=false;
		}
		else if(month==6&&day>30) {
			System.out.println("an invalid day");
			t=false;
		}
		else if(month==9&&day>30) {
			System.out.println("an invalid day");
			t=false;
		}
		else if(month==11&&day>30) {
			System.out.println("an invalid day");
			t=false;
		}
		else {
			t=true;
		}
    	return t;
    }
}
public class Main {

	public static void main(String args[]) {
		Scanner scan =new Scanner(System.in);
		Date dateOfBirth = new Date();
        Date currentDate = new Date();
        int birth_d,birth_m,birth_y;
        int cur_d,cur_m,cur_y;
        boolean test=true;
        birth_d=scan.nextInt();
        birth_m=scan.nextInt();
        birth_y=scan.nextInt();
        
        dateOfBirth.set_day(birth_d);
        dateOfBirth.set_month(birth_m);
        dateOfBirth.set_year(birth_y);
        
        test=dateOfBirth.check_date(dateOfBirth);
        
        cur_d=scan.nextInt();
        cur_m=scan.nextInt();
        cur_y=scan.nextInt();
        
        currentDate.set_day(cur_d);
        currentDate.set_month(cur_m);
        currentDate.set_year(cur_y);
        if(test) {
        test=currentDate.check_date(dateOfBirth);
        }
        
        
        if(test) {
        	System.out.printf("Your age is %2.1f\n",dateOfBirth.get_age(currentDate));
        }
        
	}

}
