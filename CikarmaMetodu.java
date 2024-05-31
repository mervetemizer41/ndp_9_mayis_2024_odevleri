//package com.mt.arel.mayis_9;

import java.util.*;


public class CikarmaMetodu{

	public static int cikar(int sayi1, int sayi2){
		return sayi1 - sayi2;
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Eksilen sayıyı giriniz:");	
		int sayi1 = sc.nextInt();
		System.out.println("Çıkan sayıyı giriniz:");
		int sayi2 = sc.nextInt();
		int sonuc = cikar(sayi1,sayi2);
		System.out.println("Çıkarma İşlemi Sonucu:" + sonuc);

	}




}
