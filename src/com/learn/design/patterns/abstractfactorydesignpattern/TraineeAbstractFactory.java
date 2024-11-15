package com.learn.design.patterns.abstractfactorydesignpattern;
import com.learn.design.patterns.abstractfactorydesignpattern.Profession;

//This gives us Objects of training phase
public class TraineeAbstractFactory implements AbstractFactory {
    public Profession getProfession(String typeOfprofession) {
        if(typeOfprofession==null){
            return null;
        }
        if(typeOfprofession.equalsIgnoreCase("Engineer")) {
            return new TraineeEngineer();
        }
        if(typeOfprofession.equalsIgnoreCase("Teacher")) {
            return new TraineeTeacher();
        }
        return null;
    }
}
