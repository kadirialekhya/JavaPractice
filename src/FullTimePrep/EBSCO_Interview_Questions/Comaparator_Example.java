package FullTimePrep.EBSCO_Interview_Questions;

import java.util.ArrayList;
import java.util.Collections;

public abstract class Comaparator_Example implements Comparable {
    int roll_no;
    int age;
    String name;

     Comaparator_Example(int roll_no, int age, String name) {
        this.roll_no = roll_no;
        this.age = age;
        this.name = name;
    }


    public int compareTo(Comaparator_Example s) {

        if (age == s.age)
            return 0;
        else if (age > s.age)
            return 1;
        else
            return -1;

    }



}
