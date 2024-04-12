import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class FileHandling03 {
	public static void main(String[] args) {
		File file = new File("member.txt");

		try {
			if (!file.exists())
				file.createNewFile();

			FileWriter fw = new FileWriter(file);
			Scanner input = new Scanner(System.in);

			boolean quit = false;
			while (!quit) {
				System.out.print("���̵� :  ");
				String userID = input.next();
				fw.write("���̵� : " + userID + "  ");

				System.out.print("�̸� : ");
				String userName = input.next();
				fw.write("�̸� : " + userName + "\n");

				System.out.println("��� ����?  Y  | N ");
				input = new Scanner(System.in);
				String str = input.nextLine();

				if (str.toUpperCase().equals("N"))
					quit = true;
			}
			fw.close();
			System.out.println("���� ���� ����");

		} catch (Exception e) {
			e.getMessage();
		}
	}
}