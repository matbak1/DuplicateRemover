package com.company.duplicateRemover;

import java.util.*;
import java.util.stream.Collectors;

public class DuplicatesRemover {


    public static void removeDuplicates(List<String> list) {

        Stack<String> stringStack = new Stack<>();
        HashMap<String,String> map = new HashMap<>();

        for (int i = list.size()-1; i >=0 ; i--){
            String tmp = list.get(i);
            if (!map.containsKey(tmp)) {
                map.put(tmp, tmp);
                stringStack.push(tmp);
            }
        }

        list.clear();

        while (!stringStack.empty()) {
            list.add(stringStack.pop());
        }
    }

    public static void removeDuplicatesUsingSet(List<String> list){
        Set<String> stringSet = new LinkedHashSet<>(list);
        list.clear();
        list.addAll(stringSet);
    }

    public static void removeDuplicatesUsingStream(List<String> list){
        List<String> tmp = list.stream().distinct().collect(Collectors.toList());
        list.clear();
        list.addAll(tmp);
    }

}
