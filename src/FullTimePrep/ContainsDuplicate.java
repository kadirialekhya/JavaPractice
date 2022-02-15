package FullTimePrep;

import java.util.HashSet;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
int arraySize=nums.length;
        HashSet<Integer> set=new HashSet<Integer>();
        for (int i:nums)
        {
            set.add(i);
        }
        int SetSize= set.size();
        if (arraySize>SetSize) {
            return true;
        }
        else {
            return false;
        }
    }
}
