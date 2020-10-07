

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Servlet")
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	
		int day =Integer.parseInt(request.getParameter("server_variable_day")) ;
		int month = Integer.parseInt(request.getParameter("server_variable_month")) ;
		int year = Integer.parseInt(request.getParameter("server_variable_year")) ;

		
		int c_year, c_month, c_day;
		c_year=Integer.parseInt(request.getParameter("server_variable_c_year"));
		c_month=Integer.parseInt(request.getParameter("server_variable_c_month"));
		c_day=Integer.parseInt(request.getParameter("server_variable_c_day"));


		//DaysOfWeek
		if(month == 1 || month == 2)
		{
			month = (month==1) ? 13:14;
			year--;
		}
		
		int dayOfWeek=(day+(26*(month + 1))/10+(year%100) 
				+ (year%100)/4+(year/100)/4+5*(year/100))%7;

		String return_value=null;
		switch(dayOfWeek)
		{
			case 0: return_value="Saturday";break;
			case 1: return_value="Sunday";break;
			case 2: return_value="Monday";break;
			case 3: return_value="Tuesday";break;
			case 4: return_value="Wednesday";break;
			case 5: return_value="Thursday";break;
			case 6: return_value="Friday";
		}

		response.getWriter().append(return_value + "/" + diff(c_year, c_month, c_day, year, month, day));
	}
	public static int julianDay(int year, int month, int day) {
		  int a = (14 - month) / 12;
		  int y = year + 4800 - a;
		  int m = month + 12 * a - 3;
		  int jdn = day + (153 * m + 2)/5 + 365*y + y/4 - y/100 + y/400 - 32045;
		  return jdn;
		}
	public static int diff(int y1, int m1, int d1, int y2, int m2, int d2) {
		  return julianDay(y1, m1, d1) - julianDay(y2, m2, d2);
		}


	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
