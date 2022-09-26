import java.util.List;

public class MathLibrary {



    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static int sumList(List<Integer> listNum){
        int result = 0;
        for (Integer integer : listNum) {
            result += integer;
        }
        return result;
    }



}
