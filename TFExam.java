import java.util.ArrayList;
import java.util.Scanner;

public class TFExam {
  public static void main(String [] args){
    String[]StudAnswer = new String[10];
    String[]StudName  = new String[10];
    String[]StudGrade = new String[10];
    int[]NumGrade = new int[10];

    GradeExam(StudAnswer, StudName, StudGrade, NumGrade);
  }
      
   static void GradeExam(String[] StudAnswer, String [] StudName, String[] StudGrade, int[] NumGrade){
      String perfect = "FFTFTFTTTFFFTFT";
      Scanner inputDevice = new Scanner(System.in);
      int count = 1;
      int Total = 0;
      int avg = 0;
      while (true) {
        String input = inputDevice.nextLine();
      if(input.equalsIgnoreCase("Exit") || count == 10){
        break;
      }
        String [] MyArray = input.split(" ");
        StudName[count] = MyArray[0];
        StudAnswer[count] = MyArray[1];
        count++;
    }

      for(int i = 0; i < count; i++){
        int score = 0;
          for(int j = 0; j < 15; j++){
            if(StudAnswer[i].charAt(j) == perfect.charAt(j))
              score++;
          }
        NumGrade[i] = score;
        Total += score;
      }
       avg = Total/count;
      for(int i = 0; i < count; i++){
        if(NumGrade[i] > avg)
        System.out.println(StudName[i] + " "  + "A");
        if(NumGrade[i] == avg)
        System.out.println(StudName[i] + " "  + "B");
        if(NumGrade[i] < avg)
        System.out.println(StudName[i] + " "  + "C");
      }    
  }    
  }