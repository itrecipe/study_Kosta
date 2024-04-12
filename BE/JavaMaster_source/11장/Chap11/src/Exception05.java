class InvalidException extends Exception {
	public InvalidException(String s) {
		super(s);
	}
}

public class Exception05 {
	void check(int weight) throws InvalidException {
		if (weight < 100) {
			throw new InvalidException("InvalidException Ŭ���� ȣ���Դϴ�.");
		}
	}

	public static void main(String args[]) {
		Exception05 obj = new Exception05();
		try {
			obj.check(60);
		} catch (InvalidException ex) {
			System.out.println("���� ó���Դϴ�");
			System.out.println(ex.getMessage());
		}
	}
}