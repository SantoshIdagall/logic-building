package Level2;
//Take marks (0–100) and print the corresponding grade (A/B/C/D/F). 
public class Grade {
    
    public static String getGrade(int marks){
   if(marks> 100 || marks <0) return "Inavalid";
  else if(marks >= 90 ) return "A";
    else if(marks >=70) return "B";
     else if ((marks >=- 60)) return "C";
    else if(marks >=40) return "D";

    else return "F";
        
    }
    public static void main(String[] args) {
          System.out.println(getGrade(89));
    }

    }
    

