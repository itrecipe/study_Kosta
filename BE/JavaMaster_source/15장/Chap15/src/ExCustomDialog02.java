import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class ExCustomDialog02 {

	private ExCustomDialog examDialog;

	ExCustomDialog02() {
		JFrame frame = new JFrame();
		frame.setTitle("Ŀ���Ҵ�ȭ���� JDialog");
		frame.setSize(400, 200);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(240, 240, 240));
		frame.add(panel);

		JButton obj1 = new JButton("�ҷ�����");
		JButton obj2 = new JButton("�����ϱ�");

		panel.add(obj1);
		panel.add(obj2);

		obj1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (examDialog == null) {
					examDialog = new ExCustomDialog(frame, "��ȭ����");
				}
				examDialog.setVisible(true);
				obj1.requestFocus();
			}
		});

		obj2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		new ExCustomDialog02();
	}
}