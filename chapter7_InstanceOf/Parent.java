package chapter7_InstanceOf;

// 강제 타입 변환은 자식 타입이 부모 타입으로 변환되어 있는 상태에서만 가능, 
// 처음부터 부모 타입으로 생성된 객체는 자식 타입으로 변환할 수 없다
// Parent parent = new Parent();
// Child child = (Child) parent; // 불가능

// 부모 변수가 참조하는 객체가 부모 객체인지 자식 객체인지 확인하기 위해서 instanceof 연산자 사용
// boolean result = 좌항(객체) instanceof 우항(타입)

public class Parent {

}
