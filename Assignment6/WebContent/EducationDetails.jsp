<%@page import="neu.edu.ResumeDetailsVariable"%>
<%ResumeDetailsVariable p2= (ResumeDetailsVariable) request.getSession().getAttribute("p1");%>
<h4>Education</h4>
Graduate College:<br/>
<p><% out.println(p2.getGradCollege()); %></p><br/>
Relevant Courses:<br>
<p><% out.println(p2.getGradCollegeCourse()); %></p><br/>
Graduate College Location:<br/>
<p><% out.println(p2.getGradCollegeLocation()); %></p></textArea><br/>
Graduate College Degree:<br/>
<p><% out.println(p2.getGradCollegeDegree()); %></p><br/>
Graduate College Duration:<br/>
<p><% out.println(p2.getGradCollegeDuration()); %></p><br/>