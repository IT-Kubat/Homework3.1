package com.company;

import com.sun.source.tree.ContinueTree;

public class Main {

    public static void main(String[] args) {
        String[] names = new String[3];
        names[0] = "Erbol";
        names[1] = "Nurbek";
        names[2] = "Marina";
        String[] namess = new String[4];
        namess[0] = names[0];
        namess[1] = names[1];
        namess[2] = names[2];
        namess[3] = "Daniyar";

        String name = "Daniyar";

        switch (name) {
            case "Erbol":
                System.out.println("Доброе утро Эрбол");
                break;
            case "Nurbek":
                System.out.println("Добрый день Нурбек");
                break;
            case "Marina":
                System.out.println("Добрый вечер Марина");
                case "Daniyar":
                System.out.println("Добрый вечер Данияр");
                break;
        }

        System.out.println(namess[0] + "  " + namess[1] + "  " + namess[2] + " " + namess[3]);


    }
}
