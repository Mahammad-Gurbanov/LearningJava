package az.edu.ada.learningJava.week8;
import java.util.*;

public class Store {
    private int totalBread;

    public Store(int totalBread){
        this.totalBread = totalBread;
    }

    public int getTotalBread(){
        return totalBread;
    }

    public int countPeopleBuyingBread(int[] breadPerPerson){
        Queue<Integer> breadQueue = new ArrayDeque<>();
        for (int breadCount: breadPerPerson){
            breadQueue.add(breadCount);
        }
        int count = 0;
        while (true){
            Integer numBread = breadQueue.poll();
            if (numBread != null && totalBread - numBread > 0){
                totalBread -= numBread;
                count++;
            }
            else {
                break;
            }
        }
        return count;
    }
}
