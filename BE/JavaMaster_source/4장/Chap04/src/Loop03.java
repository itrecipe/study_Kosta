import java.util.Scanner;

public class Loop03 {
    public static void main(String[] args) {		
        Scanner s = new Scanner(System.in);	
        System.out.println("10���� ū ���ڸ� �Է��ϼ���.");
        int x  = s.nextInt();     
        int sum = 0;     
     
        do {
            sum += x;
            x--;

        } while (x >= 10);
        System.out.println("�հ� : " + sum);
    }
}