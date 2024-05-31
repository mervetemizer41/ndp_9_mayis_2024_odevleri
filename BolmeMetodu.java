//package com.mt.arel.mayis_9;




import java.util.Scanner;


public class BolmeMetodu{

	public static int bol(int sayi1, int sayi2){
		return (int) sayi1 / sayi2;
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Bölünecek sayıyı giriniz:");	
		int sayi1 = sc.nextInt();
		System.out.println("Bölen sayıyı giriniz:");
		int sayi2 = sc.nextInt();
		int sonuc = bol(sayi1,sayi2);
		System.out.println("Bölme İşlemi Sonucu:" + sonuc);

	}




}
