/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leap.countvowel;

import java.util.Scanner;

/**
 *
 * @author Karan
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner vow = new Scanner(System.in);
        System.out.println("Enter the sentence:");
        String input = vow.nextLine();
        int vowCount = 0, consCount = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'a' || input.charAt(i) == 'e' || input.charAt(i) == 'i' || input.charAt(i) == 'o' || input.charAt(i) == 'u') {
                vowCount++;
            } else if (input.charAt(i) == ' ') {
                continue;
            } else {
                consCount++;
            }

        }
        System.out.println("vowel=" + vowCount);
        System.out.println("consonant=" + consCount);
    }
}
