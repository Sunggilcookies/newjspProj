package ser_p;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.URLEncoder;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import control.BoardService;

public class FileDown implements BoardService {
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		String fName = request.getParameter("fname");
		String path = request.getRealPath("up");
		
		path = "C:\\green_project\\newjspProj\\mvcProj\\src\\main\\webapp\\up";
		
		try {
			FileInputStream fis = new FileInputStream(path+"\\"+fName);
			//??? 왜지 위에서 getparemter 이름 잘못되어있었음
			String encFName = URLEncoder.encode(fName,"utf-8");
			System.out.println(fName+"->"+encFName);
			response.setHeader("Content-Disposition", "attachment;filename="+encFName);
			
			ServletOutputStream sos = response.getOutputStream();
			
			byte [] buf = new byte[1024];
			int cnt =0;
			while(fis.available()>0) {	//읽을 내용이 남ㅇ아ㅣㅆ다면
				int len = fis.read(buf); 	//읽어서 -> buf에 넣음
											//len : 넣은 byte 길이
				sos.write(buf, 0 , len); 	//보낸다 : buf 내용이 0부터 len 만큼 보낸다.
				cnt ++;
				System.out.println(cnt + len);
			}

			sos.close();
			fis.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
