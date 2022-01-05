package com.company.fundamentals.task.optional.task2;

import java.util.*;

public class Matrix {
    public static int[][] generateMatrix(int length, int numberFrom, int numberTo) {
        int[][] matrix = new int[length][length];

        for(int i = 0; i < length; i++)
            for(int j = 0; j < length; j++)
                matrix[i][j] = new Random().nextInt(numberFrom, numberTo + 1);
        return matrix;
    }

    public static int getMaximumElementFromMatrix(int[][] matrix) {
        int max = matrix[0][0];
        for(int i = 0; i < matrix.length; i++)
            for(int j = 0; j < matrix[0].length; j++)
                if(max < matrix[i][j])
                    max = matrix[i][j];
        return max;
    }

    public static void outputMatrix(int[][] matrix) {
        for(int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++)
                System.out.print(matrix[i][j] + "\t");
            System.out.println();
        }
    }

    public static int[][] removeRowsAndColumnsContainsNumber(int[][] matrix, int number) {
        ArrayList<Integer> rowIndices = new ArrayList<>(getRowsContainsNumber(matrix, number));
        ArrayList<Integer> columnIndices = new ArrayList<>(getColumnsContainsNumber(matrix, number));

        Collections.sort(rowIndices);
        Collections.sort(columnIndices);
        Collections.reverse(rowIndices);
        Collections.reverse(columnIndices);

        for(Integer rowId: rowIndices)
            matrix = removeRowById(matrix, rowId);
        for(Integer columnId: columnIndices)
            matrix = removeColumnById(matrix, columnId);

        return matrix;
    }

    public static int[][] removeRowById(int[][] matrix, int id){
        int[][] newMatrix = new int[matrix.length - 1][matrix[0].length];
        for(int i = 0, j = 0; i < matrix.length; i++)
            if(i != id)
                newMatrix[j++] = matrix[i];
        return newMatrix;
    }

    public static int[][] removeColumnById(int[][] matrix, int id){
        int[][] newMatrix = new int[matrix.length][matrix[0].length - 1];
        for(int i = 0; i < matrix.length; i++)
            for(int j = 0, k = 0; j < matrix[0].length;j++)
                if(j != id)
                    newMatrix[i][k++] = matrix[i][j];
        return newMatrix;
    }

    public static List<Integer> getRowsContainsNumber(int[][] matrix, int number) {
        Set<Integer> rowsId = new HashSet<>();
        for(int i = 0; i < matrix.length; i++)
            for (int j = 0; j < matrix[0].length; j++)
                if(matrix[i][j] == number)
                    rowsId.add(i);
        return rowsId.stream().toList();
    }

    public static List<Integer> getColumnsContainsNumber(int[][] matrix, int number) {
        Set<Integer> columnId = new HashSet<>();
        for(int i = 0; i < matrix.length; i++)
            for (int j = 0; j < matrix[0].length; j++)
                if (matrix[i][j] == number)
                    columnId.add(j);
        return columnId.stream().toList();
    }
}
