package arr_p;

import java.util.Arrays;

public class ArrayMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		
		int [] arr1 = {11,22,33};
		
		System.out.println("a:"+a);
		System.out.println("arr1:"+arr1+"=>"+arr1.length);
		// arr1:[I@515f550a
		// [ : 배열 차원 
		// I : int
		// @ : 구분
		// 515f550a : hash 코드  16진수로 표현
		a= 23;
		//arr1 = {55,66,77};
		//최초배열변수 선언 때 new int[] 생략가능
		
		arr1 = new int [] { 55,66,77,88,99};
		System.out.println("a:"+a);
		System.out.println("arr1:"+arr1+"=>"+arr1.length);
		
		int [] arr2 = new int[4];
		System.out.println("arr2:"+arr2+"=>"+arr2.length);
		int [] arr3 = arr1; //shadow copy
		System.out.println("arr3:"+arr3+"=>"+arr3.length);
		
		int b = a;
		System.out.println("a"+a+"b"+b);
		a=77;
		arr1[1] = 6543;
		System.out.println("a"+a+"b"+b);
		System.out.println("arr1[1]:"+arr1[1]);
		System.out.println("arr3[1]:"+arr3[1]);
		//deep copy;
		int [] arr4 = new int[arr1.length];
		for(int i=0;i<arr1.length;i++) {
			arr4[i]=arr1[i];
		}
		int [] arr5 = arr1.clone(); //deepcopy
		
		
		arr1[1] = 1111;
		System.out.println("arr1[1]:"+arr1[1]);
		System.out.println("arr4[1]:"+arr4[1]);
		System.out.println("arr4[1]:"+arr5[1]);
		
		//점수 : 87,65,82,46,98,65,72,34,91,79,45,67
		//점수에 대응하는 수우미양가 등급 배열을 구현하세요
		int [] score =  {87,65,82,46,98,65,72,34,91,79,45,67};
		String [] z = new String[score.length];
		
		for(int i=0; i<score.length;i++) {
			if(100 >= score[i] &&  score[i] > 90) {
				z[i]="수";
			}else if(90 >= score[i] &&  score[i] > 80) {
				z[i]="우";
			}else if(80 >= score[i] &&  score[i] > 70) {
				z[i]="미";
			}else if(70 >= score[i] &&  score[i] > 60) {
				z[i]="양";
			}else if(60 >= score[i]) {
				z[i]="가";
			}
			
		}

		System.out.println(Arrays.toString(z));
		
		
		
		
		
		
	}
}
