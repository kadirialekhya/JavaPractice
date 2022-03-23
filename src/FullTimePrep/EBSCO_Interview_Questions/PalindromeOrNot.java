package FullTimePrep.EBSCO_Interview_Questions;

public class PalindromeOrNot {

    public static void main(String[] args) {

        String str="aba";


        System.out.println(palindrome(str));

    }

    public static boolean palindrome(String str)
    {
        StringBuffer sb=new StringBuffer();

        sb.append(str);

        System.out.println(sb.reverse());

       //String str_rev= String.valueOf(sb.reverse());

        if (str.equals(sb.reverse()))
        {
            return true;
        }
          else
        {
            return false;
        }
    }

}
