public class SecondsOfTheYear {

    public static void main(String[] args) {   
        // In below an incomplete version of the program. Please complete it!
        
        int daysInYear = 365;
        int hoursInDay = 24;
        int minutesInHour = 60;
        int secondsInMinute = 60;
        int secondsInYear = daysInYear * hoursInDay;
        int seconds = (int) ((double)secondsInYear * minutesInHour * secondsInMinute);
        System.out.println("There are " + seconds + " seconds in a year");
    }

}
