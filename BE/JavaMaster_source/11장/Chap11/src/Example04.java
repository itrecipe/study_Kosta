public class Example04 {
	static void check() throws ArithmeticException {
		System.out.println("���� �޼���");
		int div = 5 / 0;
	}

	public static void main(String[] args) {
		try {
			check();
		} catch (ArithmeticException e) {
			System.out.println("���� �߻� " + e);
		}
	}
}