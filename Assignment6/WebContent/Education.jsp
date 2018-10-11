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
Education:<br>
  Graduation College: <br>
  <input type="text" name="gradCollege" required > <br>
  Graduation College location: <br>
  <input type="text" name="gradCollegeLocation" required > <br>
  Graduation College Duration: <br>
  <input type="text" name="gradCollegeDuration" required > <br>
  Graduation College Degree: <br>
  <input type="text" name="gradCollegeDegree" required > <br>
  Graduation College Course: <br>
  <input type="text" name="gradCollegeCourse" required > <br>
  <input type="hidden" name="action" value="EducationNext"/>
   <input type="submit">
  </form>

</body>
</html>