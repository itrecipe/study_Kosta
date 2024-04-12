import javax.swing.*;  
import java.awt.*;
import java.util.Vector;     

public class ExComponent08 {

	 public static void main(String args[]) {  
		JFrame frame = new JFrame(); 
		frame.setTitle("비밀번호필드 JPasswordField");
		frame.setSize(400, 200);
		    
		JPanel panel = new JPanel();
		panel.setBackground(new Color(240,240,240));				 
		frame.add(panel);		 
			 
		JPasswordField   obj1 = new JPasswordField(10); 			    
		JPasswordField   obj2 = new JPasswordField("고양이");  		    
		JPasswordField   obj3 = new JPasswordField("고양이", 10);  
		    
		panel.add(obj1);             
		panel.add(obj2);             
		panel.add(obj3);    
		   	   
		frame.setVisible(true);  
	}
}
