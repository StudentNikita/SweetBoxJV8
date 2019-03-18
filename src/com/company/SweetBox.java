package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class SweetBox implements Box {

    private List<Sweet> presentBox = new ArrayList<>();
    Predicate<Sweet> shouldWeAddThisSweet;

    public SweetBox(Predicate<Sweet> shouldWeAddThisSweet){
        this.shouldWeAddThisSweet = shouldWeAddThisSweet;
    }

    public SweetBox(){}

    @Override
    public void addToBox(Sweet sweet) {
    if (sweet != null && this.shouldWeAddThisSweet.test(sweet)){
        this.presentBox.add(sweet);
    } else System.out.println("Сладость не удовлетворяет политике коробки!");



    }



    @Override
    public void removeFromBoxByIndex(int index) {
    if (this.presentBox.size() > index && index >= 0){
        this.presentBox.remove(index);
        }
    else if (index < 0 || index >= this.presentBox.size()) System.out.println("Некорректный запрос");
    }



    @Override   // поиск общего веса коробки с помощью Stream API
    public void boxWeight() {
        if (this.presentBox.size() > 0){
            System.out.println("Общий вес коробки " + this.presentBox
                    .stream()
                    .mapToDouble(Sweet::getWeight)
                    .sum() + " гр");
        }
        else System.out.println("Коробочка пустая");
    }

    @Override
    public void boxPrice() { // поиск общей цены коробки с помощью Stream API
        if (this.presentBox.size() > 0){
            System.out.println("Общая стоимость коробки " + this.presentBox
                    .stream()
                    .mapToDouble(Sweet::getPrice)
                    .sum() + " руб");}
        else System.out.println("Коробочка пустая");
    }

    @Override
    public void boxInformation() {
        if (this.presentBox.size() > 0){
        System.out.println("Состав коробки: ");
        for (int i = 0; i < this.presentBox.size(); i++){
            System.out.println((i+1) + ") " + this.presentBox.get(i));
        }}
        else System.out.println("Коробочка пустая");

    }


    public void convertToEur () {   //задание №3. Конвертер в евро
        Converter fromRurToEur = (rur) -> rur / 77;
        double result = fromRurToEur.convert(this.presentBox.stream().mapToDouble(Sweet::getPrice).sum());
        System.out.println("Стоимость коробки в евро: " + result + " EUR");
    }




    @Override   // задание №4. Поиск количества шоколадок в коробке с помощью Stream API
    public void howMuchChocoInBox() {
        System.out.println("Всего в коробочке шоколадок: " + this.presentBox
                .stream()
                .filter(sweet -> sweet instanceof  Chocolate)
                .count() + " шт.");
    }

    @Override // задание №4. Поиск количества вафель в коробке с помощью Stream API
    public void howMuchWafflesInBox() {
        System.out.println("Всего в коробочке вафель: " + this.presentBox
                .stream()
                .filter(sweet -> sweet instanceof  Waffles)
                .count() + " шт.");
    }

    @Override // задание №4. Поиск количества ирисок в коробке с помощью Stream API
    public void howMuchToffeeInBox() {
        System.out.println("Всего в коробочке ирисок: " + this.presentBox
                .stream()
                .filter(sweet -> sweet instanceof  Toffee)
                .count() + " шт.");
    }

    @Override // задание №4. Поиск количества конфет в коробке с помощью Stream API
    public void howMuchCandyInBox() {
        System.out.println("Всего в коробочке конфет: " + this.presentBox
                .stream()
                .filter(sweet -> sweet instanceof  Candy)
                .count() + " шт.");
    }

    @Override
    public void reducePrice(double price){
    try{
    if (this.presentBox.size() == 0) System.out.println("Коробочка пустая");
    if (price <= 0){
        System.out.println("Некорректное ограничение по цене");
        return;
    }
    for (int i =0; i < this.presentBox.size(); i++){                          // 1. удаляем из массива все элементы, у которых цена выше ограничительной цены
        if (price < this.presentBox.get(i).getPrice()) {
            removeFromBoxByIndex(i);
            i-=1;}
    }
        double result = 0;                                                            // 2. считаем общую цену подарка и начинаем убирать по минимальному до тех пор,
        int index = 0;                                                                //пока цена подарка не станет <= ограничительной цены
        for (Sweet sweets: this.presentBox){
            result += sweets.getPrice();
        }

        while (result > price){
            double minPrice = this.presentBox.get(0).getPrice();

            for (int i = 0; i < this.presentBox.size(); i++){
                if (minPrice > this.presentBox.get(i).getPrice()){
                    index = i;
                    minPrice = this.presentBox.get(i).getPrice();
                }
            }
            result -= this.presentBox.get(index).getPrice();
            removeFromBoxByIndex(index);
        }}
    catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Некорректная допустимая цена");
        }
    }

    @Override
    public void reduceWeight(double weight) {
        try{
            if (this.presentBox.size() == 0) System.out.println("Коробочка пустая");
            if (weight <= 0){
                System.out.println("Некорректное ограничение по весу");
                return;
            }
            for (int i =0; i < this.presentBox.size(); i++){                          // 1. удаляем из массива все элементы, у которых вес выше ограничительного веса
                if (weight < this.presentBox.get(i).getWeight()) {
                    removeFromBoxByIndex(i);
                    i-=1;}
            }
            double result = 0;                                                      // 2. считаем общий вес подарка и начинаем убирать по минимальному до тех пор,
            int index = 0;                                                          //пока цена подарка не станет <= ограничительной цены
            for (Sweet sweets: this.presentBox){
                result += sweets.getWeight();
            }

            while (result > weight){
                double minWeight = this.presentBox.get(0).getWeight();

                for (int i = 0; i < this.presentBox.size(); i++){
                    if (minWeight > this.presentBox.get(i).getWeight()){
                        index = i;
                        minWeight = this.presentBox.get(i).getWeight();
                    }
                }
                result -= this.presentBox.get(index).getWeight();
                removeFromBoxByIndex(index);

            }}
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Некорректный допустимый вес");
        }


    }





}
