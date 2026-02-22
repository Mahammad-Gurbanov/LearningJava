package az.edu.ada.learningJava.week3.datetime;

public class CustomTime {
    private int hour;
    private int minute;
    private int second;

    private void validateTime(int hour, int minute, int second){
        if (0 > hour || hour > 24){
            throw new IllegalArgumentException("Hours should be between 0 and" +
                    " 24");
        }

        if (minute < 0 || minute > 60){
            throw new IllegalArgumentException("Minutes should be between 0 " +
                    "and 60");
        }

        if (second < 0 || second > 60){
            throw new IllegalArgumentException("Seconds should be between 0 " +
                    "and 60");
        }
    }

    public CustomTime(int hour, int minute, int second){
        validateTime(hour, minute, second);
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public CustomTime(){
        this.hour = 0;
        this.minute = 0;
        this.second = 0;
    }

    public CustomTime(int hour){
        validateTime(hour, 0, 0);
        this.hour = hour;
        this.minute = 0;
        this.second = 0;
    }

    public CustomTime(int hour, int minute){
        validateTime(hour, minute, 0);
        this.hour = hour;
        this.minute = minute;
        this.second = 0;
    }

    public CustomTime(CustomTime otherTime){
        this.hour = otherTime.getHour();
        this.minute = otherTime.getMinute();
        this.second = otherTime.getSecond();
    }

    public int getHour(){
        return this.hour;
    }

    public int getMinute(){
        return this.minute;
    }

    public int getSecond(){
        return this.second;
    }

    public String toUniversalString(){
        String universalString = String.format("%02d:%02d:%02d",
                this.hour, this.minute, this.second);
        return universalString;
    }

    public String toStandardString(){
        String standardString;
        String period;
        int hour;
        if (this.hour < 12) {
            period = "AM";
            hour = this.hour;
        }
        else if (this.hour == 12){
            period = "PM";
            hour = this.hour;
        }
        else {
            period = "PM";
            hour = this.hour - 12;
        }
        standardString = String.format("%d:%02d:%02d %s",
                hour, this.minute, this.second, period);
        return standardString;
    }

}
