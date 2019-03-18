package com.company;

public class Main {


    public static void main(String[] args) {
        Box box = new SweetBox(sweet -> sweet.getPrice() < 1000);  // задание №2. Установление предиката в коробке. Нельзя помещать сладость больше 1000 р

        SweetFactory<Sweet> chocoFactory = Chocolate::new; //задание №1. Создание 2х объектов через лямбды: фабрики создают только шоколадки и вафли
        SweetFactory<Sweet> wafflFactory = Waffles::new;

        SweetFactory<Sweet> toffeeFactory = new SweetFactory<Sweet>() {
            @Override
            public Sweet create(String name, double weight, double price) { //задание №1. Создание 2х объектов как отдельных классов. Фабрики создают только ириски и конфеты
                return new Toffee(name, weight, price);
            }
        };
        SweetFactory<Sweet> candyFactory = new SweetFactory<Sweet>() {
            @Override
            public Sweet create(String name, double weight, double price) {
                return new Candy(name, weight, price);
            }
        };


        box.addToBox(chocoFactory.create("Аленка",49, 950));     // добавляем созданные сладости в коробку, конфеты не добавятся, т.к. их цена > 1000 р
        box.boxInformation();
        box.addToBox(wafflFactory.create("К чаю",15, 805));
        box.boxInformation();
        box.addToBox(toffeeFactory.create("Элитная Коровка",18, 200));
        box.boxInformation();
        box.addToBox(candyFactory.create("Бонпари",5, 1501));


        box.boxWeight();          // сколько коробочка весит
        box.boxPrice();             // сколько коробочка стоит
        box.howMuchChocoInBox();    // сколько в коробочке Шоколадок
        box.howMuchWafflesInBox();  // сколько в коробочке Вафель
        box.howMuchToffeeInBox();   // сколько в коробочке Ирисок
        box.howMuchCandyInBox();    // сколько в коробочке Конфет
        ((SweetBox) box).convertToEur(); // сколько коробочка стоит в евро
















        // write your code here
    }


}
