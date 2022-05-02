package chapter15_Generics;

public class Box1<T> {
	// 클래스가 제너릭 클래스가 되면 필드 및 게터 세터가 아래와 같이 변함
	
	// 필드
		//private Object object;
		private T t;

		public T getT() {
			return t;
		}

		public void setT(T t) {
			this.t = t;
		}
		
		// 메소드
		/*public Object getObject() {
			return object;
		}
		*/
		

		/*public void setObject(Object object) {
			this.object = object;
		}
		*/
		


}
