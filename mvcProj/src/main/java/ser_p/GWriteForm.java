package ser_p;



import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import control.BoardService;

public class GWriteForm implements BoardService{ //인터페이스 상속받음

	public void execute(HttpServletRequest request, HttpServletResponse response) {
		request.setAttribute("mainTitle", "갤러리 작성"
				+ "");
		System.out.println("GList.execute 실행");
	}
}
