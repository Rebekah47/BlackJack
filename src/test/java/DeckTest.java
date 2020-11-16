import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DeckTest {

    Deck deck1;
    Deck deck2;
    Card card;
    CardNumberValue cardNumberValue;
    ArrayList<Card> theDeck;

    @Before
    public void before(){
        deck1 = new Deck();
        deck2 = new Deck();
    }

    @Test
    public void canAddOneSuit(){
        deck1.createOneSuit("Hearts");
        assertEquals(13, deck1.getDeckSize());
    }

    @Test
    public void canCreateFullDeck(){
        deck1.createFullDeck();
        assertEquals(52, deck1.getDeckSize());
    }

//    @Test
//    public void canShuffleDeck(){
//        deck1.createFullDeck();
//        deck2.createFullDeck();
//        deck1.shuffleDeck(deck1);
//    }
}

