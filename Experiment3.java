public class Experiment3 {
    // 20BAI10040 Shankar Lohar CSE3002 Programming in Java
    public static void rockPaperScissors(String player1move, String player2move) {
        player1move = player1move.toLowerCase();
        player2move = player2move.toLowerCase();
        if (player1move.equals(player2move)) {
            System.out.println("TIE!");
        } else if (player1move.equals("rock") && player2move.equals("scissors")) {
            System.out.println("Player 1 wins!");
        } else if (player2move.equals("rock") && player1move.equals("scissors")) {
            System.out.println("Player 2 wins!");
        } else if (player1move.equals("scissors") && player2move.equals("paper")) {
            System.out.println("Player 1 wins!");
        } else if (player2move.equals("scissors") && player1move.equals("paper")) {
            System.out.println("Player 2 wins!");
        } else if (player1move.equals("paper") && player2move.equals("rock")) {
            System.out.println("Player 1 wins!");
        } else if (player2move.equals("paper") && player1move.equals("rock")) {
            System.out.println("Player 2 wins!");
        } else {
            if (!player1move.equals("rock") && !player1move.equals("paper") && !player1move.equals("scissors")) {
                if (!player2move.equals("rock") && !player2move.equals("paper") && !player2move.equals("scissors"))
                    System.out.println("Invalid move of " + player1move + " and " + player2move + "!");
                else System.out.println("Invalid move of " + player1move + "!");
            } else System.out.println("Invalid move of " + player2move + "!");
        }}
    public static void main(String args[]) {
        rockPaperScissors("Rock", "scissors");
        rockPaperScissors("ROCK", "Paper");
        rockPaperScissors("SCISSORS", "Scissors");
        rockPaperScissors("CAR", "Scissors");
        rockPaperScissors("THOR", "HULK");}}
