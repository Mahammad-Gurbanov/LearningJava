package az.edu.ada.learningJava.week5;

public class Customer {
    private final int ID;
    private final String name;
    private final char gender;

    public Customer(int ID, String name, char gender){
        if (gender != 'm' && gender != 'f'){
            throw new IllegalArgumentException("Gender must be \"f\" or \"m\"");
        }
        this.ID = ID;
        this.name = name;
        this.gender = gender;
    }

    public int getID(){
        return this.ID;
    }

    public String getName(){
        return this.name;
    }

    public char getGender(){
        return this.gender;
    }

}
