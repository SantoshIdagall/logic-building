package Level2;
 
public class VotingEligibity {
     // Check voting eligibility for a given age (18+). 
    public static String checkVote(int age) {
    return (age >= 18) ? "Eligible" : "Not Eligible";
}

  //Take two numbers and determine whether both are even, both are odd, or one is 
//even and one is odd. 
public static String checkEvenOdd(int a, int b) {
    if (a % 2 == 0 && b % 2 == 0) return "Both Even";
    else if (a % 2 != 0 && b % 2 != 0) return "Both Odd";
    else return "one is even and one is odd";
}

public static void main(String[] args) {
    int age = 21;
    
     int a = 10 , b= 20;
    System.out.println(checkVote(age));
    System.out.println(checkEvenOdd(a, b));
}
}
