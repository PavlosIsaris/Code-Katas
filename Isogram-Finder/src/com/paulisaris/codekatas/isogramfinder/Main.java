package com.paulisaris.codekatas.isogramfinder;

public class Main {

    public static void main(String[] args) {
        IsogramFinder isogramFinder = new IsogramFinder();

        System.out.println("Isogram: " + isogramFinder.isIsogram("isogram"));
        System.out.println("Non Isogram: " + isogramFinder.isIsogram("DOCTORWHO"));
    }

}
