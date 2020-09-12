public class Card {
    public int rank;
    public String name;
    private String suit;

    public Card(int rank, String name, String suit) {
        this.rank = rank;
        this.suit = suit;
        this.name = name;
    }

    @Override
    public String toString() {
        return name + " of " + suit;
    }
}
