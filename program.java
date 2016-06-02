/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.check;

import java.util.Scanner;

/**
 *
 * @author nickhnl
 */
public class program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner check = new Scanner(System.in);
        while (true) {
            System.out.println("Enter any string");
            String s = check.next();
            char[] word = s.toCharArray();
            for (char i : word) {
                switch (i) {
                    case 'a':
                    case 'e':
                    case 'i':
                    case 'o':
                    case 'u':
                    case 'A':
                    case 'E':
                    case 'I':
                    case 'O':
                    case 'U':
                        System.out.println("The entered string is vowel");
                        break;
                    default:
                        System.out.println("The entered string is consonant");
                        ;
                        break;
                }
            }
            System.out.println("Check another??");
            String choice = check.next();
            if (choice.equalsIgnoreCase("n")) {
                System.exit(0);
            }
        }
    }
}
