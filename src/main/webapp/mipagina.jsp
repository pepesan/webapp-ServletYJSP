<html>
<body>
<h2>Hello World!</h2>
<a href="/Demo1">Enlace al Servlet1</a>
<a href="/Demo2">Enlace al Servlet2</a>
<% request.setAttribute("empid", "1234"); %>
<jsp:include page="/Demo3?user=pepesan" flush="true"/>
</body>
</html>
