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
