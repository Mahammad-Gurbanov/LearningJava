package az.edu.ada.learningJava.week12;

public class Person {
    private final String name;

    public Person(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public synchronized void bow(Person friend){
        System.out.printf(
                "%s is bowing to the friend: %s\n",
                name, friend.getName()
        );

        friend.bow(this);
    }
}
