import java.util.TreeSet;

public class Example05 {
	public static void main(String[] args) {

		TreeSet<String> cats = new TreeSet<String>();

		cats.add("�丣�þ�");
		cats.add("���þȺ��");
		System.out.println(cats);

		cats.add("��");
		System.out.println(cats);

		cats.remove("�丣�þ�");
		System.out.println(cats);

		System.out.println(cats.size());
		System.out.println(cats.contains("��"));
		System.out.println(cats.first());
		System.out.println(cats.last());

	}
}
