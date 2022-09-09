package Challenges.ChallengeFour;

class Average {

    public double average(Integer[] numList) { 
        double suma = 0;
        for (int i = 0; i < numList.length; i++) {
            suma += numList[i];
        }
        double resultSum = suma / numList.length;
        return resultSum;
    }



}
