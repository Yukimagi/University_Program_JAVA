package other;

import java.util.Scanner;
class Pair<T>
{
    private T data;
    public Pair(T a,T b) {
    	
    }
    public void setData(T newData)
    {
        data = newData;
    }

    public T getData( )
    {
        return data;
    }
}

public class GenericPairDemo
{
   public static void main(String[] args)
   {
        Pair<String> secretPair = new Pair<String>("Happy", "Day");

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter two words:");
        String word1 = keyboard.next();
        String word2 = keyboard.next();
        Pair<String> inputPair = new Pair<String>(word1, word2);
        if (inputPair.equals(secretPair))
        {
            System.out.println("You guessed the secret words");
            System.out.println("in the correct order!");
        }
        else
        {
            System.out.println("You guessed incorrectly.");
            System.out.println("You guessed");
            System.out.println(inputPair);
            System.out.println("The secret words are");
            System.out.println(secretPair);
        }
   }
}
/*
 * public class GenericPairDemo2
{
   public static void main(String[] args)
   {
        Pair<Integer> secretPair = 
             new Pair<Integer>(42, 24);

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int n1 = keyboard.nextInt();
        int n2 = keyboard.nextInt();
        Pair<Integer> inputPair = 
            new Pair<Integer>(n1, n2);
        if (inputPair.equals(secretPair))
        {
            System.out.println("You guessed the secret numbers");
            System.out.println("in the correct order!");
        }
        else
        {
            System.out.println("You guessed incorrectly.");
            System.out.println("You guessed");
            System.out.println(inputPair);
            System.out.println("The secret numbers are");
            System.out.println(secretPair);
        }
   }
}
 * */
