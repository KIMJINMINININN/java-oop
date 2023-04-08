package com.fastcampus;

import com.fastcampus.logic.BubbleSort;
import com.fastcampus.logic.JavaSort;
import com.fastcampus.logic.Sort;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Sort<String> sort = new JavaSort<>();

        System.out.println("[result] " + sort.sort(Arrays.asList(args)));
    }
}