import java.util.ArrayList;

public class Example01 {
	public static void main(String[] args) {
		ArrayList<String> cats = new ArrayList<String>();

		cats.add("�丣�þ�");
		cats.add("null");
		System.out.println(cats);

		cats.add(1, "��");
		System.out.println(cats);

		cats.set(2, "���þȺ��");
		System.out.println(cats);

		cats.remove("�丣�þ�");
		System.out.println(cats);

		cats.remove(1);
		System.out.println(cats);

		System.out.println(cats.size());
		System.out.println(cats.get(0));
		System.out.println(cats.contains("��"));
		System.out.println(cats.indexOf("��"));
	}
}