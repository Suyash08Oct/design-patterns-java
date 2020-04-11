package com.pattern.composite;

import java.util.ArrayList;
import java.util.List;

public class Son implements FamilyMember {
    private String name;
    private List<String> weapons;

    public Son(String name, List<String> weapons) {
        this.weapons = new ArrayList<>();

        this.name = name;
        this.weapons = weapons;
    }

    public String getName() {
        return name;
    }

    public List<String> getWeapons() {
        return weapons;
    }

    @Override
    public void getMemberDetails() {
        System.out.println("Name :" + name);
        if (weapons != null)
            System.out.println("Skills :" + weapons);

        System.out.println("****************************");
    }
}
