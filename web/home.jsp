<%@page contentType="text/html" pageEncoding="UTF-8"%>

<jsp:include page="WEB-INF/partials-dynamic/head.jsp">
	<jsp:param name="title" value="Bienvenidos" />
</jsp:include>

<jsp:include page="WEB-INF/partials-dynamic/menu-navegacion.jsp">
	<jsp:param name="item" value="inicio" />
</jsp:include>

<main>
	<div class="container ">
		<h1>Home</h1>
	</div>
</main>
<jsp:include page="WEB-INF/partials-dynamic/productos.jsp"></jsp:include>


	<!-- Footer -->
<%@include file="WEB-INF/partials-static/footer.html" %>