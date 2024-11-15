package com.learn.design.patterns.factorydesignpattern;

import javax.print.Doc;

//This is the client
//Client does not know how the object is getting created etc
public class FactoryMainClass {
    public static void main(String[] args) {
        ProfessionFactory professionFactory = new ProfessionFactory();


        Profession doctor= professionFactory.getProfession("Doctor");
        doctor.print();


        Profession engineer= professionFactory.getProfession("engineer");
        engineer.print();


        Profession teacher= professionFactory.getProfession("teacher");
        teacher.print();
    }
}
