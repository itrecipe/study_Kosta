import javax.swing.*;  
import java.awt.*;     

public class Frame extends JFrame{
	
	public Frame() {
		setTitle("������ ������"); //�������� ���� ����   
		setSize(400, 200);  //������ ũ�� ����  
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.PINK);	
		add(panel);

		setIconImage(new ImageIcon("cat.png").getImage());  		
		setVisible(true); //������ ���̱� ����               
	}	
	
	public static void main(String args[]) {  
		new Frame();
	} 
}
