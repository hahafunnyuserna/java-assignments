package org.example;

import java.util.*;

class ListMerger
{
    public static <T> List<T> MergeLists(List<T> listOne, List<T> listTwo)
    {  
        List<T> mergedList = new ArrayList<>();
        int maxLength;
        if (listOne.size() > listTwo.size())
        {
            maxLength = listOne.size();
        } else {
            maxLength = listTwo.size();
        }

        for (int i = 0; i < maxLength; i++)
        {
            if (i < listOne.size())
            {
                mergedList.add(listOne.get(i));
            }

            if (i < listTwo.size())
            {
                mergedList.add(listTwo.get(i));
            }
        }

        return mergedList;
    }
}
