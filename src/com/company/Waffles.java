package com.company;

public class Waffles extends Sweet {
    private String filling;

    public Waffles(String name, double weight, double price, String filling) {
        super(name, weight, price);
        this.filling = filling;
    }

    @Override
    public String toString(){
        return "Название: " + this.name + ", вес: " + this.weight + ", цена: " + this.price + ", начинка: " + this.filling;
    }
}
