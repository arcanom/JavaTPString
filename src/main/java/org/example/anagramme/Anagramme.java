package org.example.anagramme;

import java.util.Arrays;
import java.util.Scanner;


public class Anagramme {
    public static void Anagramme(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Premier Mot");
        String mot = sc.next();

        Scanner sc2 = new Scanner(System.in);
        System.out.println("Deuxieme Mot");
        String mot1 = sc2.next();
//

        char[] manoir = mot.toCharArray();
        char[] romain = mot1.toCharArray();


        Arrays.sort(manoir);
        Arrays.sort(romain);

        System.out.println(manoir);
        System.out.println(romain);

        String test =  new String(manoir);
        String test2 =  new String(romain);

       if(test.equals(test2) ){
           System.out.println(mot + " et " + mot1 +" sont des anagrammes");
       } else {
           System.out.println(mot +" et " + mot1 +" ne sont pas des anagrammes");
       }

    }
}
