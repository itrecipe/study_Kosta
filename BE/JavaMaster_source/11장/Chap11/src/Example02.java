public class Example02 {
	public static void main(String[] args) {

		try {
			Integer in = new Integer("abc");
			in.intValue();
		} catch (ArithmeticException e) {
			System.out.println("���� �߻� ArithmeticException " + e);
		} catch (NumberFormatException e) {
			System.out.println("���� �߻� NumberFormatException " + e);
		}
		System.out.println("try~catch���� �ܺ� �����Դϴ�.");
	}
}