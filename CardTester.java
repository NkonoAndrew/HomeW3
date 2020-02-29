package edu.sjsu;

import java.util.Scanner;

public class CardTester {
    public static void main(String[] args) {

        Scanner input  = new Scanner(System.in);
        System.out.println("Notation:");
        String cards = input.next();

        Card newCard = new Card(cards);
        newCard.getDescription();

    }
}
