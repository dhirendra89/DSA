package org.wolf.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class CombineTheBooks {

    // https://learning.heycoach.in/student/super-30---january-2025/sessions/Combine-the-Books-4335

    public static List<String> solve(List<String> inventory1, List<String> inventory2) {

        inventory1.addAll(inventory2);
        List<String> list = new ArrayList<>(inventory1);
        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        return list;
    }

    public static void main(String[] args) {
        List<String> sorted = solve(new ArrayList<>(Arrays.asList(new String[]{"A", "C", "B"})), Arrays.asList(new String[]{"Z", "Y", "X"}));
        sorted.forEach(ele -> System.out.print(ele + " "));
    }
}
