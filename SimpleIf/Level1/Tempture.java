public class Tempture {

    public static  String checktemp(int temp){

        if (temp<10 )
            return"cold";
        else if( temp < 30) return "warm";
        else return "hot";

    }
    public  static void main(String [] args){
        int temp =22;

        System.out.println(checktemp(temp));
    }
    
}
