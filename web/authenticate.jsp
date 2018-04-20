<%@page contentType="text/html" pageEncoding="UTF-8"%>

<jsp:include page="WEB-INF/partials-dynamic/head.jsp">
	<jsp:param name="title" value="Logeando" />
</jsp:include>

<jsp:include page="WEB-INF/partials-dynamic/menu-navegacion.jsp">
	<jsp:param name="item" value="inicio" />
</jsp:include>

<main>
	<h1 class="container">Authenticated</h1>
</main>

<!-- Footer -->
<%@include file="WEB-INF/partials-static/footer.html" %>