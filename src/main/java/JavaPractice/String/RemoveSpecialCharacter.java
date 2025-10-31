package JavaPractice.String;

public class RemoveSpecialCharacter {

    //Replace the special character and Spaces
    //To replace the spaces use \\s, ^ used for not in inside the []
    public static void main(String[] args) {
        String str = "Info!^ 123 (54)$Sys";

        String reg = str.replaceAll("[^a-zA-Z\\s]","");
        System.out.println(reg);
    }
}
