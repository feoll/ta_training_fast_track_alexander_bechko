package com.company.fundamentals.task.main;

public class Task5 {
    public static void main(String[] args) {
        outputMonthById(1);
        outputMonthById(3);
        outputMonthById(12);
        outputMonthById(13);
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
