package oops_p;

class Par{
	int a = 10;
	int b= 20;
	
	void meth_1() {
		System.out.println("부모 meth_1()"+a+","+b);
	}
	void meth_2() {
		System.out.println("부모 meth_2()"+a+","+b);
	}
}
class Child1 extends Par{
	int a = 1000;	//하이딩 java가 아닌 언어는 new사용해서 새로 하이딩선언해줘야함
	//java는 사실 new 를 쓰지 않아도 부모 메서드와 자식 메서드의 이름이 겹치면 자동으로 하이딩이 됩니다만, new 를 써주세요 ㅎㅎ
	//부모의 것 지워버려~
	int c= 3000;
	
	void meth_1() {	//오버 라이딩
		System.out.println("자식1 meth_1():"+a+","+b+","+c); 
	}
	void meth_3() {
		System.out.println("자식1 meth_3()");
	}
}
class Child2 extends Par{ 
	
	int d= 1234;
	
	void meth_4() {
		System.out.println("자식2 meth_4()");
	}

}



public class DynamicMain {

	public static void main(String[] args) {
		Par pp =  new Par();	//같은 ㅍ패키지에서 클래스 가져올때 new사용
		Child1 cc1 = new Child1();
		Child2 cc2 = new Child2();

		System.out.println("pp : " + pp.a+","+pp.b+","+pp);
		/* System.out.println("pp : " + pp.a+","+pp.b+","+pp.c); */
		pp.meth_1();
		pp.meth_2();
		//pp.meth_3();
		//pp.meth_4();
		System.out.println("cc1 : " + cc1.a+","+cc1.b+","+cc1.c);
		/* System.out.println("pp : " + pp.a+","+pp.b+","+pp.c); */
		cc1.meth_1();
		cc1.meth_2(); 
		cc1.meth_3();
		//pp.meth_4();
		System.out.println("cc2 : " + cc2.a+","+cc2.b+","+cc2.d);
		/* System.out.println("pp : " + pp.a+","+pp.b+","+pp.c); */
		cc2.meth_1();
		cc2.meth_2();
		/* cc2.meth_3(); */
		cc2.meth_4();
		System.out.println("_____________________________________________");
		Par dpp = new Par();
		Par dpc = new Child1();
		//Child1 dcp = new Par(); 자식이 더 크지 그래서 안됌
		Child1 dcc = new Child1();
		
		System.out.println("dpp : " + dpp.a+","+dpp.b);
		//System.out.println("dpp : " + dpp.a+","+dpp.b+","+dpp.c);
		// 부모에서 자식요소 new로 받아와도 a안바뀌지만(하이딩) 메소드(오버라이딩)는 가능
		dpp.meth_1();
		dpp.meth_2();
	
		System.out.println("dpc : " + dpc.a+","+dpc.b);
		//System.out.println("dpp : " + dpp.a+","+dpp.b+","+dpp.c); 부모는자식변수 못씀
		dpc.meth_1();
		dpc.meth_2();
		
		dcc.a=1111;
		dcc.b=2222;
		dcc.c=3333;
		
		System.out.println("dcc : " + dcc.a+","+dcc.b);
		//System.out.println("dpp : " + dpp.a+","+dpp.b+","+dpp.c); 부모는자식변수 못씀
		dcc.meth_1();
		dcc.meth_2(); //b를 오버라이딩했지만 하이딩을 했기때문에 b가 자식의 것으로나옴
		dcc.meth_3(); 
		
		Par dpcc =dcc; //부모로 자식받기
		System.out.println("dpcc : " + dpcc.a+","+dpcc.b);
		//자식의 메서드에서는 자식의 a 부모의 메서드일때는 부ㅇ모의 a
		dpcc.meth_1();
		dpcc.meth_2(); //
		//dpcc.meth_3(); 
		
		Child1 dcpcc = (Child1)dpcc; //자식이였던걸 부모로받았다가 자식으로 형변환 가능
		System.out.println("dcpcc : " + dcpcc.a+","+dcpcc.b+","+dcpcc.c);
		//자식의 메서드에서는 자식의 a 부모의 메서드일때는 부ㅇ모의 a
		dcpcc.meth_1();
		dcpcc.meth_2(); //
		dcpcc.meth_3(); 
		
		//Child1 cpp = (Child1)pp; //부모는 자식으로 형변환 x
		
		//부모로 갈수록 형변환
		System.out.println(pp instanceof Par);
		System.out.println(pp instanceof Child1); //false
		System.out.println(cc1 instanceof Par);
		System.out.println(cc1 instanceof Child1);
		//System.out.println(cc1 instanceof Uncle); //상속관계에서만 instance of 가능
		
		//추상화: 부모의 상속된 메서드를 자식메서드에서 사용할수있게 해주는 작업 (오버라이딩)
	}

}
