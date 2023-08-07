package ser_p;



import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import control.BoardService;

public class BDeleteForm implements BoardService{ //인터페이스 상속받음

	public void execute(HttpServletRequest request, HttpServletResponse response) {
		request.setAttribute("mainTitle", "게시판 삭제");
		System.out.println("BList.execute 실행");
	}
}
