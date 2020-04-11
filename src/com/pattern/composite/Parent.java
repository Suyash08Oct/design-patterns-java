package com.pattern.composite;

import java.util.ArrayList;
import java.util.List;

public class Parent implements FamilyMember {
    List<FamilyMember> familyMemberList = new ArrayList<>();

    private String name;
    private List<String> weapons;

    public Parent(String name, List<String> weapons) {
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

    public void add(FamilyMember familyMember) {
        familyMemberList.add(familyMember);
    }

    public void remove(FamilyMember familyMember) {
        familyMemberList.remove(familyMember);
    }

    public FamilyMember getSon(int i) {
        return familyMemberList.get(i);
    }

    @Override
    public void getMemberDetails() {
        System.out.println("Name :" + name);
        if (weapons != null)
            System.out.println("Skills :" + weapons);

        System.out.println("****************************");

        for (FamilyMember member : familyMemberList) {
            member.getMemberDetails();
        }
    }
}
