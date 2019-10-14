package testsql;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

public class TestSql {

	public void test1(HttpServletRequest httpServletRequest,Statement statement)
	{   
		
		String name = httpServletRequest.getParameter("test");
		List<String> varList = new ArrayList<String>();
		varList.add(name);
		
		testFilter tf = new testFilter();
		 
		for(String var:varList)
		{
			var = tf.test(var);  // º¯Êý°×Ãûµ¥
			try {
				statement.executeQuery(var);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}
	
}
