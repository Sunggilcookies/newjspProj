package oops_p;

abstract class AbsPar{ 	//추상클래스임을 알려저야해서 abstract 붙임 추상메서드기때문에
	int a=10 , b=20;
	void meth_1() { //선언 + 정의
		System.out.println("부모 meth_1()");
	}
	//abstract 추상화메소드가 생성되었을때 메소드를 명확하게해주지않으면 오류가난다. 강제성을줌
	//abstract클래스를 extends하여 abstract 메소드()를 구현(오버라이딩)해줘야한다.
	abstract void meth_2() ;//추상메서드 선언만하고 정의가 없음
	
	
	
}
class AbsChild extends AbsPar{
	int c=3000;
	void meth_3() {
		System.out.println("자식 meth_3()");		
	}
	void meth_1() { //하이딩
		System.out.println("자식 meth_3()");		
	}
	@Override //추상메서드 오버라이딩
	void meth_2() {
		System.out.println("자식 추상 meth_2()");		
		
	}
	
}


public class AbstractMain {

	public static void main(String[] args) {
		AbsChild cc = new AbsChild();
		cc.meth_1();
		cc.meth_2();
		cc.meth_3();
	}

}
