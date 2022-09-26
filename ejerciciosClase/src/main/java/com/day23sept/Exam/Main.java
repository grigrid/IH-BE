package com.day23sept.Exam;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] listNums = {4, 1, 3, 2, 5};
//        System.out.println(Arrays.toString(balancer(listNums, 52)));
//        System.out.println(Arrays.toString(balancer(listNums, 25)));
        System.out.println(Arrays.toString(balancer(listNums, 16)));

    }

    /*public static int[] balancer(int[] numList, int sum) {
        int resultSumArr = 0;

       for (int i = 0; i < numList.length; i++) {
            resultSumArr += numList[i];
            if (resultSumArr >= sum) {
                return numList;
            } else {
                numList[i] = numList[i]+1;
                return numList;
            }
        }
        return null;
    }*/
    public static int[] balancer(int[] array, int num) {

        Arrays.stream(array).sum();

        int sumArr = 0;
        for (int i = 0; i < array.length; i++) {
            sumArr += array[i];
        }

        return array;
    }
}

/*
The method should validate if sum equals the sum of all array elements.
If the sum is lower, you should iterate over the array,
find the smallest element of the array, and sum +1 on this position.
This process should be repeated until the sum of all elements of the array equals to or it is greater of the sum.

Sample Input/Output:
input [4, 1, 3, 2, 5], 52
output [11, 11, 10, 10, 10]

input [4, 1, 3, 2, 5], 25
output [5, 5, 5, 5, 5]

input [4, 1, 3, 2, 5], 5
output [4, 1, 3, 2, 5]*/