package com.company.collections.task.main.task2;

import com.company.collections.task.main.task2.Gift.NewYearsGift;
import com.company.collections.task.main.task2.Sweets.Candy;
import com.company.collections.task.main.task2.Sweets.CaramelCandy;
import com.company.collections.task.main.task2.Sweets.ChocolateCandy;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Candy> candies = getListCandies();

        NewYearsGift newYearsGift = new NewYearsGift(candies, 10);
        System.out.println(newYearsGift);

        newYearsGift.sort();
        System.out.println(newYearsGift);

        System.out.println(getCandyFromListByRangeSugar(candies, 6,10));
    }

    private static List<Candy> getListCandies() {
        List<Candy> candies = new ArrayList<>();
        candies.add(new CaramelCandy(10, "Коммунарка"));
        candies.add(new ChocolateCandy(20, "Коммунарка"));
        candies.add(new CaramelCandy(5, "Нестле"));
        return candies;
    }

    private static Candy getCandyFromListByRangeSugar(List<Candy> candies, int sugarFrom, int sugarTo) {
        for(Candy candy : candies)
            if(candy.getAmountOfSugar() >= sugarFrom && candy.getAmountOfSugar() <= sugarTo)
                return candy;
        return null;
    }

}
