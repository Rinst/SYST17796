package cardgame;

/**
 *Generates a deck of cards using an array
 * 
 * @author Jordan Lee
 */
public class CardGame {

    public static void main(String[] args) {
        
        //Varaibles
        Card[] deck = new Card[52];
        
        //Generate the deck
        for (int i = 0; i < deck.length; i++) {
            deck[i] = new Card();
            deck[i].setSuit(i/13);
            deck[i].setVal(i%13);
            deck[i].printCard();
        }
        
    }

}
