import java.util.Scanner;

public class If04 {
   public static void main(String[] args) {
      System.out.println("3���� ���ڸ� �Է��ϼ���.");

      Scanner s = new Scanner(System.in);
      int x = s.nextInt();
      int y = s.nextInt();
      int z = s.nextInt();    
      
      if (x > y) {
          if (x > z) {
              System.out.println(x +"�� ���� ū �����Դϴ�."); 
          } 
          else { 
              System.out.println(x +"�� ���� ū ������ �ƴմϴ�.");
          }      
      } 
      else { 
            System.out.println(x +"�� ���� ū ������ �ƴմϴ�.");
   
      }
  }
}