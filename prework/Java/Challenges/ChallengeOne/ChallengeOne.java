package Java.Challenges.ChallengeOne;


public class ChallengeOne {
    public static void main(String[] args) {
        Integer[] numIntegers =  {1,2,3, 20, 50, -10,-20, 100, -30, 123, 122};
        Maxim max = new Maxim();
        System.out.println( max.maxinumA(numIntegers));
    }
}
