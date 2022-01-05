package com.company.fundamentals.task.optional.task2;

import static com.company.fundamentals.task.optional.task2.Matrix.*;

public class Task4 {
    public static void main(String[] args) {
        int[][] matrix = generateMatrix(5, -9, 9);
        outputMatrix(matrix);

        int maxNumber = getMaximumElementFromMatrix(matrix);
        System.out.println(maxNumber);
        outputMatrix(removeRowsAndColumnsContainsNumber(matrix, maxNumber));
    }
}
