import java.util.Arrays;
import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;
public class testSelectionSort {
@Test

public void test() {
testPositive();
testNegative();
testMixed();
testDuplicates();
}
    public testSelectionSort() {
    }


    public void testPositive(){
        int[] arr = new int[5];
        arr[0] = 8;
        arr[1] = 9;
        arr[2] = 7;
        arr[3] = 10;
        arr[4] = 2;

        int[] Sortedarr = new int[5];
        Sortedarr[0] = 2;
        Sortedarr[1] = 7;
        Sortedarr[2] = 8;
        Sortedarr[3] = 9;
        Sortedarr[4] = 10;

        assert(Sortedarr[1] < Sortedarr[2]): "Assertion Error!";
        System.out.println(Arrays.toString(Sortedarr));
}

    public void testNegative(){
    	 int[] arr = new int[5];
         arr[0] = -8;
         arr[1] = -9;
         arr[2] = -7;
         arr[3] = -10;
         arr[4] = -2;

         int[] Sortedarr = new int[5];
         Sortedarr[0] = -10;
         Sortedarr[1] = -9;
         Sortedarr[2] = -8;
         Sortedarr[3] = -7;
         Sortedarr[4] = -2;

         assert(Sortedarr[1] < Sortedarr[2]): "Assertion Error!";
         System.out.println(Arrays.toString(Sortedarr));
    }

    public void testMixed(){
        	 int[] arr = new int[5];
             arr[0] = 0;
             arr[1] = -9;
             arr[2] = -7;
             arr[3] = 10;
             arr[4] = 5;

             int[] Sortedarr = new int[5];
             Sortedarr[0] = -9;
             Sortedarr[1] = -7;
             Sortedarr[2] = 0;
             Sortedarr[3] = 5;
             Sortedarr[4] = 10;

             assert(Sortedarr[0] < Sortedarr[1]): "Assertion Error!";
             System.out.println(Arrays.toString(Sortedarr));
    }

        public void testDuplicates(){
        	 int[] arr = new int[5];
             arr[0] = 0;
             arr[1] = -9;
             arr[2] = 5;
             arr[3] = 10;
             arr[4] = 5;

             int[] Sortedarr = new int[5];
             Sortedarr[0] = -9;
             Sortedarr[1] = 0;
             Sortedarr[2] = 5;
             Sortedarr[3] = 5;
             Sortedarr[4] = 10;

             assert(Sortedarr[0] <= Sortedarr[1]): "Assertion Error!";
             System.out.println(Arrays.toString(Sortedarr));
    }

}
