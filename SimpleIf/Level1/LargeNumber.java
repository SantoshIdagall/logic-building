public class LargeNumber {

    public static int maxtwo(int  a , int b){
        return (a > b) ? a:b;

    }
    public static int maxthree(int a, int b, int c){
    if(a >= b && a >= c){
        return a;
    } else if(b >= a && b >= c){
        return b;
    } else {
        return c;
    }
}
    
    public static void main(String[] args) {
        int a = 3 ;
        int b = 5;
       int  c = 10;
        System.out.println(maxtwo(a, b));
         System.out.println(maxthree(a, b, c));

    }
}
