package org.example.palindrome;

import java.util.Scanner;

public class Palindrome {

    public  static  void Palindrome(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Votre mot");
        String mot = sc.next();
        char ch;
        String motInversed = "";
        for(int i=0; i<mot.length();i++){
            ch = mot.charAt(i);
            motInversed = ch + motInversed;
        }

       if(mot.equals(motInversed)){
           System.out.println(mot + " est un palindrome");
       } else {
           System.out.println(mot + " n'est pas un palindrome");

           }
    }
}
