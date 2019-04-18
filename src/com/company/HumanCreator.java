package com.company;

import com.company.Human;

import java.util.ArrayList;
import java.util.List;

public class HumanCreator {


    public List Create(){

        Human Male = new Human("Ali", "Male");

        Human Female = new Human("Saba", "Female");

        //List<Integer> list= new ArrayList<>(Arrays.asList(hum,hum1));

        List<Human> Humans = new ArrayList<>();
        Humans.add(Male);
        Humans.add(Female);

        return Humans;
    }

    ArrayList<Integer> ages = new ArrayList<>();
}
