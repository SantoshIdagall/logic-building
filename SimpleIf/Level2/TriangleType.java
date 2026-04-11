package Level2;
   //If the sides form a valid triangle, determine whether it is equilateral, isosceles, or 
           //scalene. 
public class TriangleType {
      public static String isTypeTriangle(int a, int b, int c) {

      if (a == b &&  b== c) {
         return "Euilateral";
         
      }
      else if (a==b || b==c || a==c) {
         return "Isosceles";
          
      }
      else{
        return " Scalene";
        
      }
    }
     public static void main(String[] args) {

        int a = 3, b = 4, c = 5;
        System.out.println(isTypeTriangle(a, b, c));
     }
}
