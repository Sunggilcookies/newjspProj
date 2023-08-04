package ser_p;

import java.io.File;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.filters.SetCharacterEncodingFilter;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import control.BoardService;
import model_p.BoardDAO;
import model_p.BoardDTO;

public class BDeleteReg  {
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		
		
		String path = request.getRealPath("up");

		path = "C:\\green_project\\newjspProj\\mvcProj\\src\\main\\webapp\\up";

		
		BoardDTO dto = new BoardDTO();
		dto.setId( Integer.parseInt(request.getParameter("id")));
		
		dto.setPw( request.getParameter("pw"));
		
		String msg = "비밀번호가 일치하지 않습니다.";
		String goUrl = "BDeleteForm?id="+dto.getId();
		
		BoardDTO delDto = new BoardDAO().idPwChk(dto);
		
		if(delDto!=null) { //id,pw가 일치한다면
			
			if(!delDto.getUpfile().equals("")) { //파일이 존재한다면
				new File(path+"\\"+delDto.getUpfile()).delete();
			}
			new BoardDAO().delete(dto);
			msg = "삭제되었습니다.";
			goUrl = "BList";
		}
		
		
		
		request.setAttribute("mainPage", "alert");
		request.setAttribute("msg",msg);
		request.setAttribute("goUrl",goUrl);
			
		

	}
}
