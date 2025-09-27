package JavaPractice.Array;

import java.util.Locale;

public class FrquancyOfCharacterInArray {

    public static void main(String[] args) {
        int [] arr = {1,2,3,1,3,5,1,4,3,5};

        boolean [] visited = new boolean[arr.length];

        for(int i =0; i<arr.length; i++){
            int count = 1;
            if(visited[i]){
                continue;
            }
            for(int j =i+1; j<arr.length; j++){
                if(arr[i]==arr[j]){
                     visited[j] = true;
                    count++;
                }
            }
            System.out.println(arr[i] + "-->"+ count);
        }
    }
}