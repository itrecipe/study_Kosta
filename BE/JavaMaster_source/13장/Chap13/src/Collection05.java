import java.util.TreeSet;

public class Collection05 {
	public static void main(String[] args) {

		TreeSet<String> str = new TreeSet<String>();

		str.add("A");
		str.add("B");
		str.add("C");

		System.out.println(str);

		System.out.print("TreeSet ��� : ");

		for (String elements : str) {
			System.out.print(elements + " ");
		}

		String[] array = new String[str.size()];
		str.toArray(array);
		
		System.out.println();
		System.out.print("Array ��� : ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

	}
}
