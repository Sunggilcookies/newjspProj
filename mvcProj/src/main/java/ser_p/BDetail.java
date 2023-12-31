package ser_p;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import control.BoardService;
import model_p.BoardDAO;

public class BDetail implements BoardService{
	// 클라이언트에게 응답을 보내는 excute 추상 메서드의 정의를 작성합니다.
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		request.setAttribute("mainTitle","게시판 상세");
		System.out.println("BDetail.execute() 실행");
		
		int id=Integer.parseInt(request.getParameter("id")); // id받아서 숫자로변호나
		new BoardDAO().addCount(id);
		request.setAttribute("mainData", new BoardDAO().detail(id)); //id daodetail 메소드에다가 집어넣음 mainData로보냄
	}

}
