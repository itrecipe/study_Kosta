public class Example05 {
    public static void main(String[] args) { 	
		
        Cat cat1 = new Cat("�丣�þ�");		
		
        Cat cat2 = new Cat("��");
	
        Cat cat3 = new Cat();
        cat3.breed = "���þȺ��";
		
        System.out.println("ù ��° ����� ǰ�� : " + cat1.breed);
        System.out.println("�� ��° ����� ǰ�� : " + cat2.breed);
        System.out.println("�� ��° ����� ǰ�� : " + cat3.breed);	
    }
}