public class Add {      

    Add() {
        System.out.println("�⺻ ������ Add()ȣ��");
    }

    Add(int a, int b) {
        System.out.println("�Ϲ� ������ Add(int a, int b)ȣ��");
        System.out.println(a+ " + " + b +" = "+ (a+b));
    }

    Add(double a, double b) {
        System.out.println("�Ϲ� ������ Add(double a, double b)ȣ��");
        System.out.println(a+ " + " + b +" = "+ (a+b));
    }

    Add(int a, double b) {
        System.out.println("�Ϲ� ������ Add(int a, double b)ȣ��");
        System.out.println(a+ " + " + b +" = "+ (a+b));
    }
}