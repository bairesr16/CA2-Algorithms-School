/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sara_
 */
public class MergeSorter {
    
public static List<Employee> sortByFullName(List<Employee> list) {
        if (list == null || list.size() <= 1) {
            return list == null ? new ArrayList<>() : new ArrayList<>(list);
        }

        int mid = list.size() / 2;
        List<Employee> left = sortByFullName(new ArrayList<>(list.subList(0, mid)));
        List<Employee> right = sortByFullName(new ArrayList<>(list.subList(mid, list.size())));

        return merge(left, right);
    }

    private static List<Employee> merge(List<Employee> left, List<Employee> right) {
        List<Employee> merged = new ArrayList<>();
        int i = 0;
        int j = 0;

        while (i < left.size() && j < right.size()) {
            String nameLeft = left.get(i).getFullName().toLowerCase();
            String nameRight = right.get(j).getFullName().toLowerCase();

            if (nameLeft.compareTo(nameRight) <= 0) {
                merged.add(left.get(i));
                i++;
            } else {
                merged.add(right.get(j));
                j++;
            }
        }

        while (i < left.size()) {
            merged.add(left.get(i));
            i++;
        }

        while (j < right.size()) {
            merged.add(right.get(j));
            j++;
        }

        return merged;
    }
}
