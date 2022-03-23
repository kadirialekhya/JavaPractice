package FullTimePrep.EBSCO_Interview_Questions;

public class StringVowelsCount {

    public static void main(String[] args) {

        String str="alekhya";

        System.out.println(vowelCount(str));
    }

    private static int vowelCount(String str)
    {
        char ch[]=str.toCharArray();

        int count=0;
        for (char c: ch)
        {
            switch (c)
            {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    count++;
                    break;
            }
        }
        return count;
    }
}
