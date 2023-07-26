package basic_p;

public class CalcMain {
	public static void main(String[] args) {
		int aa =5;
		aa++;
		System.out.println(aa);
		
		++aa;
		System.out.println(aa);
		System.out.println(aa++); //출력이후에 값이 더해짐 후위 연산자
		System.out.println(++aa);
		
		int a=5, b=6, c=10,d;
		d= a++ + ++c +(- b--) * --a + a++;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		/*	5+11-(6*5)+5 =  
			순서앞에부터 연산자처리해주고 산술연산자는 괄호부터 곱하기라든지
			
			a = 6
			b = 5
			c = 11
			d = -9
		*/
		
		
		
		
		
		
	}
}
