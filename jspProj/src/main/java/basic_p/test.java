package basic_p;

public class test {
	public static void main(String[] args) {

		int sum = 0;
		float arg = 0;
		int max = 0;
		int min = 0;

		int i = 0;
		int a = 0;
		for (String str : args) {
			// 합계 평균 최대 최소
				try {
					a = Integer.parseInt(str);
					if (a % 2 == 0) {
						i++;
						sum = sum + a;
						if (i==1) { //for문 맨처음 초기 max값에 a 넣어주기 
							max = a;
							min = a;	}
						if(a > max) { // a가 max보다크면
								max = a;} // max에 a 대입  
						if (a < min) { // a가 min보다 작으면
							min = a;} // min에 a 대입
						}
				} catch (Exception e) {
		}}
		arg = (float) sum / i;
		System.out.println("합계" + sum);
		if (i==0) {
			System.out.println("평균0");
		}else{
			System.out.println("평균" + arg);
		}		
		System.out.println("최댓" + max);
		System.out.println("최소" + min);
	}
}
