package org.example;

import java.util.ArrayList;
import java.util.Collections;

public class FuzzyFinder
{
    public int linear(ArrayList<Fuzzy> field, Fuzzy key)
    {
        for (int i = 0; i < field.size(); i++)
        {
            Fuzzy element = field.get(i);

            if (element.color == key.color)
            {
                return i;
            }
        }

        return -1;
    }

    public int binary(ArrayList<Fuzzy> field, Fuzzy key)
    {
        int low = 0;
        int high = field.size() - 1;

        while (low <= high)
        {
            int mid = low + (high - low) / 2;
            Fuzzy element = field.get(mid);
            
            if (field.get(mid).color.compareTo(key.color) < 0)
            {
                low = mid + 1;
            } else if (field.get(mid).color.compareTo(key.color) > 0) {
               high = mid - 1;
            } else {
                return mid;
            }            
        }

        return -1;
    }
}
