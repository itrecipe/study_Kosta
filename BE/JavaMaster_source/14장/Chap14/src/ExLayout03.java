import javax.swing.*;
import java.awt.*;

public class ExLayout01 {
	public static void main(String args[]) {
		JFrame frame = new JFrame();
		frame.setTitle("���̾ƿ� FlowLayout");
		frame.setSize(400, 200);

		JButton obj1 = new JButton("��ư1");  
		JButton obj2 = new JButton("��ư2"); 
		JButton obj3 = new JButton("��ư3"); 	
		JButton obj4 = new JButton("��ư4"); 	 		  
		JButton obj5 = new JButton("��ư5"); 
			
		JPanel panel = new JPanel();	 
		panel.setLayout(new GridLayout(3, 2)); 		    

		panel.add(obj1);
		panel.add(obj2);
		panel.add(obj3);
		panel.add(obj4);
		panel.add(obj5);

		frame.add(panel);
		frame.setVisible(true);
	}
}