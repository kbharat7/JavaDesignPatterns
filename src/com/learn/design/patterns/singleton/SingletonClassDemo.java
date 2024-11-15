package com.learn.design.patterns.singleton;

public class SingletonClassDemo {
    public static void main(String[] args) {
        //get 2 instances and we see the reference is same
        SingletonClass singletonClass = SingletonClass.getInstance();
        System.out.println(singletonClass);

        SingletonClass singletonClass2 = SingletonClass.getInstance();
        System.out.println(singletonClass);

        System.out.println(singletonClass2==singletonClass);

    }
}
