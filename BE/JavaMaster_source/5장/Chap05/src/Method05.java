public class Method05 {
   public static void calculate(int x, double y) {  
      System.out.println(2 * x * y);
   }

   public static void main(String[] args) {   
      int a = 4;   	// ������
      double pi = 3.14;
      System.out.println("���� �ѷ� ���ϴ� ���� : 2 x ������ x ������ " );
   
      System.out.print("2 x "+ a + " x " + pi +" = " );
      calculate(a, pi);         
   }
}