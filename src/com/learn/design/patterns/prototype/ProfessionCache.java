package com.learn.design.patterns.prototype;

import java.util.HashMap;

public class ProfessionCache {
    private static HashMap<Integer, Profession> professionHashMap = new HashMap<Integer,Profession>();

    public static Profession getProfession(int professionId) {
        Profession profession = professionHashMap.get(professionId);
        return (Profession) profession.cloningMethod();
    }

    public static void loadProffesionCache(){
        Doctor doctor = new Doctor();
        doctor.id=1;
        professionHashMap.put(doctor.id,doctor);

        Engineer engineer = new Engineer();
        engineer.id=2;
        professionHashMap.put(engineer.id,engineer);

        Teacher teacher = new Teacher();
        teacher.id=3;
        professionHashMap.put(teacher.id,teacher);


    }

}
