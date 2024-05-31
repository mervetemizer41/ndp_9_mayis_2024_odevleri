//package com.mt.arel.mayis_9;


public class DiziToplatma{

	public static int diziTopla(int dizi[]){
		int sonuc = 0;		
		for(int eleman : dizi){
			sonuc = sonuc + eleman;
		}
		return sonuc;
	}

	public static void main(String[] args){
		int[] tamsayiDizi = {1,3,5,7,9};
		int sonucToplam = diziTopla(tamsayiDizi);
		System.out.println("Dizi elemanları toplamı:" + sonucToplam);

	}




}
