package Level2;
//Check if one of two given numbers is a multiple of the other. 
public class Multiplecheck {
     public static String chekMultiple(int a , int b){
        if(a % b == 0 ) return "a is multiple of b";
        else if(b % a == 0) return " b is Multiple of a";
        else return  " not multiple ";

     }
      public static void main(String[] args) {
        int a =  5 , b= 10;
        System.out.println(chekMultiple(a, b));
      }
    
}
