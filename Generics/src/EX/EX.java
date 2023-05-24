package EX;
import java.util.ArrayList;
class Marks <M extends Number> {
    public Marks() {
    }
    // Computing average
    public double orderAverage(ArrayList<M> arr) {
    	
        double total = 0;
        for(M val: arr) {
            total += val.doubleValue();
        }
        return total/arr.size();
    }
}

public class EX {

	public static void main(String[] args) {     
        //Array list of int
        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
       //creating object of MathClas
        Marks<Integer> intMath = new Marks<>();
       // Displaying Average 
        System.out.println("The Average is : " + intMath.orderAverage(intList));
               //Array list of double
        ArrayList<Double> doubleList = new ArrayList<>();
        doubleList.add(1.23);
        doubleList.add(2.34);
        doubleList.add(3.0);
        // Creating object of mathclass
        Marks<Double> doubleMath = new Marks<>();
        // Displaying Average 
        System.out.println("The Average is : " +  doubleMath.orderAverage(doubleList));
       //Array list of long
        ArrayList<Long> longList = new ArrayList<>();
        longList.add(1L);
        longList.add(2L);
        longList.add(3L);
        //Creating object of MathClass
       Marks<Long> longMath = new Marks<>();
        // Displaying Average
        System.out.println("The Average is : " + longMath.orderAverage(longList));

}
}
