package com.company;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        // write your code here

        HumanCreator humanCreator = new HumanCreator();
        List<Human> humans =  humanCreator.Create();
        System.out.println(humans.get(0).name);
    }
}
