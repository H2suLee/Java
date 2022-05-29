package p20220527_hw;

import java.util.Scanner;

public class Review {
	public static void main(String[] args) {
		int[] arr1 = { 10, 20, 30, 50, 3, 60, -3 };
		System.out.println("=========================== Q1");
		for (int i = 0; i < 7; i++) {
			if (arr1[i] == 60) {
				System.out.println(i);
			}
		}

		System.out.println("=========================== Q2");
		for (int i = 0; i < 7; i++) {
			if (i == 3) {
			} else
				System.out.println(arr1[i]);
		}
		System.out.println("=========================== Q3");
		Scanner sc = new Scanner(System.in);
		arr1[sc.nextInt()] = 1000;
		// 확인
		for (int i : arr1) {
			System.out.println(i);
		}

		System.out.println("=========================== Q4");
		int max = arr1[0];
		int min = arr1[0];
		// max
		for (int i = 0; i < arr1.length; i++) {
			if (max < arr1[i]) {
				max = arr1[i];
			}
		}
		System.out.println(max);
		// min
		for (int i = 0; i < arr1.length; i++) {
			if (min > arr1[i]) {
				min = arr1[i];
			}
		}
		System.out.println(min);
		
		System.out.println("=========================== Q5");
		int[] arr2 = new int[10];
		for(int i = 0; i < arr2.length; i++) {
			arr2[i] = sc.nextInt();
			if(arr2[i] % 3 == 0) {
				System.out.println(arr2[i]);
			}
		}


	}
}
