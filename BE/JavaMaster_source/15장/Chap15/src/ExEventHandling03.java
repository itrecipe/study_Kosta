import java.awt.event.*;
import javax.swing.*;

public class ExEventHandling03 extends JFrame implements ActionListener {

	public ExEventHandling03() {
		setTitle("�̺�Ʈ ó��");
		setSize(400, 200);

		JPanel panel = new JPanel();
		add(panel);

		JButton button = new JButton("��ư�� ��������");
		panel.add(button);

		button.addActionListener(this);

		setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		JButton button = (JButton) e.getSource();
		button.setText("��ư�� ���Ƚ��ϴ�.");
	}

	public static void main(String[] args) {
		new ExEventHandling03();
	}
}