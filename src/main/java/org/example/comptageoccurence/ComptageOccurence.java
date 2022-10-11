package org.example.comptageoccurence;

import java.util.Scanner;

public class ComptageOccurence {

    public static void Comptage(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, donne moi un mot");
        String mot = sc.next();
//        String mot = "anticonstitutionnellement";
        char[] tab = mot.toCharArray();
        System.out.println(tab.length);

    }


}
