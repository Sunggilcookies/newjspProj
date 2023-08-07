package model_p;

import javax.servlet.http.HttpServletRequest;

public class PageData {

	public int limit = 5;
	public int pageLimit =10;
	//int start = 0;
	public int page, start, pageStart, pageEnd, total, pageTotal;
	//페이지 번호 얻어내는 행위
	public PageData( HttpServletRequest request) {
		page = 1;
		
		if(request.getParameter("page")!=null) {
			page = Integer.parseInt(request.getParameter("page"));
		}
	}
	
	public void calc() {
		
		this.total = new BoardDAO().totalCnt();
		
		pageTotal = total/limit;
		
		if(total%limit>0) {
			pageTotal++;
		}

		start = (page-1)*limit;
		pageStart = (page-1)/pageLimit*pageLimit+1;
		pageEnd = pageStart + pageLimit -1;
		
		if(pageEnd > pageTotal) {
			pageEnd = pageTotal;
		}
		
		System.out.println(pageTotal+","+pageEnd);
	}
	
	
	
	
	
}
