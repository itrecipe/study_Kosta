public class Inheritance01 extends Calculation {
    public void multiplication(int x, int y) {
        z = x * y;
        System.out.println("�� ���� ���� : " + z);
    }
	
    public static void main(String args[]) {
        int a = 20, b = 10;
        Inheritance01 obj = new Inheritance01();
        obj.addition(a, b);
        obj.subtraction(a, b);
        obj.multiplication(a, b);
   }
}