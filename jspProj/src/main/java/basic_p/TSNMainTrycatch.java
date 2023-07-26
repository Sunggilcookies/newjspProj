package basic_p;

public class TSNMainTrycatch {

	public static void main(String[] args) {

		System.out.println("3,6,9 게임 ");
		System.out.println("1 -> 20 ");

		for (int i = 1; i <= 20; i++) {
			int one = i % 10; // 0~9
			
			int bug = one % 3 ; // i의 일의자리수가 0369일때 bug 가 0이나와 
			
			
			// 십의자리 수도 0~9까지
			//bug 이 0일때 catch 구문으로 넘어감
			
			try {
				int result =i %bug;
				System.out.println(i);
				
			}catch(Exception e) {
				try{
					int result =i %one;
					System.out.println("짝");
				}
				catch(Exception e2) {
					System.out.println(i);
				}
			}
			
			

		}

	}

}
