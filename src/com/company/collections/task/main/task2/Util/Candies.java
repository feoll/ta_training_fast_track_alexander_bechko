package com.company.collections.task.main.task2.Util;

import com.company.collections.task.main.task2.Sweets.Candy;
import java.util.List;

public class Candies {
    public static Candy getCandyFromListByRangeSugar(List<Candy> candies, int sugarFrom, int sugarTo) {
        for(Candy candy : candies)
            if(candy.getAmountOfSugar() >= sugarFrom && candy.getAmountOfSugar() <= sugarTo)
                return candy;
        return null;
    }
}
