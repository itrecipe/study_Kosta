public class Example03 {
	public static void main(String[] args) {

		int a[] = new int[2];
		try {
			System.out.println("�߸��� ��ҿ� ���� : " + a[3]);
		} catch (Exception e) {
			System.out.println("���� �߻� ArrayIndexOutOfBoundException" + e);
		} finally {
			System.out.println("finally�� �׻� ����˴ϴ�.");
		}
	}
}