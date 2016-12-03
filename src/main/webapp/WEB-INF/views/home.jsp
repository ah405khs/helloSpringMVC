<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<!-- ${pageContext.request.contextPath} == root url -->
<p><a href ="${pageContext.request.contextPath}/offers"> show current offers</a></p>
<p><a href ="${pageContext.request.contextPath}/createoffer"> add a new offer</a></p>
	
</body>
</html>
