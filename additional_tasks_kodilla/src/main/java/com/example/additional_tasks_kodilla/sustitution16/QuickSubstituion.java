package com.example.additional_tasks_kodilla.sustitution16;

import java.util.ArrayList;
import java.util.List;

public class QuickSubstituion {
    public static void main(String[] args) {
//        substitution();
//        threePieceOfTruth();
//        hardThreePieceOfTruth();
//        dividedFunction(0, 100, 5);
//        vowelSeeker("Adam");
        String input = "Kajak";
        String mirroredString = mirrorStrings(input);
        System.out.println(mirroredString);
    }

    public static void substitution() {
        int a = 5;
        int b = 7;

        a += b;
        b = a - b;
        a = a - b;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    public static void threePieceOfTruth() {
        for (int i = 0; i <= 100; i++) {
            if (i % 3 == 0)
                System.out.println(i);
        }
    }

    public static void hardThreePieceOfTruth() {
        for (int i = 0; i <= 100; i += 4) {
            System.out.println(i);
        }
    }

    public static List<Integer> dividedFunction(int a, int b, int x) {
        List<Integer> dividedByX = new ArrayList<>();
        for (int i = a; i <= b; i++) {
            if (i % x == 0) {
                dividedByX.add(i);
            }
        }
        return dividedByX;
    }

    public static String vowelSeeker(String example) {
        List<Character> vowelList = new ArrayList<>();
        String vowels = "";

        for (int i = 0; i < example.length(); i++) {
            char ch = Character.toLowerCase(example.charAt(i));

            if (isVowel(ch)) {
                if (!vowelList.contains(ch)) {
                    vowelList.add(ch);
                    vowels += ch;
                }
            }
        }
        System.out.println(vowels);

        return vowels;

    }

    public static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'y' || ch == 'u' || ch == 'i' || ch == 'o';
    }

    public static String mirrorStrings(String input) {
        StringBuilder sb = new StringBuilder(input);
        return sb.reverse().toString();

    }
}
