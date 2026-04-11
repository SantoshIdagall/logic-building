class printpnz{
   // Take a number and print whether it’s positive, negative, or zero.
    
   public static String checkNumber(int n){

        if( n > 0 ){
        return "positive";
        }
         else if( n < 0 ){
        return "negative";
        }
        else{
        return  "zero";
        }
    }
        public static void main(String[] args){
        int n = 10;
        System.out.println(checkNumber(n));
    }
}
