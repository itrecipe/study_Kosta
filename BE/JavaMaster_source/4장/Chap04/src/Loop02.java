import java.util.Scanner;

public class Loop02 {
   public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      int choice = 1;
      while (choice == 1) {  
          int a;

          System.out.println("���ڸ� �Է��ϼ���.");
          a = s.nextInt();

          if (a % 2 == 0) {
              System.out.println("¦���Դϴ�.");
          } else {
              System.out.println("Ȧ���Դϴ�.");
          }

          System.out.println("����ϰ� �ʹٸ� �� 1, �׸��ϰ� �ʹٸ� �ƴϿ� 0�� �Է��ϼ���.");

          choice = s.nextInt(); 
      }

      System.out.println("��� ���ڸ� Ȯ���߽��ϴ�.");
   }
}