public class Constructor02 {
	public static void main(String[] args) {  
		
		System.out.println("****切积 林家废****");
		Student stObj1=new Student();  
		
		stObj1.insertRecord(20221004, "全辨鉴");		
		stObj1.printInfo();
		
		Student stObj2 = new Student( 20221005, "全辨悼");	
		stObj2.printInfo();
	}	
}