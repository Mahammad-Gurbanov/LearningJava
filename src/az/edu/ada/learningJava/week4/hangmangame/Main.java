package az.edu.ada.learningJava.week4.hangmangame;

public class Main {
    public static void main(String[] args) {
        Player p1 = new Player("P1");
        System.out.println(p1.getName());
        p1.addGuess('A');
        p1.addGuess('B');
        p1.decrementAvailableGuesses();
        System.out.println(p1.getGuesses());
        System.out.println(p1.getAvailableGuesses());
        System.out.println(p1.hasGuesses());
    }
}
