import java.awt.event.*;
import javax.swing.*;

public class ExEventHandling02 extends JFrame {

	public ExEventHandling02() {
		setTitle("�̺�Ʈ ó��");
		setSize(400, 200);

		JPanel panel = new JPanel();
		add(panel);

		JButton button = new JButton("��ư�� ��������");
		panel.add(button);

		button.addActionListener(new MyListener());

		setVisible(true);
	}

	private class MyListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JButton button = (JButton) e.getSource();
			button.setText("��ư�� ���Ƚ��ϴ�.");
		}
	}

	public static void main(String[] args) {
		new ExEventHandling02();
	}
}