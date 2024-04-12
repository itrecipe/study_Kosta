import javax.swing.*; // swing 패키지 가져오기
import java.awt.*; // awt 패키지 가져오기

public class ExFrame01 {
	public static void main(String[] args) {
		JFrame frame = new JFrame(); // JFrame 생성
		frame.setTitle("프레임 생성1"); // 프레임 제목 설정
		frame.setSize(400, 200); // 프레임 크기 설정
		frame.setVisible(true); // 프레임 보이기 설정
	}
}