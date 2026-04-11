 class Checkulds {

    public static String ischeck(char ch  ){
        // if (Character.isUpperCase(ch)) {
        if ( ch >= 'A' && ch <= 'Z') {
          return "upercase";    
        }
          //else if (Character.isLowerCase(ch)) {
        else if (ch >= 'a'&& ch <= 'z')  {
            return "lowercase";
        }
        //else if (Character.isDigit(ch)) {
        else if (ch>='0'  && ch <= '9')  {
            return " digit ";

        }
        else{
            return"specialchar";
        }
    }
       public static void main(String[] args) {
        char ch = 'S';
        int digit = 12;

        System.out.println(ischeck(ch));
       }
    
    
}
