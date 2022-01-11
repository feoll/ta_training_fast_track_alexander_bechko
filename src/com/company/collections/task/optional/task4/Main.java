package com.company.collections.task.optional.task4;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        String poem = readFromFile("src\\resources\\poem.txt");

        System.out.println("----Before----");
        List<String> list = Arrays.stream(poem.split("\n")).toList();
        outputList(list);

        System.out.println("----After----");
        list = list.stream().sorted(Comparator.comparing(String::length)).collect(Collectors.toList());
        outputList(list);
    }

    private static String readFromFile(String path) {
        StringBuilder readString = new StringBuilder();
        try {
            FileReader fileReader = new FileReader(path);
            BufferedReader reader = new BufferedReader(fileReader);
            String line = reader.readLine();
            while (line != null) {
                readString.append(line).append("\n");
                line = reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return readString.toString();
    }

    private static <T> void outputList(List<T> list) {
        for (T element : list)
            System.out.println(element.toString());
    }
}
