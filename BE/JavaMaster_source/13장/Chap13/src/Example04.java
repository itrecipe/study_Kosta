import java.util.HashSet;
import java.util.Set;
import java.util.TreeMap;


public class Example04 {
	public static void main(String[] args) {   
	    
		HashSet<String> cats = new HashSet<String>();
		
		cats.add("�丣�þ�");
		cats.add("��");	
		System.out.println(cats);
	    
		cats.add("���þȺ��");	     	       
		System.out.println(cats);
			
		cats.remove("�丣�þ�");	    
		System.out.println(cats);
	
		System.out.println(cats.size()); 	  	   	    
		System.out.println(cats.contains("��")); 
	
	}
}
