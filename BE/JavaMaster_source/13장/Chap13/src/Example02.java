import java.util.LinkedList;

public class Example02 {
	public static void main(String[] args) {   
	    
		LinkedList<String> cats = new LinkedList<String>();
		
		cats.add("���þȺ��");		
		cats.addFirst("�丣�þ�");
		cats.addLast("���׵�");
		System.out.println(cats);
	    
		cats.add(1, "��");	       
		System.out.println(cats);
	    
		cats.set(2, "�ڸ��ȼ�Ʈ���");	    
		System.out.println(cats);
		    
		cats.removeFirst(); 
		cats.removeLast(); 
		System.out.println(cats);
		cats.remove(1); 
		System.out.println(cats);
		
		 System.out.println(cats.size()); 	    
		 System.out.println(cats.get(0)); 	   	    
		 System.out.println(cats.contains("��")); 
		 System.out.println(cats.indexOf("��")); 
	  }
}
