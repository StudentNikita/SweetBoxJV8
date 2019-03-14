package com.company;

import java.util.Arrays;

public class SweetBox implements Box {

    private Sweet [] presentBox = new Sweet[0];





    @Override
    public void addToBox(Sweet sweet) {
    this.presentBox = Arrays.copyOf(this.presentBox, (this.presentBox.length + 1));
    this.presentBox[this.presentBox.length-1] = sweet;


    }

    @Override
    public void removeFromBoxByIndex(int index) {
    if (this.presentBox.length > index && index >= 0){
        for (int i = 0; i < (this.presentBox.length - index - 1); i++){
            this.presentBox[index+i] = this.presentBox [index+i+1];
        }
        this.presentBox = Arrays.copyOf(this.presentBox,(this.presentBox.length -1) );}
    else if (index < 0 || index >= this.presentBox.length) System.out.println("Некорректный запрос");


    }



    @Override
    public void boxWeight() {
        if (this.presentBox.length > 0){
        double result = 0;
        for (Sweet sweets: this.presentBox){
            result += sweets.getWeight();
        }
        System.out.println("Общий вес коробки " + result);}
        else System.out.println("Коробочка пустая");
    }

    @Override
    public void boxPrice() {
        if (this.presentBox.length > 0){
        double result = 0;
        for (Sweet sweets: this.presentBox){
            result += sweets.getPrice();
        }
        System.out.println("Общая стоимость коробки " + result);}
        else System.out.println("Коробочка пустая");
    }

    @Override
    public void boxInformation() {
        if (this.presentBox.length > 0){
        System.out.println("Состав коробки: ");
        for (int i = 0; i < this.presentBox.length; i++){
            System.out.println((i+1) + ") " + this.presentBox[i]);
        }}
        else System.out.println("Коробочка пустая");

    }

    @Override
    public void reduceWeight(double weight) {
    try{
    if (this.presentBox.length == 0) System.out.println("Коробочка пустая");
    if (this.presentBox.length == 1) System.out.println("В коробочке лежит всего одна сладость. Добавьте еще как минимум одну, чтобы можно было скорректировать подарок по весу");
        double result = 0;

        int index = 0;
        for (Sweet sweets: this.presentBox){
            result += sweets.getWeight();
        }

        while (result > weight){
            double minWeight = this.presentBox[0].getWeight();

            for (int i = 0; i < this.presentBox.length; i++){
                if (minWeight > this.presentBox[i].getWeight()){
                    index = i;
                    minWeight = this.presentBox[i].getWeight();
                }
            }
            result -= this.presentBox[index].getWeight();
            removeFromBoxByIndex(index);

        }}
    catch (ArrayIndexOutOfBoundsException e){
        System.out.println("Некорректный допустимый вес");
    }





    }

    @Override
    public void reducePrice(double price){
    try{
    if (this.presentBox.length == 0) System.out.println("Коробочка пустая");
    if (this.presentBox.length == 1) System.out.println("В коробочке лежит всего одна сладость. Добавьте еще как минимум одну, чтобы можно было скорректировать подарок по цене");
        double result = 0;
        int index = 0;
        for (Sweet sweets: this.presentBox){
            result += sweets.getPrice();
        }

        while (result > price){
            double minPrice = this.presentBox[0].getPrice();

            for (int i = 0; i < this.presentBox.length; i++){
                if (minPrice > this.presentBox[i].getPrice()){
                    index = i;
                    minPrice = this.presentBox[i].getPrice();
                }
            }
            result -= this.presentBox[index].getPrice();
            removeFromBoxByIndex(index);
        }}
    catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Некорректная допустимая цена");
        }
    }
}
