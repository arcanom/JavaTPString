package org.example.pyramide;

import java.util.Scanner;

public class Pyramide {
    public static void Pyramide(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Hauteur de la pyramide ? ");
        int valeur = sc.nextInt();
        String pyramide =  " ";
        for(int i=1; i<=valeur;i++){

            pyramide = pyramide + "*";
            System.out.println(pyramide);
        }
        for(int i = valeur; i>0; i--){
            pyramide = pyramide.substring(0,i);
            System.out.println(pyramide);
        }
    }
}
