package control;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/board/*")
public class BoardController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BoardController() {
        super();
        // TODO Auto-generated constructor stub
    }

	//GET 요청은 URL에 데이터를 포함시켜 서버로 보냅니다. 예를 들어, =value1&param2=value2와 같이 요청 URL에 데이터가 포함됩니다.
    //데이터가 URL에 노출 보안에 취약비밀번호와 같은 것은 안전하지 않습니다. hidden 사용
    // 데이터 조회 등과 같이 서버에 데이터를 변경하지 않는 작업에 사용됩니다.
    //request랑 reponse는 그냥 HttpSErvle의 객체의 변수이름일뿐임
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		//System.out.println(request.getRequestURI());
		//System.out.println(request.getContextPath()+"/board/");
		//처음 URL과 /board/를 제외한 url 값을 seviceStr 문자에 저장 ex) "BDetal"
		String serviceStr = request.getRequestURI().substring(
				(request.getContextPath()+"/board/").length()
				); 
		System.out.println(serviceStr);
		
		try {
			//요청과 응답하는 문자를 인코딩해줌 안깨지게
			request.setCharacterEncoding("UTF-8");
			//mainPage라는 변수로 seviceStr 값 포장
			request.setAttribute("mainPage", serviceStr); 
			//인터페이스에서 
			BoardService service = (BoardService)Class.forName("ser_p."+serviceStr).newInstance();
			service.execute(request,response);
			
			
			
			
			
			RequestDispatcher dispatcher = 
					request.getRequestDispatcher("/views/template.jsp");
			
			dispatcher.forward(request, response);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

