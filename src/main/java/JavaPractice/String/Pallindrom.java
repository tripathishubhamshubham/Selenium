package JavaPractice.String;

public class Pallindrom {
    public static void main(String[] args) {
        String str = "MAM";
        String rev = "";

        for(int i = str.length()-1; i >=0 ; i--){
            rev += str.charAt(i);
        }
        if(str.equals(rev)){
            System.out.println("Is pallindrom");
        }else System.out.println("Is not pallindrom");

    }
}
