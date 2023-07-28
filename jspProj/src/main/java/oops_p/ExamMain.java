package oops_p;

import java.util.Arrays;

public class ExamMain {
	public static void main(String[] args) {
		String[] names = { "현빈", "원빈", "투빈", "장희빈", "미스터빈" };
		String[] kor = "75,55,95,65,85".split(",");
		String[] eng = "25,54,75,65,82".split(",");
		String[] mat = "75,94,64,87,25".split(",");

		Exam[] arr = new Exam[names.length];
		;

	
		for (int i = 0; i < arr.length; i++) {			
			arr[i] = new Exam(names[i], kor[i], eng[i], mat[i]);
		}for (int i = 0; i < arr.length; i++) {
			arr[i].rankCalc(arr);
			System.out.println(arr[i]);
		}
		
	
	
		// 이미 arr에 calc()가 있고 avg가 있기때문에
		// you라는 매체배열 대신 arr을 넣어주면 알아서 avg는 있으니까
		// 메소드만 대입해주면 된다.
		// 그런데 메소드에 매개변수를 넣어줘야함 조건이있음 배열을 넣야되는데
		// 

		// 배열[인덱스].메소드(매개변수)

		// arr[0].name = names[0];
		// 배열에 배열을담아라
	}
}
