import java.util.Arrays;
import java.util.Random;

public class Deck {
    private Card[] deck;

    public Deck() {
        deck = new Card[52];
        String[] suits = {"Spades", "Hearts", "Clubs", "Diamonds"};
        String[] name = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
    }
}