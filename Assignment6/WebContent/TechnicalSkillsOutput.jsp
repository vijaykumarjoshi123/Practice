<%@page import="neu.edu.ResumeDetailsVariable"%>
<%ResumeDetailsVariable p3= (ResumeDetailsVariable) request.getSession().getAttribute("p2");%>
<h4>Skills</h4>
<% out.println(p3.getSkillType()); %><br> 
<% out.println(p3.getSkill()); %><br> 