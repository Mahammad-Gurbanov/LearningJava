package az.edu.ada.learningJava.week4.hangmangame;

public class Main {
    public static void main(String[] args) {
        Player p1 = new Player("P1");
        HangmanGame game = new HangmanGame("ABC");
        System.out.println(game.inWord('A'));
        System.out.println(game.inWord('Z'));
        game.displayState();
        game.updateState('C');
        game.displayState();

    }
}
