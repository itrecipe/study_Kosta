import javax.swing.*;

public class ExMenu01 extends JFrame {

	public ExMenu01() {
		setTitle("�޴� �����");
		setSize(400, 200);

		JMenuBar menuBar = new JMenuBar(); // �޴��� ����

		JMenu menu01 = new JMenu("File"); // �ָ޴� File ����
		JMenu menu02 = new JMenu("Edit"); // �ָ޴� Edit ����
		JMenu menu03 = new JMenu("Help"); // �ָ޴� Help ����

		menuBar.add(menu01); // �޴��ٿ� �ָ޴� File �߰�
		menuBar.add(menu02); // �޴��ٿ� �ָ޴� Edit �߰�
		menuBar.add(menu03); // �޴��ٿ� �ָ޴� Help �߰�

		JMenuItem item01 = new JMenuItem("New"); // �޴� �׸� New ����
		JMenuItem item02 = new JMenuItem("Open"); // �޴� �׸� Open ����
		menu01.add(item01); // �ָ޴��� �޴� �׸� New �߰�
		menu01.add(item02); // �ָ޴��� �޴� �׸� Open �߰�

		setJMenuBar(menuBar); // �����ӿ� �޴��� �߰�

		setLayout(null);
		setVisible(true);
	}

	public static void main(String args[]) {
		new ExMenu01();
	}
}