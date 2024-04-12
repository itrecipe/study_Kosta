import javax.swing.*; 
import java.awt.*;

public class ExLayout02 {

	 public static void main(String args[]) {  
		JFrame frame = new JFrame(); 	  	 	
		frame.setTitle("���̾ƿ� BorderLayout");  
		frame.setSize(400, 200);   
		   
		JButton obj1 = new JButton("��ư1");  
		JButton obj2 = new JButton("��ư2"); 
		JButton obj3 = new JButton("��ư3"); 	
		JButton obj4 = new JButton("��ư4"); 	 		  
		JButton obj5 = new JButton("��ư5"); 	  
			
		JPanel panel = new JPanel();	 
		panel.setLayout(new BorderLayout());
		panel.add(obj1, BorderLayout.NORTH);          
		panel.add(obj2, BorderLayout.WEST);           
		panel.add(obj3, BorderLayout.CENTER);   
		panel.add(obj4, BorderLayout.EAST);  
		panel.add(obj5, BorderLayout.SOUTH); 	   	
		
		frame.add(panel); 		    
		frame.setVisible(true);  
	}
}
