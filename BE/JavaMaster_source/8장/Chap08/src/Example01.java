public class Example01 {
    public static void main(String[] args) {  	
        BabyCat catObj = new BabyCat();	
		
        System.out.println("ǰ�� : " + catObj.breed);
        System.out.println("���� : " + catObj.color);
	   
        catObj.eat(); 
        catObj.meow();
    }
}