/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cardgame;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author jordansarmiento
 */
public class CardGame {

    private int value;
    private String suit;
    
    //create array of possible suits
    public static final String[] SUITS = 
        {"Hearts", "Diamonds", "Spades", "Clubs"};
    
    // Two-args constructor
    public CardGame(int value, String suit) {
        this.value = value;
        this.suit = suit;
    }

    public int getValue() {
        return this.value;
    }

    /**
     *
     * @param value
     */
    public void setValue(int value) {
        this.value = value;
    }

    public String getSuit() {
        return this.suit;
    }

    /**
     *
     * @param suit
     */
    public void setSuit(String suit) {
        this.suit = suit;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        //create an array to hold 7 cards
        Card[] hand = new Card[7];
        Random random = new Random();
        
        for (int i = 0; i < hand.length; i++){
            
            int value = random.nextInt(13) + 1;
            System.out.println(value);
            String suit = Card.SUITS[random.nextInt(4)];
            
            Card card = new Card(value, suit);
            hand[i] = card;
        }
        
        //print each card so we can see what was generated
//        for(Card card: hand){
//            System.out.println(card.getValue() + " of " + card.getSuit());
//        }
        
        //ask user for card
        System.out.println("Please choose a suit for your lucky card");
        for (int i = 0; 1 < Card.SUITS.length; i++){
            System.out.println ((i+1) + ": " + Card.SUITS[i]) ;
        }
        
        int suit = input.nextInt ();
        
        System.out.println("Enter a value (1 to 13)");
        int value = input.nextInt () ;
        
        //create new Card with the two values chosen
        Card userGuess = new Card (value, Card. SUITS[suit-1]) ;
        
        //check if it matches
        boolean match=false;
        for (Card card: hand){
            if (card.getValue ()==userGuess.getValue () && (card.getSuit ().equals (userGuess.getSuit ()))){
                match=true;
                break;
            }           
        }
        System.out.println ("Did you guess it? " + match) ;
    }
}
