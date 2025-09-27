package JavaPractice.Numbers;

public class Fibonaci {

    public static void main(String[] args) {
        int first = 0;
        int second = 1;
        int third;
        System.out.print(first);
        System.out.print(second);
        for(int i =2; i <= 6; i++){
             third = first + second;
            System.out.print(third);
             first = second;
             second = third;

        }
    }
}
