package basic_p;

public class test1 {
	public static void main(String[] args) {
		for(int i=1;i<20;i++) {
			int one = i% 10;
			if(one%3==0 && one !=0) {
				System.out.println("짝");
				
			}else {
				System.out.println(i+","+one);
			}
			
			
		}
	}
}
