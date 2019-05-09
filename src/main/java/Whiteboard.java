import java.util.*;


public class Whiteboard {


    public int countOdds(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                count++;
            }
        }
        return count;
    }

    public int[] oddNumbers(int[] arr) {
        int[] answer = new int[countOdds(arr)];
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                answer[counter++] = arr[i];
            }

        }
        return answer;
    }


    public int[] streamOdds(int[] arr) {

        return Arrays.stream(arr)
                .filter(num -> num % 2 != 0)
                .toArray();

    }

    public String reverse1(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        return reverse;
    }

    public String reverse2(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public boolean isPalindrome(String str) {
        return str.equalsIgnoreCase(reverse2(str));
    }

    public Double getAverage(List<Integer> list) {
        Double total = 0.0;
        for (Integer i : list) {
            total += i;
        }
        return total / list.size();
    }

    public boolean openClosePara(String str) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                count++;
            } else if (str.charAt(i) == ')') {
                count--;
            }
            if (count < 0) {
                return false;
            }
        }
        if (count == 0) {
            return true;
        }
        return false;
    }

    public boolean checkIfRotation(String one, String two) {
        String concat = one + one;

        return concat.contains(two);
    }


    public String removeDups(String str) {
        char[] arr = str.toCharArray();
        Set<Character> set = new LinkedHashSet<>();
        for (Character c : arr) {
            set.add(c);
        }
        StringBuilder sb = new StringBuilder();
        for (Character ch : set) {
            sb.append(ch);
        }
        return sb.toString();
    }


    public static void main(String[] args) {
        Whiteboard whiteboard = new Whiteboard();

        int[] arr = {2, 3, 4, 5,5, 5, 6, 7, 8,8, 9};
        String hello = "Hello World";
        String racecar = "Rotator";
        List<Integer> list = new ArrayList<>();
        for (int i : arr) {
            list.add(i);
        }

        String delim = "{([])}99";
        long startTime = System.currentTimeMillis();

        String dups = "Hello Friend";

//        System.out.println(Arrays.toString(whiteboard.streamOdds(arr)));
//        System.out.println(Arrays.toString(whiteboard.oddNumbers(arr)));
//        System.out.println(whiteboard.reverse1(hello));
//        System.out.println(whiteboard.reverse2(hello));
//        System.out.println(whiteboard.isPalindrome(racecar));
//        System.out.println(whiteboard.getAverage(list));
//        System.out.println(whiteboard.removeDups(dups));
//        System.out.println(whiteboard.paraChecker(delim));
//        System.out.println(whiteboard.stackChecker(delim));
//        System.out.println(Arrays.toString(whiteboard.fibSequence(50)));
//        System.out.println(whiteboard.fibNumber(9));
        System.out.println(Arrays.toString(whiteboard.collectDups(arr)));
        System.out.println(whiteboard.getMostCommon(arr));


        long endTime = System.currentTimeMillis();

        System.out.println("That took " + (endTime - startTime) + " milliseconds");
    }


    public boolean checkDelim(String input) {
        Stack<Character> theStack = new Stack<>();

        for (int j = 0; j < input.length(); j++) {
            char ch = input.charAt(j);
            if (ch == '{' || ch == '[' || ch == '(') {
                theStack.push(ch);
            } else if (ch == '}' || ch == ']' || ch == ')') {
                if (!theStack.isEmpty()) {
                    char check = theStack.pop();
                    if ((ch == '}' && check != '{') || (ch == ']' && check != '[') || (ch == ')' && check != '(')) {
                        return false;
                    }
                }
            }
        }
        if (!theStack.isEmpty()) {
            return false;
        }
        return true;
    }

    public int paraChecker(String str) {
        int counter = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                counter++;
            } else if (str.charAt(i) == ')') {
                counter--;
            }
            if (counter < 0) {
                return -1;
            }
        }
        if (counter == 0) {
            return 0;
        }
        return -1;
    }

    public int stackChecker(String str) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            Character ch = str.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {
                if (!stack.isEmpty()) {
                    Character checker = stack.pop();
                    if (ch == ')' && checker != '(' || ch == '}' && checker != '{' || ch == ']' && checker != '[') {
                        return -1;
                    }
                } else if (stack.isEmpty()) {
                    return -1;
                }
            }
        }
        if (!stack.isEmpty()) {
            return -1;
        }
        return 0;
    }

    public long[] fibSequence(int num) {
        long[] arr = new long[num];
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                arr[i] = 0;
            } else if (i <= 2) {
                arr[i] = 1;
            } else {
                arr[i] = arr[i - 1] + arr[i - 2];
            }
        }
        return arr;
    }

    public long fibNumber(int pos){
        return fibSequence(pos)[pos-1];
    }

    public int[] collectDups(int[] arr){
        int[] answer = new int[0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] == arr[j] && i != j){
                    int[] temp = Arrays.copyOf(answer, answer.length+1);
                    temp[temp.length-1] = arr[i];
                    answer = temp;
                }
            }
        }
        return answer;
    }

    public static int getMostCommon(int[] arr) {
        int mostCommon = arr[0];
        int counter = 1;

        for (int i = 0; i < arr.length - 1; i++){
            int testObj = arr[i];
            int numberOfOccur = getNumberOfOccurrences(arr, testObj);

            if (numberOfOccur > counter){

                mostCommon = testObj;
                counter = numberOfOccur;

            }
        }
        return mostCommon;
    }

    public static int getNumberOfOccurrences(int[] objectArray, int objectToCount) {
        int counter = 0;
        for(int x = 0; x<= objectArray.length-1; x++){
            if(objectArray[x] == objectToCount){
                counter++;
            }
        }

        return counter;
    }
}

