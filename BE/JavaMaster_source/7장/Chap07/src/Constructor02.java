public class Constructor02 {
	public static void main(String[] args) {  
		
		System.out.println("****�л� �ּҷ�****");
		Student stObj1=new Student();  
		
		stObj1.insertRecord(20221004, "ȫ���");		
		stObj1.printInfo();
		
		Student stObj2 = new Student( 20221005, "ȫ�浿");	
		stObj2.printInfo();
	}	
}