package com.learn.design.patterns.abstractfactorydesignpattern;

//Here we decide up which kindof factory we want i.e trainee or not
//So,accordingly when we get profession we will get profession of that type
public class AbstractFactoryProducer {
    public static AbstractFactory getFactory(boolean isTrainee) {
        if (isTrainee) {
            return new TraineeAbstractFactory();
        }
        else {
            return new ProfessionalAbstractFactory();
        }
    }
}
