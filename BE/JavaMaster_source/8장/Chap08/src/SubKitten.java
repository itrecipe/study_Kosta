public class SubKitten extends SuperCat {
	
	String age = "2��";	
	
	void printInfo() {
        		System.out.println("�Ʊ� ������Դϴ�.");
	}
	
	void printDetail() {	
        		super.printInfo();		
        		System.out.println("ǰ���� " + super.breed + ", ���̴� " + super.age);
		
        		printInfo();		
        		System.out.println("ǰ���� " + breed + ", ���̴� " + age);		
		//System.out.println("�Ʊ� ����̴� " + this.breed + ", ���̴� " + this.age);
    	}
} 



