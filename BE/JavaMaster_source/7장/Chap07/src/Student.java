public class Student{      

    int id;
    String name;  	
	
    Student(){
        System.out.println("�⺻ ������ Student() ȣ��");		
    }
		

    Student(int pram1, String pram2) {
        System.out.println("�Ϲ� ������ Student(...) ȣ��");
        id = pram1;
        name = pram2;			
    }
	 
    void insertRecord(int parm1, String parm2) {  
        id = parm1;  
        name = parm2;  		
    }  
	 
    void printInfo() {
        System.out.println("���̵�: "+id);
        System.out.println("�̸�: "+name);		
    }  
}