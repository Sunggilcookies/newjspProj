package oops_p;

import java.util.Arrays;

//순서
// int에 0할당 string 에 null  필드생성
// 그다음에 대입작업
/*static 메모리 할당

*
*/
class AAA {

	// 생성자
	public AAA() {
		System.out.println("AAA 기본생성자");
	}

	int setA() {
		System.out.println("setA() 실행");
		return b;
	}

	int setB() {
		System.out.println("setB() 실행");
		return 60;
	}

	static int setSA() {
		System.out.println("static setSA() 실행");
		return 5555;
	}

	// 필드
	int a = setA();
	int b = setB();
	static int sa = setSA();

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "AAA [a=" + a + "," + "b=" + b + "," + "sa=" + sa + "]";
	}

}

class BBB {

	void meth_1(int a) {
		System.out.println("meth_1 실행:" + a);
	}
	void meth_2(int a, int b) {
		System.out.println("meth_2 실행:" + a + b);
	}
	void meth_3(int[] a) {
		System.out.println("meth_3 실행:" + Arrays.toString(a));
	}
	void meth_4(int... a) {
		System.out.println("meth_4 실행:" + Arrays.toString(a));
	}
	void meth_33(int[] a, int b) {
		System.out.println("meth_33 실행:" + Arrays.toString(a)+","+b);
	}
	/*void meth_44(int ... a, int b) {
		System.out.println("meth_44 실행:" + Arrays.toString(a)+","+b);
	}*/
	/*
	 * void meth_444(int... a, int... b) { System.out.println("meth_444 실행:" +
	 * Arrays.toString(a)); }
	 */
	void meth_4444(int b, int... a) {
		System.out.println("meth_4444 실행:" + Arrays.toString(a)+", "+b);
	}
}

public class InstanceMain {

	public static void main(String[] args) {
		new AAA(); // AAA정의
		System.out.println("--------------");
		AAA a1;
		System.out.println("--------------");
		a1 = new AAA();
		System.out.println("--------------");
		AAA a2 = new AAA();
		System.out.println("---------------");
		System.out.println(a1);

		System.out.println("BBB---------------");
		BBB bb = new BBB();
		int [] arr = {11,22,33,44};
		bb.meth_1(10);
		//bb.meth_1(10,20);
		//bb.meth_1(arr);
		//bb.meth_1(10,20,30);
		//bb.meth_2(10);
		bb.meth_2(10,20);
		//bb.meth_2(arr);
		//bb.meth_2(10,20,30);
		//bb.meth_3(10);
		//bb.meth_3(10,20);
		bb.meth_3(arr);
		//bb.meth_3(10,20,30);
		//bb.meth_1(10);
		//bb.meth_2(10,20);
		//bb.meth_3(arr);
		bb.meth_4(arr);
		bb.meth_33(arr,30);
		bb.meth_4444(0, arr); //가변인수
		bb.meth_4444(10,20,30);
		bb.meth_4444(10);
		bb.meth_4444(10,20);
		/* bb.meth_4444(arr); */
		System.out.println("---------------");
		
		
		
	}
}
