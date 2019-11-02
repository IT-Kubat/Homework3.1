package com.company;

import com.sun.source.tree.ContinueTree;

public class Main {

    public static void main(String[] args) {
        String[] names = new String[3];
        names[0] = "Erbol";
        names[1] = "Nurbek";
        names[2] = "Marina";
        System.out.println(names[0] + "  " + names[1] + "  " + names[2]);

        String name = "Marina";

        switch (name) {
            case "Erbol":
                System.out.println("Доброе утро Эрбол");
                break;
            case "Nurbek":
                System.out.println("Добрый день Нурбек");
                break;
            case "Marina":
                System.out.println("Добрый вечер Марина");
                break;
            default:
                System.out.println("Привет всем");


        }


    }
}
