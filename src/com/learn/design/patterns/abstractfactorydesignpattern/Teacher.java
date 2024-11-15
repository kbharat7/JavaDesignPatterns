package com.learn.design.patterns.abstractfactorydesignpattern;

import com.learn.design.patterns.abstractfactorydesignpattern.Profession;

public class Teacher implements Profession {
    @Override
    public void print() {
        System.out.println("I am a Teacher");
    }
}
