public class AccessModifier01  {
    public static void main(String[] args) {  		
		
        Dog dogObj = new Dog();
		
        dogObj.breed = "���޶�Ͼ�";		
        dogObj.color = "����";
		
        System.out.println("������ ǰ�� : " + dogObj.breed);
        System.out.println("������ ���� : " + dogObj.color);
		
        dogObj.bowwow() ;			
    }
}