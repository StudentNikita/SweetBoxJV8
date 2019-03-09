package com.company;

public interface Box {
    public Sweet [] addToBox(Sweet[] collection, Sweet sweet);
    public Sweet [] removeFromBoxByIndex(Sweet [] sweet, int index);
    public void boxWeight (Sweet [] sweet);
    public void boxPrice (Sweet [] sweet);
    public void boxInformation (Sweet [] sweet);
    public Sweet [] reduceWeight (Sweet [] sweet, double weight);
    public Sweet [] reducePrice (Sweet [] sweet, double price);
}
