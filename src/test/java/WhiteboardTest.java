import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WhiteboardTest {

    private Whiteboard whiteboard;

    @Before
    public void setup(){
        whiteboard = new Whiteboard();
    }

    @Test
    public void oddNumbers() {
        //Given
        int[] arr = {2, 3, 4, 5, 6, 7, 8, 9};
        String expected = "[3, 5, 7, 9]";
        //when
        String actual = Arrays.toString(whiteboard.oddNumbers(arr));
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void reverse1(){
        //Given
        String given = "Hello World";
        String expected = "dlroW olleH";
        //When
        String actual = whiteboard.reverse1(given);
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void reverse2(){
        //Given
        String given = "Hello World";
        String expected = "dlroW olleH";
        //When
        String actual = whiteboard.reverse2(given);
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void palindromeTest1(){
        //Given
        String str = "racecar";
        //then
        Assert.assertTrue(whiteboard.isPalindrome(str));
    }

    @Test
    public void palindromeTest2(){
        //Given
        String str = "racecaw";
        //then
        Assert.assertFalse(whiteboard.isPalindrome(str));
    }

    @Test
    public void getAverageTest(){
        //Given
        Integer[] arr = {1, 2, 55, 20, 100};
        List<Integer> list = new ArrayList<>();
        for(Integer i : arr){
            list.add(i);
        }
       Double expected = 35.6;
        //When
        Double actual = whiteboard.getAverage(list);
        //Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testPara(){
        String given = "((dscfd)))";
         Assert.assertFalse(whiteboard.openClosePara(given));
    }

    @Test
    public void testPara2(){
        String given = "(((dscfd)))";
        Assert.assertTrue(whiteboard.openClosePara(given));
    }

    @Test
    public void testPara3(){
        String given = ")()()()()(";
        Assert.assertFalse(whiteboard.openClosePara(given));
    }

    @Test
    public void testPara4(){
        String given = "((()))())()(";
        Assert.assertFalse(whiteboard.openClosePara(given));
    }

    @Test
    public void testRot1(){
        String one = "string";
        String two = "ingstr";

        //Then
        Assert.assertTrue(whiteboard.checkIfRotation(one, two));
    }

    @Test
    public void testRot2(){
        String one = "string";
        String two = "gnirts";

        //Then
        Assert.assertFalse(whiteboard.checkIfRotation(one, two));
    }

    @Test
    public void testFib(){
        //Given
        int num = 7;
        String expected = "[0, 1, 1, 2, 3, 5, 8]";
        //WHen
        String actual = Arrays.toString(whiteboard.fibSequence(num));
        //Then
        Assert.assertEquals(expected, actual);
    }
}
