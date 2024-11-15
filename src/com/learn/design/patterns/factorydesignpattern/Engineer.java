package com.learn.design.patterns.factorydesignpattern;

public class Engineer implements Profession{
    @Override
    public void print() {
        System.out.println("I am in the print method of Engineer");
    }
}
