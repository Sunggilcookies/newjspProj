package ser_p;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import control.BoardService;
import model_p.BoardDAO;

public class BReplyForm implements BoardService{
	
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		request.setAttribute("mainTitle","게시판 답변");
		System.out.println("BReplyForm 실행");
		
		int id=Integer.parseInt(request.getParameter("id")); // id받아서 숫자로변호나
		request.setAttribute("mainData", new BoardDAO().detail(id)); //id daodetail 메소드에다가 집어넣음 mainData로보냄
	}

}
