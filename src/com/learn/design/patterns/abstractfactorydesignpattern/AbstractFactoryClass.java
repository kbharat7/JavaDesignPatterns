package com.learn.design.patterns.abstractfactorydesignpattern;

public class AbstractFactoryClass {
    public static void main(String[] args) {
        //First we get an instance of abstract factory(Trainee/Professional)
        //Then, we use it to get the profession Object

        AbstractFactory traineeAbstractFactory=AbstractFactoryProducer.getFactory(true);
        AbstractFactory professionalAbstractFactory=AbstractFactoryProducer.getFactory(false);

        Profession traineeTeacher=traineeAbstractFactory.getProfession("Teacher");
        traineeTeacher.print();

        Profession professionalTeacher=professionalAbstractFactory.getProfession("Teacher");
        professionalTeacher.print();



        Profession traineeEngineer=traineeAbstractFactory.getProfession("Engineer");
        traineeEngineer.print();

        Profession professionalEngineer=professionalAbstractFactory.getProfession("Engineer");
        professionalEngineer.print();





    }
}
