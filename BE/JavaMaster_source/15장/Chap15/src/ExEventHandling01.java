import java.awt.event.*;
import javax.swing.*;

class MyListener implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		JButton button = (JButton) e.getSource();
		button.setText("��ư�� ���Ƚ��ϴ�.");
	}
}

class MyFrame extends JFrame {
	public MyFrame() {
		setTitle("�̺�Ʈ ó��");
		setSize(400, 200);

		JPanel panel = new JPanel();
		add(panel);

		JButton button = new JButton("��ư�� ��������");
		panel.add(button);

		button.addActionListener(new MyListener());

		setVisible(true);
	}
}

public class ExEventHandling01 {
	public static void main(String[] args) {
		new MyFrame();
	}
}