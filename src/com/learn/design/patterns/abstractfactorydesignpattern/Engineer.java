package com.learn.design.patterns.abstractfactorydesignpattern;

import com.learn.design.patterns.abstractfactorydesignpattern.Profession;

public class Engineer implements Profession {


    @Override
    public void print() {
        System.out.println("I am an Engineer");
    }
}
