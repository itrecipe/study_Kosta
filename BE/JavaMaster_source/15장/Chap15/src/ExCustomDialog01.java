import javax.swing.JDialog;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class ExCustomDialog extends JDialog {
	private JPanel panel1, panel2;
	private JLabel label;
	private JButton okBtn;
	private JButton cancelBtn;

	public ExCustomDialog(JFrame frame, String str) {
		super(frame, str, true);
		panel1 = new JPanel();
		panel1.setLayout(new BorderLayout());
		add(panel1);

		label = new JLabel("Ŀ���� ��ȭ����!", JLabel.CENTER);
		panel1.add(label, BorderLayout.CENTER);
		panel2 = new JPanel();
		panel1.add(panel2, BorderLayout.SOUTH);

		okBtn = new JButton("�ݱ�");

		okBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose(); // ���̾�α� ����
			}
		});
		panel2.add(okBtn);

		cancelBtn = new JButton("���");
		okBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose(); // ���̾�α� ����
			}
		});
		panel2.add(cancelBtn);
		setSize(200, 150);
	}
}