package FullTimePrep;

import java.util.*;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
List<List<String>> groupAnagrams=new ArrayList<>();
        HashMap<String,List<String>>map=new HashMap<>();
        for (String current:strs)
        {
            char [] chars=current.toCharArray();
            Arrays.sort(chars);
            String sorted=new String(chars);
            if (!map.containsKey(sorted))
            {
                map.put(sorted,new ArrayList<>());
            }
            map.get(sorted).add(current);
        }
        groupAnagrams.addAll(map.values());
        return groupAnagrams;
    }
}
