package JavaPractice.String;

public class PrintOneCharacterofeach {

    public static void main(String[] args) {
        String str = "jajajadaedveav";
        String unique = "";

         //using Stringbuilder

//        StringBuilder sb = new StringBuilder();
//        str.chars().distinct().forEach(c -> sb.append((char)c));
//        System.out.println(sb);

        //using charAt

        for(int i=0; i <str.length(); i++){
            boolean repeted = false;
            for(int j =0; j< unique.length();  j++){
                if(str.charAt(i) == unique.charAt(j)){
                     repeted = true;
                     break;
                }
            }
            if(!repeted){
                unique += str.charAt(i);
            }
        }
        System.out.println(unique);


        //Using indexOf
        String s="javajavajavadevdev";
        String un="";
        for(int i=0;i<s.length();i++) {
            char ch=s.charAt(i);
            if(un.indexOf(ch)==-1) {
                un=un+ch;
            }}
        System.out.println("Unique string is :"+un);
    }
}
