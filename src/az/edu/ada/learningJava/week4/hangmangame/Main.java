package az.edu.ada.learningJava.week4.hangmangame;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter a secret word: ");
        String secretWord = sc.nextLine();
        Player player = new Player(name);
        HangmanGame game = new HangmanGame(secretWord.toLowerCase());

        while (true){
            System.out.println("You have " + player.getAvailableGuesses() +
                    " guesses");
            game.displayState();
            System.out.print("write your guess: ");
            char guess = sc.next().toLowerCase().charAt(0);
            player.addGuess(guess);
            if (game.inWord(guess)){
                game.updateState(guess);
                if (game.hasFound()) {
                    System.out.println("Congratulations!");
                    System.out.println("The word is: " + game.getSecretWord());
                    break;
                }
            } else {
                player.decrementAvailableGuesses();
                if (!player.hasGuesses()){
                    System.out.println("You lost");
                    System.out.println("The word was: " + game.getSecretWord());
                    break;
                }
            }
            System.out.println(player.getGuesses());
        }
    }
}
