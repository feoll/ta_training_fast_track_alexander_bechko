package com.company.collections.task.main.task2.Sweets;

public abstract class Candy implements Comparable<Candy> {
    protected int amountOfSugar;

    public Candy(int amountOfSugar) {
        this.amountOfSugar = amountOfSugar;
    }

    public int getAmountOfSugar() {
        return amountOfSugar;
    }

    public void setAmountOfSugar(int amountOfSugar) {
        this.amountOfSugar = amountOfSugar;
    }

    @Override
    public int compareTo(Candy o) {
        if(amountOfSugar > o.getAmountOfSugar())
            return 1;
        else if(amountOfSugar < o.getAmountOfSugar())
            return -1;
        return 0;
    }

    @Override
    public String toString() {
        return "Candy{" +
                "amountOfSugar=" + amountOfSugar +
                '}';
    }
}
