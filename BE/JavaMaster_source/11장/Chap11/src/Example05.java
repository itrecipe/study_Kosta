public class Example05 {
	static void check() {
		System.out.println("���� �޼���");
		throw new ArithmeticException("5/0");
	}

	public static void main(String[] args) {
		try {
			check();
		} catch (ArithmeticException e) {
			System.out.println("���� �߻� " + e);
		}
	}
}