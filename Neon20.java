import java.util.Scanner;
public class Neon20 {
   public static void main(String[] args)  {
   int score;
   Scanner dion = new Scanner(System.in);
   System.out.println("Enter student score >>");
   score = dion.nextInt();
   if(score>=80){
    System.out.println("Level 7(Distinction)");
   }
   else if(score>=70){
    System.out.println("Level 6(Meritous achievement)");
   }
   else if(score>=60){
    System.out.println("Level 5(Substantial achievement)");
   }
   else if(score>=50){
    System.out.println("level 4(Moderate achievement)");
   }
   else if(score>=40){
    System.out.println("Level 3(Adequate achievement)");
   }
   else if(score>=30){
    System.out.println("level 2(Elementary achievement)");
   }
   else{
    System.out.println("Level 1(Not achieved*Fail*)");
   }
   dion.close();
   }
}
