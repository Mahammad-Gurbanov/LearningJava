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

    public void displayDate(){
        System.out.printf("%d/%d/%d", this.day, this.month, this.year);
    }

    /**
     * Find the approximate difference in days, between 2 CustomDate
     * objects.
     * Note that in both cases the number of days is calculated
     * approximately, with the formulae day + month * 30 + year * 365
     * @param otherDate other CustomDate object.
     * @return int value representing the difference in days, value can be
     * negative, zero or positive.
     */
    public int difference(CustomDate otherDate){

        int thisDateInDays = this.day + this.month * 30 + this.year * 365;
        int otherDateInDays = otherDate.getDay() + otherDate.getMonth() * 30 +
                otherDate.getYear() * 365;
        return thisDateInDays - otherDateInDays;
    }

    /**
     * Return 1 if the date1 is earlier than the dat2, if it's later than
     * date2 return -1, if they have the same date return 0
     * */
    public static int compare(CustomDate date1, CustomDate date2){
        if (date1.getYear() < date2.getYear()) return 1;
        else if (date1.getYear() > date2.getYear()) return -1;
        else if (date1.getMonth() < date2.getMonth()) return 1;
        else if (date1.getMonth() > date2.getMonth()) return -1;
        else if (date1.getDay() < date2.getDay()) return 1;
        else if (date1.getDay() > date2.getDay()) return -1;
        return 0;
    }
}
