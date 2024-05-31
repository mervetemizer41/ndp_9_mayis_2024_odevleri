//package com.mt.arel.mayis_9;

import java.util.*;

public class CarpmaMetodu{

	public static int carp(int sayi1, int sayi2){
		return sayi1 * sayi2;
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Çarpım için 1. sayıyı giriniz:");	
		int sayi1 = sc.nextInt();
		System.out.println("Çarpım için 2. sayıyı giriniz:");
		int sayi2 = sc.nextInt();
		int sonuc = carp(sayi1,sayi2);
		System.out.println("Çarpım Sonucu:" + sonuc);

	}




}
