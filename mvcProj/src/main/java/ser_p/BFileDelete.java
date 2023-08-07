package ser_p;

import java.io.File;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import control.BoardService;
import model_p.BoardDAO;
import model_p.BoardDTO;
import model_p.PageData;

public class BFileDelete implements BoardService{
	//파일 삭제 위한거랑 아이디비번 검사 및 파일정보 가져와야함
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		
		String path = request.getRealPath("up");
		path = "C:\\green_project\\newjspProj\\mvcProj\\src\\main\\webapp\\up";
		PageData pd = (PageData)request.getAttribute("pd");
		
		try {
			MultipartRequest mr = new MultipartRequest(
					request,
					path,
					10*1024*1024,
					"utf-8",
					new DefaultFileRenamePolicy()
				);
			
			BoardDTO dto = new BoardDTO();
			dto.setId( Integer.parseInt(mr.getParameter("id")));
			dto.setTitle( mr.getParameter("title"));
			dto.setPname( mr.getParameter("pname"));
			dto.setPw( mr.getParameter("pw"));
			dto.setContent( mr.getParameter("content"));
			dto.setUpfile( mr.getFilesystemName("upfile"));
			
			String msg = "비밀번호가 일치하지 않습니다.";
			String goUrl = "BModifyForm?id="+dto.getId()+"&page="+pd.page;
			
			System.out.println(dto);
			//아이디 검사
			BoardDTO delDto = new BoardDAO().idPwChk(dto);
			
			if(delDto!=null) { //id,pw가 일치한다면
			
				//파일삭제
				new File(path+"\\"+delDto.getUpfile()).delete();
				//db에서 파일삭제
				new BoardDAO().fileDelete(dto); //DB에서 삭제하면안됌
			
				msg = "파일이 삭제되었습니다.";
				
			}
			
					
			request.setAttribute("mainPage", "inc/alert");
			request.setAttribute("msg",msg);
			request.setAttribute("goUrl",goUrl);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
				
		
	}

}
