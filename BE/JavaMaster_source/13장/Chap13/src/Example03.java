import java.util.Vector;

public class Example03 {
	public static void main(String[] args) {   
	    
		Vector<String> cats = new Vector<String>();
		
		cats.add("�丣�þ�");		
		cats.add(null);		
		System.out.println(cats);
	    
		cats.add(1, "��");	       
		System.out.println(cats);
	    
		cats.set(2, "���þȺ��");	    
		System.out.println(cats);
		    
		cats.remove("�丣�þ�");	    
		System.out.println(cats);
		    
		cats.remove(1);	    
		System.out.println(cats);	
		
		 System.out.println(cats.size()); 	    
		 System.out.println(cats.get(0)); 	   	    
		 System.out.println(cats.contains("��")); 
		 System.out.println(cats.indexOf("��")); 
	  }
}
