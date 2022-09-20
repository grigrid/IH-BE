import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arrayNumbers = {2,5,3,8,14,12};
        /* primera opcion */
        int result = 1;
        for (int arrayNumber : arrayNumbers) {
            result *= arrayNumber;
        }
        result *= arrayNumbers[0];
        System.out.println(result);

        /* Segunda opcion */

        for (int i = arrayNumbers.length-1; i >= 0 ; i--) {
            System.out.println(arrayNumbers[i]);
        }

       /* int[] newArray = new int[arrayNumbers.length];
        for (int i = arrayNumbers.length-1; i >= 0 ; i--) {

        }
        System.out.println(Arrays.toString(newArray));*/



        System.out.println(Arrays.toString(arrayNumbers));
        Arrays.sort(arrayNumbers);
        System.out.println("-----ARRAY SORT-----");
        System.out.println(Arrays.toString(arrayNumbers));
    }
}
