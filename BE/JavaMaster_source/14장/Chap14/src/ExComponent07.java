import javax.swing.*;  
import java.awt.*;
import java.util.Vector;     

public class ExComponent07 {

	 public static void main(String args[]) {  
		JFrame frame = new JFrame(); 
		frame.setTitle("텍스트영역 JTextArea");
		frame.setSize(400, 200); 				
			   	   
		JPanel panel = new JPanel();
		panel.setBackground(new Color(240,240,240));				 
		frame.add(panel);		 
			 
		
		JTextArea  obj1 = new JTextArea ("고양이"); 			    
		JTextArea  obj2 = new JTextArea (5, 10);  		    
		JTextArea  obj3 = new JTextArea ("고양이", 5, 10); 
				    
		panel.add(obj1);             
		panel.add(obj2);             
		panel.add(obj3);    
		   
		frame.setVisible(true);  
	}
}
