import java.util.Arrays;
import java.util.Hashtable;

public class Main {



    public static void main(String[] args) {
        Hashtable<String, Person> hashtable = new Hashtable<String, Person>();
        BubbleSort bubbleSort = new BubbleSort();
        FizzBuzz fizzBuzz = new FizzBuzz();
        RPS rps = new RPS();


        String rockpaperscissors = "RPPRSRSPPPS";
        String input = "sCISSors";

        System.out.println(rps.RPS(rockpaperscissors, input));
    }
}
