package oops_p;

import java.util.Arrays;

public class Exam {
	public String name, grade;
	int [] jum;		//점수
	public int tot, avg, rank;
	public Exam(String name, String ... jum) {
		super();
		this.name = name;
		this.jum = new int [jum.length];
		
		for ( int i=0; i<jum.length; i++) {
			this.jum[i] = Integer.parseInt(jum[i]);
		}
		calc();
		
	}
	
	void calc() { //void return 값이 없을때
		tot=0;
		for (int i : jum) {
			tot += i;
		}
		avg = tot/jum.length;
		grade = "가가가가가가양미우수수".charAt(avg/10)+"";
		// 몇 번째 문자열에서 인덱스 가져온다. 
		
		
	}
	
	void rankCalc(Exam [] exArr) { 
		rank =1;
		for(Exam you : exArr) { // exArr[you]이런 뜻임 
			if(avg< you.avg) {
				rank++;
			}
		}
	}

	@Override
	public String toString() {
		return "Exam [name=" + name + ", jum=" + Arrays.toString(jum) + ", tot=" + tot + ", avg=" + avg + ", grade="
				+ grade + ", rank=" + rank + "]";
	}

	
	
}
