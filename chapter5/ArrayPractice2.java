package chapter5;

import java.util.Scanner;

public class ArrayPractice2 {
	public static void main(String[] args) {
		// 배열의 크기를 입력받고 배열의 크기+1까지의 데이터 넣기. 그 중에 2의 배수 구하기
		
		Scanner sc = new Scanner(System.in);
		int[] arr1 = null;
		System.out.println("배열의 크기를 입력하시오");
		int num = sc.nextInt();
		arr1 = new int[num];
		
		for(int i=0; i<arr1.length; i++) {
			arr1[i] = i+1;
			System.out.println(arr1[i]);
		}
		
		System.out.println("이 중 2의 배수입니다.");
		for(int i=0; i<arr1.length; i++) {
			arr1[i] = i+1;
			if((i+1) % 2 == 0) {
				System.out.println(arr1[i]);
			}
		}
		
		// 홀수도 구하기
		System.out.println("이 중 홀수입니다.");
		for(int i=0; i<arr1.length; i++) {
			arr1[i] = i+1;
			if((i+1) % 2 == 1) {
				System.out.println(arr1[i]);
			}
		}
		
		System.out.println("=========================");
		
		// 크기가 100인 배열에 1~100개의 데이터를 넣고 3의 배수만 출력하기. 동시에 짝수는 짝수라고 표시하기.
		int[] arr3 = new int[100];
		for(int i = 0; i<arr3.length; i++) {
			arr3[i]= i+1;
			if(arr3[i]%3==0) {
				if(arr3[i]%2 ==0) {
					System.out.println(arr3[i] + "(짝)");
				}else {
					System.out.println(arr3[i]);
				}
			}
		}
		
	}
}
