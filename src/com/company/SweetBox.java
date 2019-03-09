package com.company;

public class SweetBox implements Box {



    @Override
    public Sweet [] addToBox(Sweet[] collection, Sweet sweet) {
    Sweet [] newCollection = new Sweet[collection.length + 1];
    for (int i = 0; i < collection.length; i++){
        newCollection[i] = collection[i];
    }
    newCollection[newCollection.length - 1] = sweet;
    return newCollection;

    }

    @Override
    public Sweet [] removeFromBoxByIndex(Sweet [] sweet, int index) {
    for (int i = 0; i < (sweet.length - index - 1); i++){
        sweet[index+i] = sweet [index+i+1];
    }
    Sweet [] newCollection = new Sweet[sweet.length-1];
    for (int i =0; i <newCollection.length; i++){
        newCollection[i] = sweet[i];
    }
    return newCollection;
    }

    @Override
    public void boxWeight(Sweet[] sweet) {
        double result = 0;
        for (Sweet sweets: sweet){
            result += sweets.getWeight();
        }
        System.out.println("Общий вес коробки " + result);
    }

    @Override
    public void boxPrice(Sweet[] sweet) {
        double result = 0;
        for (Sweet sweets: sweet){
            result += sweets.getPrice();
        }
        System.out.println("Общая стоимость коробки " + result);
    }

    @Override
    public void boxInformation(Sweet [] sweet) {
        System.out.println("Состав коробки: ");
        for (int i = 0; i < sweet.length; i++){
            System.out.println((i+1) + ") " + sweet[i]);
        }

    }

    @Override
    public Sweet[] reduceWeight(Sweet[] sweet, double weight) {
        double result = 0;
        double minWeight = sweet[0].getWeight();
        int index = 0;
        for (Sweet sweets: sweet){
            result += sweets.getWeight();
        }

        Sweet [] newCollection = sweet;
            if (result > weight){
            for (int i = 0; i < sweet.length; i++){
                if (minWeight > sweet[i].getWeight()){
                    index = i;
                    minWeight = sweet[i].getWeight();
                }
            }
            newCollection = removeFromBoxByIndex(sweet,index);}




        return newCollection;
    }

    @Override
    public Sweet[] reducePrice(Sweet[] sweet, double price) {
        double result = 0;
        double minPrice = sweet[0].getPrice();
        int index = 0;
        for (Sweet sweets: sweet){
            result += sweets.getPrice();
        }

        Sweet [] newCollection = sweet;
        if (result > price){
            for (int i = 0; i < sweet.length; i++){
                if (minPrice > sweet[i].getPrice()){
                    index = i;
                    minPrice = sweet[i].getPrice();
                }
            }
            newCollection = removeFromBoxByIndex(sweet,index);}




        return newCollection;
    }
}
