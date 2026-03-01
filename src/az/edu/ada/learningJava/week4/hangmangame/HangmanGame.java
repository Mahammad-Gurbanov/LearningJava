package az.edu.ada.learningJava.week4.hangmangame;

public class HangmanGame {
    private String secretWord;
    private char[] state;

    public HangmanGame(String secretWord){
        this.secretWord = secretWord;
        this.state = new char[secretWord.length()];
        for (int i = 0; i < secretWord.length(); i++){
            this.state[i] = '_';
        }
    }

    public String getSecretWord(){
        return this.secretWord;
    }

    public void setSecretWord(String newWord){
        this.secretWord = newWord;
    }

    public boolean inWord(char guess){
        return this.secretWord.indexOf(guess) != -1;
    }

    public void updateState(char guess){
        for (int i = 0; i < this.secretWord.length(); i++){
            if (this.secretWord.charAt(i) == guess)
                this.state[i] = guess;
        }
    }

    public void displayState(){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.state.length - 1; i++){
            sb.append(this.state[i]);
            sb.append(' ');
        }
        sb.append(this.state[this.state.length - 1]);
        System.out.println("Current State is");
        System.out.println(sb);
    }
}
