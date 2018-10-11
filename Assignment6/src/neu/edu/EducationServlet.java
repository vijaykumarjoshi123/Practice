package neu.edu;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class EducationServlet
 */
@WebServlet("/EducationServlet")
public class EducationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EducationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession(false);
		if(session==null){
			request.getRequestDispatcher("/Controller").forward(request, response);
			
		}else{
			ResumeDetailsVariable p1=(ResumeDetailsVariable)request.getSession().getAttribute("p");
			p1.setGradCollege(request.getParameter("gradCollege"));
			p1.setGradCollegeCourse(request.getParameter("gradCollegeCourse"));
			p1.setGradCollegeLocation(request.getParameter("gradCollegeLocation"));
			p1.setGradCollegeDegree(request.getParameter("gradCollegeDegree"));
			p1.setGradCollegeDuration(request.getParameter("gradCollegeDuration"));
			request.getRequestDispatcher("/TechnicalSkills.jsp").forward(request, response);
			request.getSession().setAttribute("p1", p1);
		}
	}

}
