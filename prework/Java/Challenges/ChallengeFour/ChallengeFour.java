package Java.Challenges.ChallengeFour;

public class ChallengeFour {
    public static void main(String[] args) {

        Integer[] nums = {1, 2, 2};
        average(nums);
        System.out.println(average(nums));
        
        
        Integer[] nummbers = {2, 2, 3};
        Average averageNum = new Average();
        averageNum.average(nummbers);
        System.out.println(averageNum.average(nummbers));
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
