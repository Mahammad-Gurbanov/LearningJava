package az.edu.ada.learningJava.week3.datetime;

public class Main {
    public static void main(String[] args) {
        CustomTime time1 = new CustomTime();
        CustomTime time2 = new CustomTime(12, 3, 4);
        CustomTime time3 = new CustomTime(17);
        CustomTime time4 = new CustomTime(18, 30);
        CustomTime time5 = new CustomTime(time4);
        CustomTime[] times = {time1, time2, time3, time4, time5};
        for (CustomTime time : times){
            System.out.printf("%d %d %d\n", time.getHour(), time.getMinute(),
                    time.getSecond());
        }
    }
}
