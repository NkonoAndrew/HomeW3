package edu.sjsu;

import java.util.Arrays;
import java.util.Scanner;

public class Card {

    String card;
    String cards;
    public Card (){

    }
    public Card (String getCard){
        card = getCard;
    }

    String getDescription(){

        String cardNotation[] = {
                "AD", "AH", "AS", "AC",
                "JD", "JH", "JS", "JC",
                "QD", "QH", "QS", "QC",
                "KD", "KH", "KS", "KC",
                "2D", "2H", "2S", "2C",
                "3D", "3H", "3S", "3C",
                "4D", "4H", "4S", "4C",
                "5D", "5H", "5S", "5C",
                "6D", "6H", "6S", "6C",
                "7D", "7H", "7S", "7C",
                "8D", "8H", "8S", "8C",
                "9D", "9H", "9S", "9C",
                "10D", "10H", "10S", "10C"};

        String cardValue[] = {
                "ace of diamonds", "ace of hearts", "ace of spades", "ace of clubs",
                "jack of diamonds", "jack of hearts", "jack of spades", "jack of clubs",
                "queen of diamonds", "queen of hearts", "queen of spades", "queen of clubs",
                "king of diamonds", "king of hearts", "king of spades", "king of clubs",
                "two of diamonds", "two of hearts", "two of spades", "two of clubs",
                "three of diamonds", "three of hearts", "three of spades", "three of clubs",
                "four of diamonds", "four of hearts", "four of spades", "five of clubs",
                "five of diamonds", "five of hearts", "five of spades", "five of clubs",
                "six of diamonds", "six of hearts", "six of spades", "six of clubs",
                "seven of diamonds", "seven of hearts", "seven of spades", "seven of clubs",
                "eight of diamonds", "eight of hearts", "eight of spades", "eight of clubs",
                "nine of diamonds", "nine of hearts", "nine of spades", "nine of clubs",
                "ten of diamonds", "ten of hearts", "ten of spades", "ten of clubs",
        };

        for (int i = 0; i < cardNotation.length ; i++) {
            for (int j = 1; j < cardValue.length; j++) {
                if (card.equals(cardNotation[i])){
                    card = cardValue[i];
                }
            }
        }
        System.out.println(card);
        return card;

    }

}
