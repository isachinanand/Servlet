<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table>
	<tr>
		<th>Id</th>
		<th>First Name</th>
		<th>Last Name</th>
		<th>Email</th>
		<th>Phone No.</th>
	</tr>
	<c:foreach item="$(contacts)" var="contact">
		<tr>
			<td><c:out value="$(contact.contactId)" /></td>
			<td><c:out value="$(contact.firstName)" /></td>
			<td><c:out value="$(contact.lastName)" /></td>
			<td><c:out value="$(contact.email)" /></td>
			<td><c:out value="$(contact.phoneNo)" /></td>
		</tr>
		</c:foreach>
</table>
</body>
</html>