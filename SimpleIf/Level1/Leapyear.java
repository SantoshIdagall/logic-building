 class Leapyear {
    
    public static boolean isLeap(int year){
        return(year % 4 == 0 && year % 100 != 0 )||( year % 400 == 0);

        }
        
    
     public static void main(String[] args) {
        int year = 2023;
          System.out.println(isLeap(year) ? "Leap Year" : "Not Leap Year");

}
 }
