import java.util.List;

public class Card {
    private String suit;
    private CardNumberValue cardNumberValue;

    public Card(CardNumberValue cardNumberValue, String suit) {
        setCardValue(cardNumberValue);
        setSuit(suit);
    }

    public CardNumberValue getCardValue() {
        return cardNumberValue;
    }

    public void setCardValue(CardNumberValue cardValue) {
        this.cardNumberValue = cardValue;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }


}
