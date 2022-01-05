package com.company.collections.task.main.task2.Gift;

import com.company.collections.task.main.task2.Sweets.Candy;

import java.util.Collections;
import java.util.List;

public class NewYearsGift {
    private List<Candy> candies;
    private int weight;

    public NewYearsGift(List<Candy> candies, int weight) {
        this.candies = candies;
        this.weight = weight;
    }

    public List<Candy> getCandies() {
        return candies;
    }

    public void setCandies(List<Candy> candies) {
        this.candies = candies;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void sort() {
        Collections.sort(candies);
    }

    @Override
    public String toString() {
        return "NewYearsGift{" +
                "candies=" + candies +
                ", weight=" + weight +
                '}';
    }
}
