package Class1;
class CalAge{
	private int today_y;
	private int today_m;
	private int today_d;
	private int year;
	private int month;
	private int day;
	public void settoday(int y,int m,int d) {
		today_y=y;
		today_m=m;
		today_d=d;
	}
	public void setbir(int y,int m,int d) {
		year=y;
		month=m;
		day=d;
	} 
	public double old() {
		double old=0.0;
		if((today_m-month)<0) {
			old=today_y-year-1+((double)((12-month+1+today_m)/12));
		}
		else {
			old=today_y-year+((double)((today_m-month)/12));
		}
		return old;
	}
	public boolean test() {
		boolean t=true;
		if(month<0||month>12||year>today_y||day<0||day>31) {
			t=false;
		}
		else if(month==2&&day>29) {
			t=false;
		}
		else if(month==4&&day>30) {
			t=false;
		}
		else if(month==6&&day>30) {
			t=false;
		}
		else if(month==9&&day>30) {
			t=false;
		}
		else if(month==11&&day>30) {
			t=false;
		}
		else {
			t=true;
		}
		return t;
	}
}
public class exercise {
//p.49
	
	public static void main(String args[]) {
		CalAge c1=new CalAge() ;
		c1.settoday(2023,4,11);
		c1.setbir(2002, 10, 28);
		if(c1.test()) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		System.out.printf("%2.1f\n",c1.old());
		
	}
}
