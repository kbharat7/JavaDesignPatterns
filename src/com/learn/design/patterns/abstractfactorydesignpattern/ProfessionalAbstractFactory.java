package com.learn.design.patterns.abstractfactorydesignpattern;

import com.learn.design.patterns.abstractfactorydesignpattern.Profession;

//This gives us Objects of Professional phase
public class ProfessionalAbstractFactory implements AbstractFactory {
    public Profession getProfession(String typeOfprofession) {
        if(typeOfprofession==null){
            return null;
        }
        if(typeOfprofession.equalsIgnoreCase("Engineer")) {
            return new Engineer();
        }
        if(typeOfprofession.equalsIgnoreCase("Teacher")) {
            return new Teacher();
        }
        return null;
    }
}
