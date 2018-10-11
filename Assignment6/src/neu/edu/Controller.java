package neu.edu;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Controller
 */
@WebServlet("/Controller")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("4");
		String abc =request.getParameter("action");
		if(abc.equals("Login")){
		request.getRequestDispatcher("LoginServlet").forward(request, response);	
		}
		if(abc.equals("Dashboardinput")){
			request.getRequestDispatcher("/PersonalDetails.jsp").forward(request, response);	
			}
		
		if(abc.equals("PersonalDetails")){
			request.getRequestDispatcher("PersonalDetailsServlet").forward(request, response);	
			}
		
		if(abc.equals("EducationNext")){
			request.getRequestDispatcher("EducationServlet").forward(request, response);	
			}
		
		if(abc.equals("SkillsNext")){
			request.getRequestDispatcher("TechnicalSkillsServlet").forward(request, response);	
			}
	}

}
