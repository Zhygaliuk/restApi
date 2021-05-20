package models;


import lombok.Data;

@Data
public abstract class Device {
    protected String name;
    protected int price;
    protected String brand;
    protected String produce;

    Device(String name, int price, String brand, String produce) {
        this.name = name;
        this.price = price;
        this.brand = brand;
        this.produce = produce;

    }

    protected Device() {

    }
}
