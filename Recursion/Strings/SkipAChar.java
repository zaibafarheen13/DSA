package Recursion.Strings;

public class SkipAChar {
    public static void main(String[] args){
    String test="there are many app apple app alphabets";
    skip("",test);
    System.out.println(skip1(test));
    System.out.println(skipApple(test));
    System.out.println(skipAppNotApple(test));
    }

    public static void skip(String processed,String unprocessed){
        if(unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }
        char ch=unprocessed.charAt(0);
        if(ch=='a'){
            skip(processed,unprocessed.substring(1));
        }
        else{
            skip(processed+ch,unprocessed.substring(1));
        }
    }

    //return string
    public static String skip1(String unprocessed){
        if(unprocessed.isEmpty()){
            return "";
        }
        char ch=unprocessed.charAt(0);
        if(ch=='a'){
            return skip1(unprocessed.substring(1));
        }
        else{
            return ch+skip1(unprocessed.substring(1));
        }
    }

    //skip a string
    public static String skipApple(String unprocessed){
        if(unprocessed.isEmpty()){
            return "";
        }
        if(unprocessed.startsWith("apple")){
            return skipApple(unprocessed.substring(5));
        }
        else{
            return unprocessed.charAt(0)+skipApple(unprocessed.substring(1));
        }
    }

    //skip app and not apple
    public static String skipAppNotApple(String unprocessed){
        if(unprocessed.isEmpty()){
            return "";
        }
        if(unprocessed.startsWith("app") && !unprocessed.startsWith("apple")){
            return skipAppNotApple(unprocessed.substring(3));
        }
        else{
            return unprocessed.charAt(0)+skipAppNotApple(unprocessed.substring(1));
        }
    }
}
