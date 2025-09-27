package JavaPractice.String;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LongestWordInString {



    public static void main(String[] args) {
        longestWord("I am Shubham");
    }

    public static void longestWord(String str){

        String  [] split = str.split(" ");
        String longestWord = "";
        int max = 0;

        for(String word : split){
            if(word.length() > longestWord.length()){
                longestWord = word;
                max = longestWord.length();
            }
        }
        System.out.println(longestWord + " max count is "+max);
    }


}
