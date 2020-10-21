package ru.mirea;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList(10);

        names.add("Andrey");
        names.add("Sasha");
        names.add("Masha");
        names.add("Lida");
        ArrayList<String> names2 = new ArrayList(names.subList(1,4));
        System.out.println(names2);
        names2.addAll(names.subList(1,3));
        System.out.println(names2);
        System.out.println( names);
        names.set(2,"Dima");
        System.out.println( names);
        names.remove("Lida");
        System.out.println( names);
        names.remove(2);
        System.out.println( names);

        System.out.println(names.get(1));
        System.out.println(names2.lastIndexOf("Sasha"));
        System.out.println(names2.indexOf("Sasha"));
    }
}
