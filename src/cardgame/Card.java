package cardgame;

/**
 * Creates the card class. 
 * Contains two values, suit, and cardVal for the card suit and rank.
 * 
 * @author Jordan Lee
 */

public class Card {
    private String[] suitSelector = {"Diamonds", "Hearts", "Spades", "Clubs"};
    private String[] valueSelector = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
    
    private String suit;
    private String cardVal;
    
    //Constructor
    public Card() {
        
    }
    
    /**
     * Sets the suit of the card
     * 
     * @param s 
     */
    public void setSuit(int s) {
        this.suit = suitSelector[s];
    }
    
    /**
     * Sets the value of the card
     * 
     * @param val 
     */
    public void setVal(int val) {
        this.cardVal = valueSelector[val];
    }
    
    /**
     * Outputs the current card
     */
    public void printCard() {
        System.out.println(this.cardVal + " of " + this.suit);
    }
    
}
