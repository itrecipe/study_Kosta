import java.util.Collections;
import java.util.LinkedList;

public class Collection02 {
	public static void main(String[] args) {

		LinkedList<Integer> num = new LinkedList<Integer>();

		for (int i = 10; i >= 1; i--)
			num.add(i);

		System.out.println(num);

		System.out.print("���� �� : ");
		for (int i = 0; i < num.size(); i++)
			System.out.print(num.get(i) + " ");

		Collections.sort(num);

		System.out.println();
		System.out.print("���� ��  : ");
		for (int i = 0; i < num.size(); i++)
			System.out.print(num.get(i) + " ");

	}
}
