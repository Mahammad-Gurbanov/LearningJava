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
        if (name.compareTo(friend.getName()) <= 0){
            System.out.printf(
                    "%s is bowing to the friend: %s\n",
                    name, friend.getName()
            );

            System.out.printf(
                    "%s is bowing to the friend: %s\n",
                    friend.getName(), name
            );
        } else {
            friend.bow(this);
        }
    }
}
