import java.io.File;
import java.io.FileOutputStream;

public class Example02 {
	public static void main(String[] args) {

		String str = "Hello! Java Programming ";
		try {

			File file = new File("example02.txt");
			if (!file.exists())
				file.createNewFile();

			FileOutputStream fos = new FileOutputStream(file);

			byte[] b = str.getBytes();

			fos.write(b);
			fos.close();
			System.out.println("���� ���� ����");
		} catch (Exception e) {
			e.getMessage();
		}
	}
}