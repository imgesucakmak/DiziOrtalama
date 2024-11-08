package dizi_ortalama;

import java.util.Scanner;

public class DiziOrtalama {
	
	public static void mean(int[]arr) {
		int total=0;
		
		for(int i=0;i<arr.length;i++) {
			total+=arr[i];
		} 
	
        System.out.println("Ortalama= " + (double)total/arr.length); }
	
	public static void main(String[]args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int[]arr2=new int[5];
			
			System.out.println("Degerleri Girin:");
			
			for(int i=0;i<arr2.length;i++) {
				arr2[i]=scanner.nextInt();
			}
			
			mean(arr2);
		}
	}
	
	}   

		
	


