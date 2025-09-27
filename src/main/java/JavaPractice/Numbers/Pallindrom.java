package JavaPractice.Numbers;

public class Pallindrom {
    public static void main(String[] args) {
        int num = 121;
        int rev = 0;
        int temp =num;

        while(temp > 0){
            rev = rev*10 + temp%10;
            temp = temp/10;
        }
        if(num == rev){
            System.out.println(num + " "+ "Is pallindrom");
        }else System.out.println(num + " "+ "Is not pallindrom");
    }
}
