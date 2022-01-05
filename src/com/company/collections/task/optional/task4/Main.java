package com.company.collections.task.optional.task4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    private final static String POEM =
            "Я помню чудное мгновенье:\n" +
            "Передо мной явилась ты,\n" +
            "Как мимолетное виденье,\n" +
            "Как гений чистой красоты.\n" +
            "В томленьях грусти безнадежной,\n" +
            "В тревогах шумной суеты,\n" +
            "Звучал мне долго голос нежный\n" +
            "И снились милые черты.";

    public static void main(String[] args) {
        List<String> list = Arrays.stream(POEM.split("\n")).toList();
        System.out.println(list);

        list = list.stream().sorted(Comparator.comparing(String::length)).collect(Collectors.toList());
        System.out.println(list);
    }
}
