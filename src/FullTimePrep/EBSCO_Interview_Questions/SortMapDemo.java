package FullTimePrep.EBSCO_Interview_Questions;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortMapDemo {

    public static void main(String[] args) {
        Map<String,String> unsorted= new HashMap<>();
        unsorted.put("apple","apple");
        unsorted.put("tea","tea");
        unsorted.put("guva","guva");

        for (Map.Entry<String,String> entry: unsorted.entrySet())
        {
            System.out.println(entry.getKey());
        }
        TreeMap<String,String>sorted=new TreeMap<String,String>(unsorted);
        for (Map.Entry<String,String> entry: sorted.entrySet())
        {
            System.out.println(entry.getKey());
        }
    }

}
