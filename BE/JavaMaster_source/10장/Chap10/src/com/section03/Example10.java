package com.section03;
import java.util.Calendar;

public class Example10 {
	public static void main(String args[]) {

		Calendar calendar = Calendar.getInstance();
		System.out.print("���� ��¥ : ");
		System.out.print(calendar.get(Calendar.YEAR) + "�� ");
		System.out.print((calendar.get(Calendar.MONTH) + 1) + "�� ");
		System.out.print(calendar.get(Calendar.DATE) + "��");
	}
}