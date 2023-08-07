package ser_p;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import control.GalleryService;
import model_p.GalleryDAO;

public class GList implements GalleryService{
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
		request.setAttribute("mainTitle", "갤러리 목록");
		//바꿔치기
		

		/*
		 * ArrayList<BoardDTO> mainData= new BoardDAO().list(); //얘를 받아야함
		 * System.out.println(mainData);
		 */
		request.setAttribute("mainData", new GalleryDAO().list());
		
		
		
	}
}
