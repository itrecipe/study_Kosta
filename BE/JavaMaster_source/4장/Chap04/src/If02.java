import java.util.Scanner;

public class If02 {
   public static void main(String[] args) {
      System.out.println("���ڸ� �Է��ϼ���.");

      Scanner s = new Scanner(System.in);
      int num = s.nextInt();

      if ( num % 2 == 0 ) { 
          System.out.println(num + "�� ¦���Դϴ�."); 
      }
      else {
         System.out.println(num + "�� Ȧ���Դϴ�.");
      }

      System.out.println("�� ������ if�� �ܺο� �ֽ��ϴ�.");  
   }
}