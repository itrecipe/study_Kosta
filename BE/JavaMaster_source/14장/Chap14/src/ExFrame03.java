import javax.swing.*;
import java.awt.*;

public class ExFrame03 extends JFrame { // JFrame Ŭ���� ���

	public ExFrame03() {
		setTitle("������ ����3"); // ������ ���� ����
		setSize(400, 200); // ������ ũ�� ����
		setVisible(true); // ������ ���̱� ����

		JPanel panel = new JPanel(); // �г� ����
		panel.setBackground(Color.PINK); // �г� ���� ����
		add(panel); // �����ӿ� �г� �߰�
	}

	public static void main(String args[]) {
		new ExFrame03();
	}
}