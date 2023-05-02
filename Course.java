package application;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.jdbc.AbandonedConnectionCleanupThread;

import javafx.event.ActionEvent;

public class Course {
	private String cat;
	private int nbPages;
	private int nbQuizes;
	private Page[] pages;
	
	// start the course with the page the user is in
	public Course(String cat) {
		if(cat == "calculus") nbPages = 20;
		if(cat == "trigonometry") nbPages = 20;
		if(cat == "grammar") nbPages = 20;
		if(cat == "writing") nbPages = 20;
		if(cat == "intoToProgramming") nbPages = 20;
		if(cat == "oop") nbPages = 20;
		this.cat = cat;
	}
	// called when next button in course is pressed
	public void updatePage(int pageNb, ActionEvent event) throws SQLException, IOException
	{	
		if(pageNb>=20) 
		{
			// initializing static variable cat
			CourseController.cat = cat;
			Util.openPage(this, event, "quiz.fxml");
		}
		else {
			int courseId = 0;
			System.out.println("cat: "+ cat);
			if(this.cat == "calculus") courseId = 1;
			if(this.cat == "trigonometry") courseId = 2;
			if(this.cat == "grammar") courseId = 3;
			if(this.cat == "writing") courseId = 4;
			if(this.cat == "introToProgramming") courseId = 5;
			if(cat == "oop") courseId = 6;
		
			System.out.println("pageId:"+pageNb+"courseId:"+courseId);
			String queryString = "SELECT * FROM course_pages WHERE pageId = " + pageNb + " and courseId = " + courseId;
	//		Connection conn = DbManager.DbInit();
			String url = "jdbc:mysql://localhost:3306/moderned";
	        String username = "root";
	        String password = "";
	        Connection conn = DriverManager.getConnection(url, username, password);
			PreparedStatement stmt = conn.prepareStatement(queryString);
			ResultSet result =stmt.executeQuery();
			
			if (result.next()) {
	    		int pageNumber = result.getInt(1);
	    		String pageDesc = result.getString(3);
	    		String imgURL = result.getString(4);
	    		String title = result.getString(2);
	    		
	    		Page page = new Page(pageDesc, imgURL, pageNumber, cat, title);
	    		
	    		CourseController courseController = new CourseController(page, event);
	        }
			else {
				System.out.println("cant load page");
			}
		}
	}
}
