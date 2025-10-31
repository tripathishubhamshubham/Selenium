package JavaPractice.Array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SecondHighestArray {


        public static void main(String[] args) {
            int[] arr = {5, 9, 1, 7, 3, 9};

            int first = Integer.MIN_VALUE;
            int second = Integer.MIN_VALUE;

            for (int num : arr) {
                if (num > first) {
                    second = first;
                    first = num;
                } else if (num > second && num != first) {
                    second = num;
                }
            }

            if (second == Integer.MIN_VALUE) {
                System.out.println("No second highest value exists");
            } else {
                System.out.println("Second highest: " + second);
            }
        }
    }


