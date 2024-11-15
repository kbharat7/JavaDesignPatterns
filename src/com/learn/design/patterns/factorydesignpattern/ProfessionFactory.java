package com.learn.design.patterns.factorydesignpattern;

public class ProfessionFactory {
    //This class will take a type of what profession you want to have and accordingly return up an object of that class
    public Profession getProfession(String profession) {
        if(profession==null){
            return null;
        }
        if(profession.equalsIgnoreCase("Doctor")){
            return new Doctor();
        }
        if(profession.equalsIgnoreCase("Teacher")){
            return new Teacher();
        }
        if(profession.equalsIgnoreCase("Engineer")){
            return new Engineer();
        }
        return null;
    }
}
