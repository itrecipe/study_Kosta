import javax.swing.*;  
import java.awt.*;
import java.util.Vector;     

public class ExComponent06 {

	 public static void main(String args[]) {  
		JFrame frame = new JFrame(); 
		frame.setTitle("레이블 JLabel");
		frame.setSize(400, 200);
		    
		    
		JPanel panel = new JPanel();
		panel.setBackground(new Color(240,240,240));				 
		frame.add(panel);
		
		JLabel  obj1 = new JLabel ("고양이"); 			    
		JLabel  obj2 = new JLabel (new ImageIcon("cat.png"));  		    
		JLabel  obj3 = new JLabel ("고양이", new ImageIcon("cat.png"), JLabel.RIGHT);
		    
		panel.add(obj1);             
		panel.add(obj2);             
		panel.add(obj3);    
		    		   
		frame.setVisible(true);  
	}
}
