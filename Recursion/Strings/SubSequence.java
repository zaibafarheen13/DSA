package Recursion.Strings;

import java.util.ArrayList;

public class SubSequence {
    public static void main(String[] args){     
        subSeq("", "abc");
        System.out.println(subseqRet("", "abc"));
        getAscii('a');
        subSeqAscii("","abc");
        System.out.println(subseqRetAscii("","abc"));

    }
    public static void subSeq(String processed,String unprocessed){
        if(unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }
        char ch=unprocessed.charAt(0);
        subSeq(processed,unprocessed.substring(1));
        subSeq(processed+ch,unprocessed.substring(1));
    }

    //return ArrayList
     static ArrayList<String> subseqRet(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = subseqRet(p + ch, up.substring(1));
        ArrayList<String> right = subseqRet(p, up.substring(1));

        left.addAll(right);
        return left;
    }

    //get Ascii
    public static void getAscii(char a){
        System.out.println(a+0);
        System.out.println((char)(a+1));
    }

    //Sub Sequence Ascii
    public static void subSeqAscii(String processed,String unprocessed){
        if(unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }
        char ch=unprocessed.charAt(0);
        subSeqAscii(processed,unprocessed.substring(1));
        subSeqAscii(processed+ch,unprocessed.substring(1));
        subSeqAscii(processed+(ch+0),unprocessed.substring(1));
    }

    //return ArrayList Ascii
     static ArrayList<String> subseqRetAscii(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> first = subseqRetAscii(p + ch, up.substring(1));
        ArrayList<String> second = subseqRetAscii(p, up.substring(1));
        ArrayList<String> third = subseqRetAscii(p + (ch+0), up.substring(1));

        first.addAll(second);
        first.addAll(third);
        return first;
    }
}

