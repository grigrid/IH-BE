package Challenges.ChallengeFour;



// import java.util.ArrayList;
// import java.util.List;

public class ChallengeFour {
    public static void main(String[] args) {

        Integer[] nums = {1, 2, 2};
        average(nums);
        
        System.out.println(average(nums));

    }

    public static double average(Integer[] numList) { 
        double suma = 0;
        for (int i = 0; i < numList.length; i++) {
            suma += numList[i];
        }
        double resultSum = suma / numList.length;
        return resultSum;
    }
}
