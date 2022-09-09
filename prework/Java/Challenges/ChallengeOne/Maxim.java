package Java.Challenges.ChallengeOne;
 
public class Maxim {
   

    public Integer maxinumA(Integer[] numList) { 
        int maxi = numList[0];
        for (int i = 0; i < numList.length; i++) {
            if (maxi < numList[i]){
                maxi = numList[i];
            }
        }
        return  maxi;
    }

    public Integer maximumB(Integer[] numList) { 
        int maxi = numList[0];
        for (int i = 0; i < numList.length; i++) {
            maxi = Math.max(maxi, numList[i]);
        }
        return  maxi;
    }
    
}