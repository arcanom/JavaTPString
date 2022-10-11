package org.example.comptagemot;

import java.util.Arrays;
import java.util.Scanner;

public class ComptageMot {

    public static <string> void ComptageMot(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Donnez une phrase");
        String phrase = sc.nextLine();
//        String phrase = "Cette andouille de Fernand m'a oublié, j'ai du repartir à pied comme une andouille";
        int compteur = 0;
        String[] tab = phrase.split(" ");
        for (int i =0; i< tab.length;i++){
               compteur++;

        }
        System.out.println(compteur);




    }
}
