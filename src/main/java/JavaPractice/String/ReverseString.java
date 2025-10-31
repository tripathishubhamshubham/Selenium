package JavaPractice.String;

public class ReverseString {

    public static String reverse(String input){
        String rev = "";

        for(int i=input.length()-1; i>=0; i--){
            rev += input.charAt(i);
        }
        return rev;
    }

    public static void main(String [] args){
       String output = reverse("Automation");
        System.out.println(output);
    }
}
