class MyException extends Exception {
	String str1;

	MyException(String str2) {
		str1 = str2;
	}

	public String toString() {
		return ("MyException �߻�: " + str1);
	}
}

public class Example06 {
	public static void main(String[] args) {
		try {
			System.out.println("try ����Դϴ�.");
			throw new MyException("MyException Ŭ���� ȣ��˴ϴ�.");
		} catch (MyException e) {
			System.out.println("catch ����Դϴ�.");
			System.out.println(e);
		}
	}
}