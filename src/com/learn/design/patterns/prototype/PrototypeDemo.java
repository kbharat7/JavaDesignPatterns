package com.learn.design.patterns.prototype;

public class PrototypeDemo
{
    public static void main(String[] args) {
        ProfessionCache.loadProffesionCache();
        Profession doctor = ProfessionCache.getProfession(1);
        doctor.print();
        Profession engineer = ProfessionCache.getProfession(2);
        engineer.print();
        Profession teacher =ProfessionCache.getProfession(3);
        teacher.print();

        Profession doctor2 = ProfessionCache.getProfession(1);
        System.out.println(doctor==doctor2);
    }
}
