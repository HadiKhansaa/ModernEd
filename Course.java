package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Course {
	private String cat;
	private int nbPages;
	private int nbQuizes;
	private Page[] pages;
	
	// start the course with the page the user is in
	public Course(String cat) {
		if(cat == "math") {
			nbPages = 20;
			nbQuizes = 2;
		}else if (cat == "english") {
			nbPages = 20;
			nbQuizes = 2;
		}else if(cat == "programming"){
			nbPages = 20;
			nbQuizes = 2;
		}
		
	}
	// called when next button in course is pressed
	public void updatePage(int pageNb) throws SQLException
	{
		String tableName = cat + "_pages";
		
		String queryString = "SELECT * FROM " + tableName + " WHERE pageId = " + pageNb;
		Connection conn = DbManager.DbInit();
		PreparedStatement stmt = conn.prepareStatement(queryString);
		ResultSet result =stmt.executeQuery();
		
		if (result.next()) {
    		int pageNumber = result.getInt(1);
    		String pageDesc = result.getString(2);
    		String imgURL = result.getString(3);
    		
    		Page page = new Page(pageDesc, imgURL, pageNb, cat);
    		
    		
        }
	}
}
