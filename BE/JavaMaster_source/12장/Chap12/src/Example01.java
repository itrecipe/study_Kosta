import java.io.File;
import java.io.IOException;

public class Example01 {
	public static void main(String[] args) {
		File fileObj = new File("example01.txt");
		try {
			boolean success = fileObj.createNewFile();

			if (success) {
				System.out.println("���� ���� ����");
			} else {
				System.out.println("���� ���� ����");
			}
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}