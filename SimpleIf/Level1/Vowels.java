public class Vowels {
    public static String checkVowel(char ch){
        ch = Character.toLowerCase(ch);
        if("aeiou".indexOf(ch) != -1){
      //if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            
      
      return "Vowel";
    
    }


else{   
     return "consonant";
    }
 }

    public static void main(String[] args) {
         char ch = 'b';
         System.out.println(checkVowel(ch));
    } 
}
    