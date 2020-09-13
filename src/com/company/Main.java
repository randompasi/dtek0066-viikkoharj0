package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        StringBuilder reverse = new StringBuilder(input);
        reverse.reverse();
        System.out.println(reverse);
        String palindromiReversed = reverse.toString().replaceAll("\\s+", "").toLowerCase();
        String palindromiOriginal = input.toString().replaceAll("\\s+", "").toLowerCase();
        if (palindromiOriginal.equals(palindromiReversed)) {
            System.out.println("Nimi on palindromi");
        } else {
            System.out.println("Nimi ei ole palindromi.");


        }
    }
}