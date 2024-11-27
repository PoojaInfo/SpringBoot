<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SuccesPage</title>
</head>
<body>
<center>
	<h1>ALL INFORMAITION</h1>
</center>

<script type="text/javascript">
	function addUser() {
		alert("Add Student Data");
		document.fn.action = "register";
		document.fn.submit();
	}
	function deleteUser() {

		document.fn.action = "delete";
		document.fn.submit();
	}
	function editUser() {

		document.fn.action = "edit";
		document.fn.submit();
	}
</script>
</head>
<body>
	<form name="fn">


		<table border="1" align="center">
		<tr>
			<th>sid</th>
			<th>sname</th>
			<th>addr</th>
			<th>password</th>
			</tr>
			
				<c:forEach items="${data}" var="user">
					<tr>
					<td><input type="radio" name="sid" value="${user.sid}"></td>
					<td>${user.sid}</td>
					<td>${user.sname}</td>
					<td>${user.addr}</td>
					<td>${user.password}</td>
					
			</tr>
			</c:forEach>

		</table>

		<table border="2" align="center">
			<tr>
				<td><input type="button" value="EDIT" onclick="editUser()"></td>
				<td><input type="button" value="ADD" onclick="addUser()"></td>
				<td><input type="button" value="DELETE" onclick="deleteUser()"></td>

			</tr>
		</table>
	</form>


</body>
</html>