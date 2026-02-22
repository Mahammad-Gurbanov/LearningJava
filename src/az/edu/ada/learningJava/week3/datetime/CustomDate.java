package az.edu.ada.learningJava.week3.datetime;

public class CustomDate {
    private int day;
    private int month;
    private int year;
    private int[] monthsWith31Days = {1, 3, 5, 7, 8, 10, 12};

    private boolean has31Days(int month_local) {
        for (int m : monthsWith31Days){
            if (month_local == m) return true;
        }
        return false;
    }

    private boolean isLeapYear(int year){
        if (year % 4 == 0 && year % 100 == 0){
            return year % 400 == 0;
        }
        return year % 4 == 0;
    }

    private void validateDate(int day, int month, int year){
        if (year < 0){
            throw new IllegalArgumentException("Year should be positive");
        }

        if (month < 0 || month > 12) {
            throw new IllegalArgumentException("Month value should be between" +
                    " 1 and 12.");
        }
        int maxDays;
        if (month == 2) {
            maxDays = isLeapYear(year) ? 29: 28;
        } else if (has31Days(month)) {
            maxDays = 31;
        }
        else maxDays = 30;

        if (day < 0 || day > maxDays){
            throw new IllegalArgumentException("The day: " + day +" is invalid");
        }
    }

    public CustomDate(int day, int month, int year) {
        validateDate(day, month, year);
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getYear(){
        return this.year;
    }

    public int getMonth(){
        return this.month;
    }

    public int getDay(){
        return  this.day;
    }

    public void setYear(int newYear){
        validateDate(this.day, this.month, newYear);
        this.year = newYear;
    }

    public void setMonth(int newMonth){
        validateDate(this.day, newMonth, this.year);
        this.month = newMonth;
    }

    public void setDay(int newDay){
        validateDate(newDay, this.month, this.year);
        this.day = newDay;
    }
}
