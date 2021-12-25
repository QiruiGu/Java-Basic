package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        //冒泡排序
	    int[] ns = {1, 2, 3, 4, 5, 6};
        for(int i = 0; i < ns.length; i++) {
            for (int j = 0; j < ns.length - i - 1; j++) {
                if(ns[j] < ns[j+1]) {
                    var temp = ns[j];
                    ns[j] = ns[j+1];
                    ns[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(ns));
    }
}
