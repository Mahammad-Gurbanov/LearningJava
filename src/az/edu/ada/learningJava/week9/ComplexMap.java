package az.edu.ada.learningJava.week9;

import java.util.*;

public class ComplexMap {
    public static void main(String[] args) {
        HashMap<String, List<String>> friendsMap = new HashMap<>();
        addFriend(friendsMap, "M", "O");
        addFriend(friendsMap, "M", "E");
        addFriend(friendsMap, "M", "S");
        addFriend(friendsMap, "O", "S");
        System.out.println(friendsMap);
        removeFriends(friendsMap, "O", "S");
        System.out.println(friendsMap);
    }

    public static void addFriend(Map<String, List<String>> map, String name1,
                                 String name2){
        if (map.containsKey(name1)){
            map.get(name1).add(name2);
        } else {
            map.put(name1, new ArrayList<String>(List.of(name2)));
        }

        if (map.containsKey(name2)){
            map.get(name2).add(name1);
        } else {
            map.put(name2, new ArrayList<String>(List.of(name1)));
        }
    }

    public static void removeFriends(Map<String, List<String>> map,
                                     String name1, String name2){
        if (map.containsKey(name1)){
            map.get(name1).remove(name2);
        }

        if (map.containsKey(name2)){
            map.get(name2).remove(name1);
        }
    }

}
