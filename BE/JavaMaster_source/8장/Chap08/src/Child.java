public class Child extends Parent{
	String  name = "ȫ�浿";    
    
    	public void details() {    
    		super.details();
        		System.out.println(name);
    	}
    
	public void printDetails() {
    		details();
    		System.out.println("�θ� �̸� : " + super.name);
        		System.out.println("�ڽ� �̸� : " + name);
    	}
}
