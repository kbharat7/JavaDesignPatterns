package com.learn.design.patterns.prototype;

import com.learn.design.patterns.prototype.Profession;

public class Teacher extends Profession {

    @Override
    public void print() {
        System.out.println("I am in the print method of Teacher");
    }
}
