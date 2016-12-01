package com.gradle.fury.example;

import java.util.Arrays;

/**
 * Application that returns passed arguments
 */
public class Main {

    /**
     * Print passed arguments formatted as an array.
     *
     * @param args passed command line arguments
     */
    public static void main(String... args) {
        System.out.println(Arrays.toString(args));
    }

}
