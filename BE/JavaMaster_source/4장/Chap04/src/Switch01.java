import java.util.Scanner;

public class Switch01 {
   public static void main(String[] args) {
      System.out.println("������ �Է��ϼ���.");

      Scanner s = new Scanner(System.in);
      int num = s.nextInt();
         
      switch ( num / 10 ) {
         case 10: 
                    
         case 9:  
             System.out.println("A ����");
             break;
         case 8:
             System.out.println("B ����");
             break;
         case 7:
             System.out.println("C ����");
             break;
         case 6:
             System.out.println("D ����"); 
             break;
         default: 
             System.out.println("F����");
             break;
     }
   }
}