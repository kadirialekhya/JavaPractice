package FullTimePrep;

import java.util.HashSet;
import java.util.Set;

public class UniqueEmailAddress {
    public int numUniqueEmails(String[] emails) {
        Set<String> set=new HashSet<>();
        for (String email:emails)
        {
            StringBuilder temp=new StringBuilder();
            int i=0;
            while (email.charAt(i)!='@')
            {
                char c=email.charAt(i);
                if (c =='.')
                {
                    i++;
                    continue;
                }
                else if (c=='+')
                {
                    break;
                }
                else

                    temp.append(c);
                    i++;

            }
            while (email.charAt(i) != '@')
            i++;
            while (i < email.length())
                temp.append(email.charAt(i++));
            set.add(temp.toString());
        }
        return set.size();
    }
        }


