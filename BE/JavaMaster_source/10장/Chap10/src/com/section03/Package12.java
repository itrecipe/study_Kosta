package com.section03;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Package12 {
	public static void main(String args[]) {
		Date date = new Date();
		SimpleDateFormat dateF = new SimpleDateFormat("dd/MM/yyyy");
		String fulldate = dateF.format(date);
		System.out.println("���� ��¥ : " + fulldate);

		SimpleDateFormat dateFormat = new SimpleDateFormat("dd");
		String day = dateFormat.format(date);
		System.out.println("�� : " + day);

		SimpleDateFormat dateFormat2 = new SimpleDateFormat("MMM");
		String month = dateFormat2.format(date);
		System.out.println("�� : " + month);

		SimpleDateFormat dateFormat3 = new SimpleDateFormat("YYYY");
		String year = dateFormat3.format(date);
		System.out.println("�� : " + year);
	}
}