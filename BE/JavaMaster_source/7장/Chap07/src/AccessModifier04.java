public class AccessModifier04 {
    public static void main(String[] args) { 		
		
        Dog obj = new Dog();
		
        obj.breed = "포메라니언";		
        obj.color = "갈색";
		
        System.out.println("강이지 품종 : " + obj.breed);
        System.out.println("강이지 색상 : " + obj.color);		
        obj.bowwow();	
    }
}