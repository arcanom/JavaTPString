package org.example.comptageoccurence;

import java.util.Arrays;
import java.util.Scanner;

public class ComptageOccurence {

    public static void Comptage(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, donne moi un mot");
        String mot = sc.next();
        System.out.println("Donnez moi une lettre");
        char lettre = sc.next().charAt(0);
        comtageOcc(mot, lettre);
    }

public static void comtageOcc(String mot, char c) {
    int compteur = 0;

    for (int i = 0; i < mot.length(); i++) {

        if (c == mot.charAt(i)) {
            compteur += 1;
        }
    }
    System.out.println(compteur);


}

}
