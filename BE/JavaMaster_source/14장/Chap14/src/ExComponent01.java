import javax.swing.*;
import java.awt.*;

public class ExComponent01 {
	public static void main(String args[]) {
		JFrame frame = new JFrame();
		frame.setTitle("��ư JButton");
		frame.setSize(400, 200);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(240, 240, 240));
		frame.add(panel);

		JButton obj1 = new JButton("�����"); // ������̡� �ؽ�Ʈ ��ư ����
		JButton obj2 = new JButton(new ImageIcon("cat.png")); // ������ ��ư ����
		JButton obj3 = new JButton("�����", new ImageIcon("cat.png")); // ������̡� �ؽ�Ʈ �� ������ ��ư ����

		panel.add(obj1); // �гο� obj1 ��ư �߰�
		panel.add(obj2); // �гο� obj2 ��ư �߰�
		panel.add(obj3); // �гο� obj3 ��ư �߰�

		frame.setVisible(true);
	}
}