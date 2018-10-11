<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
table, th, td {
    border: 1px solid black;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="Controller" method ="post">
Technical Skills:<br>
   <table>
  <tr>
    <th>Skill Type</th>
    <th>Skills</th>
  </tr> 
  <tr>
  <td><input type="text" name="Skilltype1" /></td>
  <td><input type="text" name="skill1" /></td></tr>
  </table>
  <input type="hidden" name="action" value="SkillsNext"/>
   <input type="submit">
  </form>

</body>
</html>
  