package com.day23sept.Exam;
public interface Moveable {
    public static void main(String[] args) {

    }
    public static int[] balancer(int[] numList, int sum) {
        while (sumArray(numList) < sum) {

            int lowerIndex = 0;
            int lowerValue = Integer.MAX_VALUE;

            for(int i=0; i<numList.length; i++) {
                if (numList[i] < lowerValue) {
                    lowerIndex = i;
                    lowerValue = numList[i];
                }
            }
            numList[lowerIndex]++;
        }
        return numList;
    }
    public static int sumArray(int[] array) {
        int sum = 0;
        for (int item: array) {
            sum+=item;
        }
        return sum;
    }
}


