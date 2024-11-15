package com.learn.design.patterns.singleton;

public class SingletonClass {
    //Have a static variable and initialization
    private static SingletonClass instance=new SingletonClass();

    //Private constructor, no setter
    private SingletonClass() {

    }
    //a static method which returns the singleton instance
    public static SingletonClass getInstance() {
        return instance;

    }
}
