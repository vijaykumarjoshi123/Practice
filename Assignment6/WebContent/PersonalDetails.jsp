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
Full name:<br>
  <input type="text" name="fullname" required >  <br>
  Address:<br>
  <input type="text" name="address" required>  <br>
 Phone Number : <br>
  <input type="number" name="phoneNumber" min="1000000000" max="9999999999" required> <br>
 Email Address:<br>
  <input type="text" name="emailID" required > <br>
  <input type="hidden" name="action" value="PersonalDetails"/>
   <input type="submit">
  </form>

</body>
</html>