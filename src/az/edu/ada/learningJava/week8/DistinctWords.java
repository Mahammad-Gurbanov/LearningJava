package az.edu.ada.learningJava.week8;
import java.util.*;

public class DistinctWords {
    private String[] names;

    public DistinctWords(String[] names){
        this.names = names;
    }

    public String[] getNames(){
        return names;
    }

    public void removeDuplicates(){
        Set<String> withoutDuplicates = new TreeSet<>();
        String[] res = new String[names.length];
        int index = 0;
        for (String name : names){
            if (!withoutDuplicates.contains(name)){
                withoutDuplicates.add(name);
                res[index] = name;
                index++;
            }
        }
        names = res.clone();
    }
}
