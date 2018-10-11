<%@page import="neu.edu.ResumeDetailsVariable"%>
<%ResumeDetailsVariable p1= (ResumeDetailsVariable) session.getAttribute("p");%>
<h4>Personal Details</h4>
Full Name:<br>
<p><% out.println(p1.getFullname()); %></p><br>
Email Address:<br>
<p><% out.println(p1.getEmail()); %></p><br>
Phone Number:<br>
<p><% out.println(p1.getPhoneNumber()); %></p>
Describe about you:<br>
<p><% out.println(p1.getAddress()); %></p>  </textArea><br>