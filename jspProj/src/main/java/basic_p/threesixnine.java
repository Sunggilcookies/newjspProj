package basic_p;

public class threesixnine {
	public static void main(String[] args) {

		/*
		 * //첫번쨰 과제(1부터 20까지) public static void main(String[] args) { int input = 20;
		 * //값 입력 for(int i=1;i<input;i++) { int one = i % 10; // one은 i의 1의자리수 ex) i =
		 * 0~9
		 * 
		 * if(one%3==0 && one != 0) { // i가 3,6,9,0 and 0이 아니여야함 i=3,6,9
		 * System.out.println("짝"); }else System.out.println(i); }
		 */
		// 두번째쨰 과제(1부터 99까지)

		int input = 99; // 값 입력
		for (int i = 1; i <= input; i++) {
			int one = i % 10; // one은 i의 1의자리수 ex) i = 0~9
			int ten = i / 10; // ten은 10의 자리수 0~9 ten = 1~9
			String pro = "";
			
				
				if (one % 3 == 0 && one != 0) {	 // i가 3,6,9,0 and 0이 아니여야함 i=3,6,9
					pro += "빡";					// 1의 자리수일때 369일때 출력 : "짝"
							
				}
				if (ten % 3 == 0 && ten != 0) {	 // 10의 자리수가 3,6,9,0 and 0이 아니여야함 ten=3,6,9
						pro += "빡";					// 10의 자리수일때 369일때 출력 : "짝"
					
				}				
				//1과 10가 369일때 빡을 한다.
				if(pro=="") {					//pro에 빡이 안들어갔을때에 i값 넣어준다.
					pro+=i;
				}
				System.out.println(pro);	
			
			

		}
		// 세번째 과제 자리수 상관없이 (for문 자리값/10 변수로)
		
		int input3=2938;
		
		// ten자리수 0~1 
		
		
		

		
	
}}