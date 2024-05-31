//package com.mt.arel.mayis_9;

import java.util.*;

public class DizidekiEnKucukBulma{

	public static int enKucukBul(int dizi[]){
		int enKucuk = Integer.MAX_VALUE;		
		for(int eleman : dizi){
			if(eleman < enKucuk){
				enKucuk = eleman;			
			}
		}
		return enKucuk;
	}

	public static void main(String[] args){
		System.out.println("En küçük elemanı bulunacak dizi kaç elemanlı?");		
		Scanner sc = new Scanner(System.in);		
		int elemanSayisi = sc.nextInt();
		int[] tamsayiDizi = new int[elemanSayisi];
		for(int i = 0; i < elemanSayisi; i++){
			tamsayiDizi[i] = sc.nextInt();
		}
		int enKucukEleman = enKucukBul(tamsayiDizi);
		System.out.println("Dizinin en küçük elemanı:" + enKucukEleman);

	}




}
