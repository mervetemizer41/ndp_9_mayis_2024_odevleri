//package com.mt.arel.mayis_9;

import java.util.*;

public class ToplamaMetodu{

	public static int topla(int sayi1, int sayi2){
		return sayi1 + sayi2;
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Toplama için 1. sayıyı giriniz:");
		int sayi1 = sc.nextInt();
		System.out.println("Toplama için 2. sayıyı giriniz:");
		int sayi2 = sc.nextInt();
		int sonuc = topla(sayi1,sayi2);
		System.out.println("Sonuç:" + sonuc);

	}




}
