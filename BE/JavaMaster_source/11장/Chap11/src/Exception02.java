import java.util.Scanner;

public class Exception02 {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���.");
		int num = s.nextInt();

		int arr[] = new int[5];

		try {
			arr[num] = 10 / num;
			System.out.println(arr[num]);
		} catch (ArithmeticException e) {
			System.out.println("0�� �ƴ� ���� �Է��ϼ���.");
			System.out.println(e.getMessage());
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("�ùٸ� �迭 �ε����� �Է��ϼ���.");
			System.out.println(e.getMessage());
		}
	}
}