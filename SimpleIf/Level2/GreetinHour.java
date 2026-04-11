package Level2;
 //Take the hour of the day (0–23) and print “Good Morning”, “Good Afternoon”, “Good 
//Evening”, or “Good Night”.
public class GreetinHour  {
    public static String  wish(int hour){

    if( hour < 0 || hour > 23) return "Invalid hour";
 else if (hour >= 5 && hour <= 12)  return "Good Morning";
 else if (hour >= 12 && hour <= 17)  return "Good Afternoon";
 else if (hour >= 17 && hour <= 23)  return "Good Evening";
 else return "Good Night";
    }
 //Take a day number (1–7) and print the corresponding day name.
     public static String getDayName(int day) {
    if (day == 1) return "Sunday";
    else if (day == 2) return "Monday";
    else if (day == 3) return "Tuesday";
    else if (day == 4) return "Wednesday";
    else if (day == 5) return "Thursday";
    else if (day == 6) return "Friday";
    else if (day == 7) return "Saturday";
    else return "Invalid";
}

    public static void main(String[] args) {
        int hour = 12;
        System.out.println(wish(hour));
          int   day = 7;
          System.out.println(getDayName(day));

    }
    
}
