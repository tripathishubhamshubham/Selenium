package JavaPractice.String;

import java.util.Arrays;

public class ChechFrequencySbustring {

    public static void main(String[] args) {

        String str = "I live in  live home and work from live";
        String substring = "live";
        String[] split = str.trim().split(" ");
        int count = 0;
        //finding substring first
//       for(int i= 0; i< split.length; i++){
//
//           for(int j = i+1; j < split.length; j++){
//               if(split[i].equalsIgnoreCase(split[j])){
//                       substring = split[i];
//                   System.out.println(substring);
//               }
//           }
//
//       }

        for (String word : split) {
            if (word.equalsIgnoreCase(substring)) {
                count++;
            }
        }
        System.out.println(count);


//        String str1 = "I live in live home and work from home live";
//
//        // Split words (removes multiple spaces)
//        String[] words = str1.trim().split("\\s+");
//
//        // Array to track visited words
//        boolean[] visited = new boolean[words.length];
//
//        System.out.println("Word frequencies (Brute Force):");
//
//        for (int i = 0; i < words.length; i++) {
//            if (visited[i]) continue;  // skip already counted words
//
//            int count1 = 1;
//            for (int j = i + 1; j < words.length; j++) {
//                if (words[i].equalsIgnoreCase(words[j])) {
//                    count1++;
//                    visited[j] = true; // mark as counted
//                }
//            }
//
//            System.out.println(words[i] + " → " + count);
//        }
    }
}
