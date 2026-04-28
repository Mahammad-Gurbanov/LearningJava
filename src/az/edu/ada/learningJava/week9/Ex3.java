package az.edu.ada.learningJava.week9;

import java.util.*;

public class Ex3 {
    public static void main(String[] args) {
        HashMap<String, Integer> nameAgeHash = new HashMap<>();
        TreeMap<String, Integer> nameAgeTree = new TreeMap<>();
        LinkedHashMap<String, Integer> nameAgeLinked = new LinkedHashMap<>();

        Map[] maps = {nameAgeHash, nameAgeTree, nameAgeLinked};
        for (Map<String, Integer> map: maps){
            map.put("M", 19);
            map.put("A", 19);
            map.put("K", 14);
            map.put("L", 28);
            map.put("B", 12);
            map.put("C", 10);
        }



        System.out.println("Print key-value pairs with an enhanced for loop");
        for (int i = 0; i < maps.length; i++){
            if (i == 0){
                System.out.println("Print HashMap");
                for (HashMap.Entry<String, Integer> entry: nameAgeHash.entrySet()){
                    System.out.println(entry.getKey() + " -> " + entry.getValue());
                }
            }

            else if (i == 1){
                System.out.println("Print TreeMap");
                for (HashMap.Entry<String, Integer> entry: nameAgeTree.entrySet()){
                    System.out.println(entry.getKey() + " -> " + entry.getValue());
                }
            }

            else {
                System.out.println("Print LinkedMap");
                for (HashMap.Entry<String, Integer> entry: nameAgeLinked.entrySet()){
                    System.out.println(entry.getKey() + " -> " + entry.getValue());
                }
            }
        }

        System.out.println("Print pairs with an iterator");
        Iterator it = nameAgeHash.keySet().iterator();
        String currentKey;
        while (it.hasNext()){
            currentKey = (String) it.next();
            System.out.println(currentKey + " -> " + nameAgeHash.get(currentKey));
        }

       // Sort entries by values
       LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<>();
       ArrayList<Map.Entry<String, Integer>> sortedVal =
               new ArrayList<>(nameAgeLinked.entrySet());

       Comparator<Map.Entry<String, Integer>> sortValues =
               (Map.Entry<String, Integer> entry1,
                                Map.Entry<String, Integer> entry2) -> {
           return Integer.compare(entry2.getValue(), entry1.getValue());
       };
       sortedVal.sort(sortValues);
       for (Map.Entry<String, Integer> entry: sortedVal){
           sortedMap.put(entry.getKey(), entry.getValue());
       }
        System.out.println(sortedMap);
    }
}
