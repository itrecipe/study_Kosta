public class Example01 {
    public static void main(String[] args) {
		
        try {  
            int a = 0;
            int b = 5 / a;
        }  
      
        catch(ArithmeticException e) {  
            System.out.println("0���� �����ϴ�.");  
        }  
        System.out.println("try~catch���� �ܺ� �����Դϴ�.");  
    }  	
}