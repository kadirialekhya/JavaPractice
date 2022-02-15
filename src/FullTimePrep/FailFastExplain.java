package FullTimePrep;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailFastExplain {

    public static void main(String[] args) {
        List<String> list=new CopyOnWriteArrayList<>();
        list.add("a");
        list.add("v");
        list.add("c");

        for (String val:list){
            System.out.println(val);
            list.add("b");
        }
    }
}
