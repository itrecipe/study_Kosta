import java.awt.event.*;
import javax.swing.*;

public class ExEventHandling04 extends JFrame {

	public ExEventHandling04() {
		setTitle("�̺�Ʈ ó��");
		setSize(400, 200);

		JPanel panel = new JPanel();
		add(panel);

		JButton button = new JButton("��ư�� ��������");
		panel.add(button);

		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton button = (JButton) e.getSource();
				button.setText("��ư�� ���Ƚ��ϴ�.");
			}
		});

		setVisible(true);
	}

	public static void main(String[] args) {
		new ExEventHandling04();
	}
}