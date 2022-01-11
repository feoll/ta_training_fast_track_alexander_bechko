package com.company.collections.task.main.task2.Sweets;

public class ChocolateCandy extends Candy {

    protected String manufacturer;
    protected int amountOfChocolate;

    public ChocolateCandy(int amountOfSugar, String manufacturer, int amountOfChocolate) {
        super(amountOfSugar);
        this.manufacturer = manufacturer;
        this.amountOfChocolate = amountOfChocolate;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getAmountOfChocolate() {
        return amountOfChocolate;
    }

    public void setAmountOfChocolate(int amountOfChocolate) {
        this.amountOfChocolate = amountOfChocolate;
    }

    @Override
    public String toString() {
        return "ChocolateCandy{" +
                "amountOfSugar=" + amountOfSugar +
                ", manufacturer='" + manufacturer + '\'' +
                ", amountOfChocolate=" + amountOfChocolate +
                '}';
    }
}
