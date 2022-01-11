package com.company.collections.task.main.task2.Sweets;

public class CaramelCandy extends Candy {

    protected String manufacturer;
    protected int amountOfCaramel;

    public CaramelCandy(int amountOfSugar, String manufacturer, int amountOfCaramel) {
        super(amountOfSugar);
        this.manufacturer = manufacturer;
        this.amountOfCaramel = amountOfCaramel;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getAmountOfCaramel() {
        return amountOfCaramel;
    }

    public void setAmountOfCaramel(int amountOfCaramel) {
        this.amountOfCaramel = amountOfCaramel;
    }

    @Override
    public String toString() {
        return "CaramelCandy{" +
                "amountOfSugar=" + amountOfSugar +
                ", manufacturer='" + manufacturer + '\'' +
                ", amountOfCaramel=" + amountOfCaramel +
                '}';
    }
}
