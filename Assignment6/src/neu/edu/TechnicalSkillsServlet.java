package neu.edu;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class TechnicalSkillsServlet
 */
@WebServlet("/TechnicalSkillsServlet")
public class TechnicalSkillsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TechnicalSkillsServlet() {
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
			ResumeDetailsVariable p2 =  (ResumeDetailsVariable) request.getSession().getAttribute("p") ;
		    p2.setSkillType(request.getParameter("Skilltype1"));
		    p2.setSkill(request.getParameter("skill1"));
		    
			request.getSession().setAttribute("p2", p2);
			request.getRequestDispatcher("/Output.jsp").forward(request, response);
			
		}
	}

}
