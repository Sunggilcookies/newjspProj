package ser_p;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import control.BoardService;
import model_p.BoardDAO;

public class BList implements BoardService{ //인터페이스 상속받음

	public void execute(HttpServletRequest request, HttpServletResponse response) {
		request.setAttribute("mainTitle", "게시판 목록");
		System.out.println("BList.execute 실행");
		
		/*
		 * ArrayList<BoardDTO> mainData= new BoardDAO().list(); //얘를 받아야함
		 * System.out.println(mainData);
		 */
		request.setAttribute("mainData",new BoardDAO().list());
	}
}
