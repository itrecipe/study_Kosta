public class Object01 {
	public static void main(String[] args) {  
		
		Student stObj1 = new Student();
		
		stObj1.id = 20221004;
		stObj1.name = "È«±æ¼ø";			
		stObj1.printInfo();		
		
		Student stObj2 = new Student();
		stObj2.insertRecord(20021005, "È«±æµ¿");
		stObj2.printInfo();
	}
}