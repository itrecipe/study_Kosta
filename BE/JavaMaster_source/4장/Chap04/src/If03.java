import java.util.Scanner;

public class If03 {
   public static void main(String[] args) {
      System.out.println("������ �Է��ϼ���.");

      Scanner s = new Scanner(System.in);
      int grade = s.nextInt();

      if (grade >= 90) {
         System.out.println("A ����");
      } 
      else if (grade >= 80) {
         System.out.println("B ����");
      } 
      else if (grade >= 70) {
         System.out.println("C ����");
      } 
      else if (grade >= 60) {
         System.out.println("D ����");    
      } 
      else {
         System.out.println("F ����");
      }
   }
}