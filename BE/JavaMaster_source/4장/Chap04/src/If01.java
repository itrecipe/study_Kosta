import java.util.Scanner;

public class If01 {
   public static void main(String[] args) {
      System.out.println("����� ���̸� �Է��ϼ���.");

      Scanner s = new Scanner(System.in);
      int age = s.nextInt(); 

      if (age >= 18) {  
          System.out.println("����� ���̴� 18�� �̻��Դϴ�.");
          System.out.println("����� ��ǥ�� �ڰ��� �ֽ��ϴ�.");
      }

      System.out.println("�� ������ if�� �ܺο� �ֽ��ϴ�.");
   }
}