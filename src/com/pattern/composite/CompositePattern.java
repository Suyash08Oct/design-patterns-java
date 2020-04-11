package com.pattern.composite;

import java.util.Arrays;

public class CompositePattern {
    public static void main(String... s) {
        Parent vichitravirya = new Parent("Vichitravirya", Arrays.asList("Gada", "Sword"));
        Parent dhritarashtra = new Parent("Dhritarashtra", null);
        Parent pandu = new Parent("Pandu", Arrays.asList("Sword", "Bow & Arrows"));
        Parent arjuna = new Parent("Arjuna", Arrays.asList("Bow & Arrows"));

        FamilyMember vidur = new Son("Vidur", null);
        FamilyMember duryodhana = new Son("Duryodhana", Arrays.asList("Gada", "Sword"));
        FamilyMember dushana = new Son("Dushana", Arrays.asList("Gada", "Sword"));
        FamilyMember yudhisthira = new Son("Yudhisthira", Arrays.asList("Javelin"));
        FamilyMember bheema = new Son("Bheema", Arrays.asList("Gada"));
        FamilyMember nakul = new Son("Nakul", Arrays.asList("Sword"));
        FamilyMember sahdev = new Son("Sahdev", Arrays.asList("Sword"));
        FamilyMember abhimanyu = new Son("Abhimanyu", Arrays.asList("Bow & Arrows"));

        vichitravirya.add(dhritarashtra);
        vichitravirya.add(pandu);
        vichitravirya.add(vidur);

        dhritarashtra.add(duryodhana);
        dhritarashtra.add(dushana);

        pandu.add(yudhisthira);
        pandu.add(bheema);
        pandu.add(arjuna);
        pandu.add(nakul);
        pandu.add(sahdev);

        arjuna.add(abhimanyu);

        vichitravirya.getMemberDetails();

    }
}
