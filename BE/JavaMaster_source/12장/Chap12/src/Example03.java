import java.io.File;
import java.io.FileReader;

public class Example03 {
	public static void main(String[] args) {

		try {

			File file = new File("example03.txt");
			if (!file.exists())
				file.createNewFile();
			
			FileWriter myWriter = new FileWriter(file);
			
			myWriter.wrtie("Hello!!\n");
			myWriter.write("Java Programming");
			myWriter.close();
			
			System.out.println("\n���� ���� ����");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}