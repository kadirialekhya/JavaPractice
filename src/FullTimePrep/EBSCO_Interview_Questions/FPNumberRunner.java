package FullTimePrep.EBSCO_Interview_Questions;

import java.util.List;

public class FPNumberRunner {
    public static void main(String[] args) {
        List<Integer>list=List.of(1,3,6,2,9,5,5);
        //list.stream().forEach(element -> System.out.println(element));
list.stream().distinct().sorted().map(e -> e*e). forEach(element -> System.out.println(element));
       // normalSum(list);
       // FunProgSum(list);
    }

    private static void FunProgSum(List<Integer> list) {
        int sum=  list.stream().reduce(0,(a, b)->a+b);
        System.out.println(sum);
    }

    private static void normalSum(List<Integer> list) {
        int sum=0;

        for (int l: list)
        {
            sum=sum+l;
        }
        System.out.println(sum);
    }
}
