public class Example02 {
    static void myMethod1() {
        System.out.println("���� �޼��� ȣ��");
    }

    public void myMethod2() {
        System.out.println("�ν��Ͻ� �޼��� ȣ��");
    }

    public static void main(String[] args) {
        myMethod1();  
        // myMethod2(); 

        Example02 myObj = new Example02();  
        myObj.myMethod();  
    }
}