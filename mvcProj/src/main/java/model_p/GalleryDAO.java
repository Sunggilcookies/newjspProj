package model_p;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class GalleryDAO {

	Connection con;
	PreparedStatement ptmt;
	ResultSet rs;
	String sql;

	public GalleryDAO() {
		try {
			Context init = new InitialContext();
			DataSource ds = (DataSource) init.lookup("java:/comp/env/mvc322");
			con = ds.getConnection();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public ArrayList<GalleryDAO> list() {
		sql = "select * from gallery order by desc";
		ArrayList<GalleryDAO> res = new ArrayList<>();
		try {
			ptmt = con.prepareStatement(sql);

			rs = ptmt.executeQuery();

			while (rs.next()) {
				GalleryDTO dto = new GalleryDTO();
				dto.setId(rs.getInt("id"));
				dto.setCnt(rs.getInt("cnt"));
				dto.setPname(rs.getString("pname"));
				dto.setPw(rs.getString("pw"));
				dto.setTitle(rs.getString("title"));
				dto.setUpfile(rs.getString("upfile"));
				dto.setContent(rs.getString("content"));
				dto.setReg_date(rs.getTimestamp("reg_date"));
			
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close();
		}

		return res;
	}

	public void close() {
		if(rs!=null) try { rs.close();	} catch (Exception e) {}
		if(ptmt!=null) try { ptmt.close();	} catch (Exception e) {}
		if(con!=null) try { con.close();	} catch (Exception e) {}
	}

}
