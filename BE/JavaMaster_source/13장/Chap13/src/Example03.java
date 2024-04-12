import java.util.Vector;

public class Example03 {
	public static void main(String[] args) {   
	    
		Vector<String> cats = new Vector<String>();
		
		cats.add("Æä¸£½Ã¾È");		
		cats.add(null);		
		System.out.println(cats);
	    
		cats.add(1, "¼¤");	       
		System.out.println(cats);
	    
		cats.set(2, "·¯½Ã¾Èºí·ç");	    
		System.out.println(cats);
		    
		cats.remove("Æä¸£½Ã¾È");	    
		System.out.println(cats);
		    
		cats.remove(1);	    
		System.out.println(cats);	
		
		 System.out.println(cats.size()); 	    
		 System.out.println(cats.get(0)); 	   	    
		 System.out.println(cats.contains("¼¤")); 
		 System.out.println(cats.indexOf("¼¤")); 
	  }
}
