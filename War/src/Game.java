public class Game {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Time for War!");
        Deck deck = new Deck();
        deck.shuffle();

        Player player1 = new Player("Valerie", deck.dealPlayer1Hand());
        Player player2 = new Player("Allison", deck.dealPlayer2Hand());

        for (int i = 0; i < player1.cards.length; i++) {
            Card player1Card = player1.cards[i];
            Card player2Card = player2.cards[i];

            System.out.println(player1Card + " vs " + player2Card);
            Thread.sleep(2000);

            if (player1Card.rank > player2Card.rank) {
                player1.setScore(player1.getScore() + 1);
            } else if (player2Card.rank > player1Card.rank) {
                player2.setScore(player2.getScore() + 1);
            } else {
                System.out.println("You both lose!");
            }
        }

        System.out.println(player1);
        System.out.println(player2);

        if (player1.getScore() > player2.getScore()) {
            System.out.println(player1.name + " wins!");
        } else if (player2.getScore() > player1.getScore()) {
            System.out.println(player2.name + " wins!");
        } else {
            System.out.println("It was a draw! You both lose!");
        }
    }
}
