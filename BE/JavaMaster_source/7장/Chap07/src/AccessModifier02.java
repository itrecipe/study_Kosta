public class AccessModifier02  {
    public static void main(String[] args) {  	
		
        Dog obj = new Dog();
		
        obj.breed = "���޶�Ͼ�";		
        obj.color = "����";
		
        System.out.println("������ ǰ�� : " + obj.breed);
        System.out.println("������ ���� : " + obj.color);		
        obj.bowwow() ;
        obj.age = 10;
        System.out.println("������ ���� : " + obj.age);	
        obj.run() ;		
    }
}