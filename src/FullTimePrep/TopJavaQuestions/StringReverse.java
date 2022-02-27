package FullTimePrep.TopJavaQuestions;

public class StringReverse {

    public static void main(String[] args) {
        String str= "alekhya";
        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append(str);
        stringBuilder=stringBuilder.reverse();
        System.out.println(stringBuilder);
    }
}
