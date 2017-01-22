package com.javapuzzlers;

import java.io.File;

public class MeToo {
    public static void main(String[] args) {
        System.out.println(MeToo.class.getName().
                replaceAll("\\.", File.separator) + ".class");
    }
}
// not working under Windows, when File.separator is back slash '\'