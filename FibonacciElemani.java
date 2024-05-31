//package com.mt.arel.mayis_9;

import java.util.*;


public class FibonacciElemani{

	public static int fibonacciElemaniBul(int n){
		
		int ninciEleman = -1;
		if(n == 0){
			ninciEleman = 0;
		}else if(n == 1){
			ninciEleman = 1;
		}else{
			ninciEleman = fibonacciElemaniBul(n-2) + fibonacciElemaniBul(n-1);
		}

		return ninciEleman;
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Fibonacci dizisinin kaçıncı elemanını bulmak istiyorsunuz:");		
		int sira = sc.nextInt();
		int sonuc = fibonacciElemaniBul(sira);
		System.out.println("Fibonacci dizisinin "+ sira +". elemanı:" + sonuc);

	}




}
