package JavaPractice.Array;

public class Duplicate {
    public static void main(String[] args) {

        int [] num = {1,1,2,3,5,4,4};

        for(int i=0; i<num.length; i++){
            for(int j=i+1; j<num.length; j++){


                if(num[i]==num[j]){
                    System.out.println(num[i]);

                }
            }
        }
    }
}
