//package com.mt.arel.mayis_9;


import java.util.*;

public class PalindromTespit{

	public static boolean palindromTespitEt(String cumle){
		boolean palindromdur = true;
		int i = 0;		
		while(palindromdur && i < cumle.length() / 2){
			if(cumle.charAt(i) != cumle.charAt(cumle.length() - i -1)){
				palindromdur = false;
			}
			i++;
		}
		return palindromdur;
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Palindrom olup olmadığı tespit edilecek cumleyi giriniz:");		
		String tespitCumlesi = sc.nextLine();
		boolean sonuc = palindromTespitEt(tespitCumlesi);
		System.out.println("Palindrom mu:" + sonuc);

	}




}
