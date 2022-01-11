package com.company.fundamentals.task.main;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите порядковый номер месяца: ");
        outputMonthById(scanner.nextInt());
    }

    private static void outputMonthById(int id) {
        try {
            String[] months = new String[] {"Январь", "Февраль", "Март", "Апрель", "Май", "Июнь", "Июль", "Август", "Сентябрь", "Октябрь", "Ноябрь", "Декабрь"};
            System.out.println(months[id - 1]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("The index is incorrect. The index must be from 1 to 12 inclusive");
        }
    }
}
