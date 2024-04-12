import javax.swing.*;
import java.awt.*;

public class ExComponent01 {
	public static void main(String args[]) {
		JFrame frame = new JFrame();
		frame.setTitle("버튼 JButton");
		frame.setSize(400, 200);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(240, 240, 240));
		frame.add(panel);

		JButton obj1 = new JButton("고양이"); // ‘고양이’ 텍스트 버튼 생성
		JButton obj2 = new JButton(new ImageIcon("cat.png")); // 아이콘 버튼 생성
		JButton obj3 = new JButton("고양이", new ImageIcon("cat.png")); // ‘고양이’ 텍스트 및 아이콘 버튼 생성

		panel.add(obj1); // 패널에 obj1 버튼 추가
		panel.add(obj2); // 패널에 obj2 버튼 추가
		panel.add(obj3); // 패널에 obj3 버튼 추가

		frame.setVisible(true);
	}
}