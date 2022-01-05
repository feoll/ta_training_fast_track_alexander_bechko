package com.company.fundamentals.task.optional.task1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        int[] array = inputIntegerArrayWithConsole(5);
        System.out.println(Arrays.toString(array));

        System.out.println(getNumberWithDifferentDigits(array));
    }

    private static int[] inputIntegerArrayWithConsole(int length) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[length];
        for (int i = 0; i < numbers.length; i++)
            numbers[i] = scanner.nextInt();
        return numbers;
    }

    private static int getNumberWithDifferentDigits(int[] numbers) {
        for(int number : numbers)
            if(containsOnlyDifferentDigits(number))
                return number;
        return 0;
    }

    private static boolean containsOnlyDifferentDigits(int number)  {
        char[] numbers = String.valueOf(number).toCharArray();
        HashSet<Character> digits = new HashSet<>();

        for(char digit: numbers)
            digits.add(digit);

        return numbers.length == digits.size();
    }
}
