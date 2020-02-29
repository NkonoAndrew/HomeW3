package edu.sjsu;

import java.lang.invoke.VarHandle;
import java.util.Scanner;

public class Cards {
    public  static void main (String[] args){

        String valueOfCard;
        Scanner input = new Scanner(System.in);
        String cards = input.next();

        switch (cards){
            case "AD":
                valueOfCard = "ace of diamonds";
                break;
            case "AH":
                valueOfCard = "ace of hearts";
                break;
            case "AS":
                valueOfCard = "ace of spades";
                break;
            case "AC":
                valueOfCard = "ace of clubs";
                break;
            case "JD":
                valueOfCard = "jack of diamonds";
                break;
            case "JK":
                valueOfCard = "jack of hearts";
                break;
            case "JS":
                valueOfCard = "jack of spades";
                break;
            case "JC":
                valueOfCard = "jack of clubs";
                break;
            case "QD":
                valueOfCard = "queen of diamonds";
                break;
            case "QH":
                valueOfCard = "queen of hearts";
                break;
            case "QS":
                valueOfCard = "queen of spades";
                break;
            case "QC":
                valueOfCard ="queen of clubs";
                break;
            case "KD":
                valueOfCard = "king of diamonds";
                break;
            case "KH":
                valueOfCard = "king of hearts";
                break;
            case "KS":
                valueOfCard = "king of spades";
                break;
            case "KC":
                valueOfCard = "king of clubs";
                break;
            case "2D":
                valueOfCard = "two of diamonds";
                break;
            case "2H":
                valueOfCard = "two of hearts";
                break;
            case "2S":
                valueOfCard = "two of spades";
            case "2C":
                valueOfCard = "two of clubs";
                break;
            case "3D":
                valueOfCard = "three of diamonds";
                break;
            case "3H":
                valueOfCard = "three of hearts";
                break;
            case "3S":
                valueOfCard = "three of spades";
                break;
            case "3C":
                valueOfCard = "three of clubs";
                break;
                     /*   "four of diamonds", "four of hearts", "four of spades", "five of clubs",
                        "five of diamonds", "six of hearts", "six of spades", "six of clubs",
                        "six of diamonds", "seven of hearts", "seven of spades", "seven of clubs",
                        "seven of diamonds", "seven of hearts", "seven of spades", "seven of clubs",
                        "eight of diamonds", "eight of hearts", "eight of spades", "eight of clubs",
                        "nine of diamonds", "nine of hearts", "nine of spades", "nine of clubs",
                        "ten of diamonds", "ten of hearts", "ten of spades", "ten of clubs",*/

        }
    }
}
