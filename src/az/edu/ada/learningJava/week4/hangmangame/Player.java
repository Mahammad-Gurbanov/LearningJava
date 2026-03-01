package az.edu.ada.learningJava.week4.hangmangame;


public class Player {
    private String name;
    private int availableGuesses = 6;
    private char[] guesses = new char[30];
    private int guessCounter = 0;

    public Player(String name){
        this.name = name;

    }

    public String getName(){
        return this.name;
    }

    public void setName(String newName){
        this.name = newName;
    }

    public String getGuesses(){
        if (guessCounter == 0) return "No Guesses have been made";

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.guessCounter - 1; i++){
            sb.append(this.guesses[i]);
            sb.append(' ');
        }
        sb.append(this.guesses[this.guessCounter - 1]);
        return this.name + "'s guesses are: " + sb;
    }

    public int getAvailableGuesses(){
        return this.availableGuesses;
    }

    public void addGuess(char guess){
        this.guesses[this.guessCounter] = guess;
        guessCounter++;
    }

    public void decrementAvailableGuesses(){
        this.availableGuesses--;
    }

    public boolean hasGuesses(){
        return this.availableGuesses > 0;
    }
}
