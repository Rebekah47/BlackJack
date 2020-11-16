import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Deck{

    private Card card;
    private ArrayList<Card> fullDeck;
    private ArrayList<Card> unshuffledDeck;
    private List<String> theSuits;

    public Deck() {
        this.fullDeck = new ArrayList<Card>();
        this.theSuits = Arrays.asList("Hearts", "Diamonds", "Clubs", "Spades");
    }


    public ArrayList<Card> getFullDeck() {
        return fullDeck;
    }

    public void setFullDeck(ArrayList<Card> fullDeck) {
        this.fullDeck = fullDeck;
    }

    public ArrayList<Card> createOneSuit(String suit){
        for (CardNumberValue singleCard : CardNumberValue.values()){
           Card newCard = new Card(singleCard, suit);
           fullDeck.add(newCard);
        }
        return fullDeck;
    }

    public int getDeckSize(){
        return this.fullDeck.size();
    }

    public void createFullDeck() {
        for (String suit : this.theSuits){
            this.createOneSuit(suit);
        }
    }

    public ArrayList<Card> shuffleDeck( ArrayList<Card> deck){
        Collections.shuffle(deck);
        return deck;
    }

    public ArrayList<Card> makeAndShuffle(){
        
    }
}
