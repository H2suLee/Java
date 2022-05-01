package chapter5;

import java.util.Scanner;

public class ArrayPractice1 {
	public static void main(String[] args) {
		// 1. 배열의 크기가 5인 배열을 만든 후, 반복문과 Scanner를 통해 데이터 담기 
		
		int[] arr1 = new int[5];
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i <5; i++) {
			System.out.println("정수를 입력하세요.");
			arr1[i]=sc.nextInt();
			System.out.println("arr[" + i + "] = " + arr1[i]);
			
		}
		System.out.println("=========================");
		
		// 2. 점수를 입력받아 총점과 평균 구하기
		int sum = 0;
		for(int i = 0; i <5; i++) {
			System.out.println((i+1)+"번째 점수를 입력하세요.");
			arr1[i]=sc.nextInt();
			sum += arr1[i];
		}
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + (double) (sum / arr1.length));
		System.out.println("=========================");
		
		// 3. 1부터 100까지 값을 차례대로 입력하고, 1부터 100까지 합(5050)을 구하기 
		sum = 0;
		int[] arr2 = new int[100];
		for(int i = 0; i <100; i++) {
			arr2[i] = i+1;
			sum += arr2[i];
		}
		System.out.println("1부터 100까지의 합: " + sum);
		System.out.println(arr2[99]);
		
		// 4. 1부터 10까지의 데이터를 입력하고 마지막 칸에 1부터 10까지 합친 값 넣기
		sum = 0;
		int[] arr3 = new int[10];
		for(int i = 0; i<arr3.length; i++) {
			arr3[i] = i+1;
			sum += arr3[i];
			System.out.println("arr[" + i + "] = " + arr3[i]);
			if(i==9) {
				
				arr3[i] = sum; 
			}
		}
		System.out.println(arr3[9]);
	}
}
