import java.util.Arrays;
import java.util.Random;

public class Deck {
    private Card[] deck;

    public Deck() {
        deck = new Card[52];
        String[] suits = {"Spades", "Hearts", "Clubs", "Diamonds"};
        String[] name = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < name.length; j++) {
                Card card = new Card(j + 1, name[j], suits[i]);
                int position  = (i*name.length) + j;
                deck[position] = card;
            }
        }
    }

    public Card[] getDeck() {
        return deck;
    }

    public void shuffle() {
        Random random = new Random();
        for (int i = 1; i < deck.length; i++) {
            int currentPostition = i;
            int newPosition = random.nextInt(deck.length);
            Card temp = deck[currentPostition];
            deck[currentPostition] = deck[newPosition];
            deck[newPosition] = temp;
        }
    }

    public Card[] dealPlayer1Hand() {
        return Arrays.copyOfRange(deck, 0, deck.length / 2);
    }

    public Card[] dealPlayer2Hand() {
        return Arrays.copyOfRange(deck, deck.length / 2, deck.length);
    }
}