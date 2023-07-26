package baisc_p;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class First
 */
@WebServlet("/basic/First")
public class First extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public First() {
  
    	super();
   	 	System.out.println("First 생성자 실행");
       
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 System.out.println(" doGet 실행");
		
		response.getWriter()
		.append("Served at: ")
		.append(request.getContextPath())
		.append("First임")
		;
	}
	
	@Override
	public void init() throws ServletException { //인스턴스 진입할떄만 (서버 로드될떄) 인스턴스 올라갈떄
		// TODO Auto-generated method stub
		super.init();
		 System.out.println(" init 생성자 실행");
	}
	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		super.destroy();
		 System.out.println(" destroy 실행");
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
