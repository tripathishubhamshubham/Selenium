package JavaPractice.String;

import io.cucumber.java.sl.In;

import java.util.*;

public class FindDuplicate {

    public static void main(String[] args) {

        int[] number = {1, 2, 1, 4, 2, 1, 5, 6, 9, 6};

        //Using HasMap
        Map<Integer, Integer> frequancy = new HashMap<>();

        for (int num : number) {
            frequancy.put(num, frequancy.getOrDefault(num, 0) + 1);

        }
        for (Map.Entry<Integer, Integer> entry : frequancy.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println("Duplicate value is " + entry.getKey());
            }
        }

        //Using Set
        HashSet<Integer> set = new HashSet<>();
        for(int num : number){
        if(!set.add(num)){
            System.out.println("Using set "+num);
        }
    }
        // Using brute force
        for(int i=0 ; i< number.length;i++){
            for(int j=i+1; j<number.length; j++){
                if(number[i]==number[j]){
                    System.out.println(number[i]);
                    break;
                }
            }
        }
}



}
