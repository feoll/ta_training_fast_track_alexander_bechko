package com.company.collections.task.main.task2.Sweets;

public class CaramelCandy extends Candy {

    protected String manufacturer;

    public CaramelCandy(int amountOfSugar, String manufacturer) {
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
        return "CaramelCandy{" +
                "amountOfSugar=" + amountOfSugar +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }
}
