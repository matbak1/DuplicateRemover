package com.company;

import com.company.duplicateRemover.DuplicatesRemover;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("a");
        list.add("b");
        list.add("a");

        System.out.println("Original list");
        for (String s : list) {
            System.out.print(s);
        }
        System.out.println();

        DuplicatesRemover.removeDuplicates(list);

        System.out.println("List without duplicates");
        for (String s : list) {
            System.out.print(s);
        }


    }


}
