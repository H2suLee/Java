package chapter15_Generics;

// 복수 제너릭

public class ProductExample {
	public static void main(String[] args) {
		Product<Car, String> product = new Product<Car, String>();
		product.setM("스마트 자동차");
		product.setT(new Car());
		
		Car car = product.getT(); // 번지수 출력
		String carType = product.getM();
		System.out.println(car + "\t" + carType);
	}

}
