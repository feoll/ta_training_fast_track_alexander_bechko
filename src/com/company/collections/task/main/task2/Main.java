package com.company.collections.task.main.task2;

import com.company.collections.task.main.task2.Gift.NewYearsGift;
import com.company.collections.task.main.task2.Sweets.Candy;
import com.company.collections.task.main.task2.Sweets.CaramelCandy;
import com.company.collections.task.main.task2.Sweets.ChocolateCandy;

import java.util.ArrayList;
import java.util.List;
import static com.company.collections.task.main.task2.Util.Candies.getCandyFromListByRangeSugar;

public class Main {
    public static void main(String[] args) {
        List<Candy> candies = new ArrayList<>();
        initListCandies(candies);

        NewYearsGift newYearsGift = new NewYearsGift(candies, 10);
        System.out.println(newYearsGift);

        newYearsGift.sort();
        System.out.println(newYearsGift);

        System.out.println(getCandyFromListByRangeSugar(candies, 6,10));
    }

    private static void initListCandies(List<Candy> candies) {
        candies.add(new CaramelCandy(10, "Коммунарка", 10));
        candies.add(new ChocolateCandy(20, "Коммунарка", 10));
        candies.add(new CaramelCandy(5, "Нестле", 10));
    }
}
