package model_p;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;

public class GalleryDTO {
	String title, pname ,pw, upfile ,content;
	
	
	@Override
	public String toString() {
		return "GalleryDTO [title=" + title + ", pname=" + pname + ", pw=" + pw + ", upfile=" + upfile + ", content="
				+ content + ", id=" + id + ", cnt=" + cnt + ", reg_date=" + reg_date + "]";
	}
	int id, cnt;
	Date reg_date;
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd (E) HH:mm");
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	
	public String getUpfile() {
		if(upfile==null ||
			upfile.trim().equals("") ||
			upfile.trim().equals("null")) {
			upfile="";
		}
		return upfile;		
				
	}
	public void setUpfile(String upfile) {
		this.upfile = upfile;
	}
	public String getContent() {
		return content;
	}
	public boolean isImg() {
		boolean res = Pattern.matches(".*[.](jpg|bmp|png|gif)",getUpfile().toLowerCase());
		return res;
	}
	
	
	public void setContent(String content) {
		this.content = content;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	public Date getReg_date() {
		return reg_date;
	}
	public String getReg_dateStr() {
		return sdf.format(reg_date);
	}
	
	public void setReg_date(Date reg_date) {
		this.reg_date = reg_date;
	}
	
	
}
