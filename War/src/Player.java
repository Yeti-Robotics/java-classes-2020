public class Player {
    public String name;
    public Card[] cards;
    private int score = 0;

    public Player(String name, Card[] cards) {
        this.name = name;
        this.cards = cards;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return name + "'s score is " + score;
    }
}
