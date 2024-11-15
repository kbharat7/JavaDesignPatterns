package com.learn.design.patterns.abstractfactorydesignpattern;

//This will be used by producer to get Abstract factory
public interface AbstractFactory {
    Profession getProfession(String typeOfprofession);
}
