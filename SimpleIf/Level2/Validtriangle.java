package Level2;
 // Take three sides and check if they form a valid triangle
public class Validtriangle {
     
    public static boolean isValidTriangle(int a, int b, int c) {

        if(a + b > c && a + c > b && b + c > a){
          return true;
        }
         return false;
      }
      // one more type 
       public static boolean ValidTriangle(int a, int b, int c) {
        return (a + b > c && a + c > b && b + c > a);
    }

    public static void main(String[] args) {

        int a = 3, b = 4, c = 5;
        System.out.println(isValidTriangle(a, b, c));

         if (isValidTriangle(a, b, c)) {
            System.out.println("Valid Triangle");
        } else {
            System.out.println("Not a Triangle");
        }

       
    }
    
}
