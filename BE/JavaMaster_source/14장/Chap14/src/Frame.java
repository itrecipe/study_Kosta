import javax.swing.*;  
import java.awt.*;     

public class Frame extends JFrame{
	
	public Frame() {
		setTitle("프레임 아이콘"); //프레임의 제목 설정   
		setSize(400, 200);  //프레임 크기 설정  
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.PINK);	
		add(panel);

		setIconImage(new ImageIcon("cat.png").getImage());  		
		setVisible(true); //프레임 보이기 설정               
	}	
	
	public static void main(String args[]) {  
		new Frame();
	} 
}
