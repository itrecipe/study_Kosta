import java.util.Scanner;

public class Array01 {
	public static void main(String[] args) {          
		String[] myArr;         // �迭 ����
		myArr = new String[3];  // �޸� �Ҵ�
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("3�� ���ڿ��� �Է��ϼ���.");
		
		for(int i = 0; i < 3; i++) {
			myArr[i] = s.nextLine();
		}
		
		for (int i = 0; i < 3; i++)
	         		System.out.print(myArr[i]+" "); 
	}
}