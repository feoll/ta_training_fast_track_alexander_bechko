package com.company.collections.task.main.task2.Sweets;

public class ChocolateCandy extends Candy {

    protected String manufacturer;

    public ChocolateCandy(int amountOfSugar, String manufacturer) {
        super(amountOfSugar);
        this.manufacturer = manufacturer;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return "ChocolateCandy{" +
                "amountOfSugar=" + amountOfSugar +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }
}
