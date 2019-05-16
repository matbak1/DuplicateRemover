package com.company.tests;

import com.company.Main;
import com.company.duplicateRemover.DuplicatesRemover;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class DuplicatesRemoverTest extends Main {

    @Test
    public void shouldReturnTwoElementsListWithoutDuplicates() {

        //given
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("a");

        //when
        DuplicatesRemover.removeDuplicates(list);

        //then
        assertEquals(Arrays.asList("b", "a"), list);
    }

    @Test
    public void shouldReturnListWithoutUsingModifiedALg() {

        //given
        List<String> list = new ArrayList<>();

        addElementsToList(list);
        //when
        DuplicatesRemover.removeDuplicates(list);

        //then
        assertEquals(Arrays.asList("a", "b", "c", "d", "e", "f", "g"), list);
    }

    private void addElementsToList(List<String> list) {
        for (int i = 0; i < 10000000; i++) {
            list.add("a");
            list.add("b");
            list.add("c");
            list.add("d");
            list.add("e");
            list.add("f");
            list.add("g");
        }
    }


    @Test
    public void removeDuplicatesUsingSet() {

        //given
        List<String> list = new ArrayList<>();

        addElementsToList(list);
        //when
        DuplicatesRemover.removeDuplicatesUsingSet(list);

        //then
        assertEquals(Arrays.asList("a", "b", "c", "d", "e", "f", "g"), list);
    }

    @Test
    public void removeDuplicatesUsingStream() {

        //given
        List<String> list = new ArrayList<>();

        addElementsToList(list);
        //when
        DuplicatesRemover.removeDuplicatesUsingStream(list);

        //then
        assertEquals(Arrays.asList("a", "b", "c", "d", "e", "f", "g"), list);
    }

    @Test
    public void shouldReturnEmptyList() {
        //given
        List<String> list = new ArrayList<>();

        //when
        DuplicatesRemover.removeDuplicates(list);

        //then
        assertEquals(Collections.EMPTY_LIST, list);
    }

    @Test
    public void shouldReturnOneElement() {
        //given
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("a");
        list.add("a");


        //when
        DuplicatesRemover.removeDuplicates(list);

        //then
        assertEquals(Arrays.asList("a"), list);
    }


    @Test
    public void shouldReturnListWithoutDuplicates() {
        //given
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("a");
        list.add("c");
        list.add("d");
        list.add("a");

        //when
        DuplicatesRemover.removeDuplicates(list);

        //then
        assertEquals(Arrays.asList("b", "c", "d", "a"), list);


    }

}