import java.util.Arrays;
import java.util.Hashtable;

public class HashFunction {
    private String[] arr;
    private int arrSize;
    private int itemsInArr = 0;

    public HashFunction(int size) {
        arrSize = size;
        arr = new String[size];
        Arrays.fill(arr, "-1");
    }

    public void hashFunction1(String[] strings, String[] arr) {
        for (int i = 0; i < strings.length; i++) {
            String eleVal = strings[i];
            arr[Integer.parseInt(eleVal)] = eleVal;
        }
    }

    public int getSum1(int n) {
        int ans = 0;
        for (int i = 0; i <= n; i++) {
            ans += i;
        }
        return ans;
    }

    public int getSum2(int n) {
        return n * (n + 1) / 2;
    }


    public String findKey(String key){
        int index = Integer.parseInt(key) % 29;

        while (arr[index] != "-1"){
            if(arr[index] == key){
                System.out.println("key was found in Index "+ index);
                return arr[index];
            }
            ++index;

            index %= arrSize;
        }
        return null;
    }



    public static void main(String[] args) {

        HashFunction function = new HashFunction(30);
//
        String[] elementsToAdd2 = { "100", "510", "170", "214", "268", "398",
                "235", "802", "900", "723", "699", "1", "16", "999", "890",
                "725", "998", "978", "988", "990", "989", "984", "320", "321",
                "400", "415", "450", "50", "660", "624" };

//        function.hashFunction2(elementsToAdd2, function.arr);

//        String[] elementsToAdd2 = {"5", "16", "26"};

        function.hashFunction2(elementsToAdd2, function.arr);

//        System.out.println(function.findKey("984"));

        function.displayTheTable();



//        String[] testingFill = new String[20];
//        Arrays.fill(testingFill, 0, 4, "COOL");
//        Arrays.fill(testingFill, 4, 15, "SHIT");
//        Arrays.fill(testingFill, 15, 20, "COOL");
//        System.out.println(Arrays.toString(testingFill));

//        System.out.println(function.getSum1(100));
//        System.out.println(function.getSum2(100));
    }


    public void hashFunction2(String[] strings, String[] arr) {

        for (int i = 0; i < strings.length; i++) {

            String eleVal = strings[i];
            int index = Integer.parseInt(eleVal) % 29;
            System.out.println("Modulus Index= " + index + " for value " + eleVal);

            while (arr[index] != "-1") {
                ++index;
                System.out.println("Collision Try " + index + " Instead");
                index %= arrSize;
            }
            arr[index] = eleVal;
        }
    }


    public void displayTheTable() {

        int increment = 0;

        for (int m = 0; m < 3; m++) {

            increment += 10;

            for (int n = 0; n < 71; n++)
                System.out.print("-");

            System.out.println();

            for (int n = increment - 10; n < increment; n++) {

                System.out.format("| %3s " + " ", n);

            }

            System.out.println("|");

            for (int n = 0; n < 71; n++)
                System.out.print("-");

            System.out.println();

            for (int n = increment - 10; n < increment; n++) {

                if (arr[n].equals("-1"))
                    System.out.print("|      ");

                else
                    System.out
                            .print(String.format("| %3s " + " ", arr[n]));

            }

            System.out.println("|");

            for (int n = 0; n < 71; n++)
                System.out.print("-");

            System.out.println();

        }

    }


}
