public class Chain {

    Chain() {	
        this(10);  		
        System.out.println("�⺻ ������ Chain() ȣ��");
    }
		
    Chain(int x) {
        this(5, 6);  	
        System.out.println("�Ϲ� ������ Chain(int x) ȣ��");
        System.out.println("x�� �� : "+ x);
    }
	
    Chain(int x, int y) {
        System.out.println("�Ϲ� ������ Chain(int x, int y) ȣ��");
        System.out.println("x �� Y �� : "+ x +" "+ y);
    }
}