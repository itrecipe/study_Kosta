public class AccessModifier04 {
    public static void main(String[] args) { 		
		
        Dog obj = new Dog();
		
        obj.breed = "���޶�Ͼ�";		
        obj.color = "����";
		
        System.out.println("������ ǰ�� : " + obj.breed);
        System.out.println("������ ���� : " + obj.color);		
        obj.bowwow();	
    }
}