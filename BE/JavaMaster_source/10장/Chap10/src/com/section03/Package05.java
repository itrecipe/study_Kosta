package com.section03;
import java.util.Scanner;

public class Package05 {
	public static void main(String args[]) {

		String str = "";

		Scanner in = new Scanner(System.in);

		System.out.print("�Է� ���ڿ� :");
		str = in.nextLine();

		int len = str.length();

		String revStr1 = "";

		for (int i = len - 1; i >= 0; i--) {
			revStr1 = revStr1 + str.charAt(i);
		}

		System.out.println("String Ŭ������ ���� ���ڿ� : " + revStr1);

		StringBuffer revStr2 = new StringBuffer(str);
		revStr2.reverse();

		System.out.println("StringBuffer Ŭ������ ���� ���ڿ� : " + revStr2);
	}
}