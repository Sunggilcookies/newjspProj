package basic_p;

public class TSNMain {

	public static void main(String[] args) {
		
		/*
		 * System.out.println("3,6,9 게임 "); System.out.println("1 -> 20 ");
		 * 
		 * for (int i =1; i <=20; i++) { int one = i % 10; if(one%3==0 && one!=0) {
		 * System.out.println("짝"); }else { System.out.println(i+" , "+one); }
		 * 
		 * }
		 */
/*		
		System.out.println("1 ->  100 >>>>>>>>>>>> ");
		for (int i = 1; i <=100; i++) {
			int one = i % 10;
			int ten = i/10;
			
			String ttt = "";
			if(ten%3==0 && ten!=0) {
				ttt += "짝";
			}
			if(one%3==0 && one!=0) {
				ttt += "짝";
			}
			if(ttt.equals("")) {
				ttt += i;
			}
			System.out.println(ttt);
		}*/
		
		int no = 1245;
		System.out.println("1 ->  "+no+" >>>>>>>>>>>> ");
		for (int i = 1; i <=no; i++) {
			
			String ttt = "";
			
			int buf = i;
			
			while(true) {
				int one = buf % 10;
				buf /= 10;		//i의 자릿수만큼 while문 반복
				if(one%3==0 && one!=0) {	//1의자리 369확인후 10의자리 369확인... 
					ttt += "짝";
				}
				
				if(buf == 0) {
					break;
				}	
			}
			
			if(ttt.equals("")) {
				ttt += i;
			}
			System.out.println(ttt);
		}
		
			/*1. 자릿수만큼 나눠주기 
i= 1000
test=i
a=0;
	while(a){
	
	test / 10
	a += 1 //a = i의 자릿수
		if(i==1){	//i가 1이 될때까지  나눠준다.
			return a;
		}
	}
	for

JAVA_HOME*/
	}

}
