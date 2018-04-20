<%@page contentType="text/html" pageEncoding="UTF-8"%>

<jsp:include page="WEB-INF/partials-dynamic/head.jsp">
	<jsp:param name="title" value="Bienvenidos" />
</jsp:include>

<jsp:include page="WEB-INF/partials-dynamic/menu-navegacion.jsp">
	<jsp:param name="item" value="inicio" />
</jsp:include>

<header id="showcase" class="row center">
	<div class="card z-depth-5 grey darken-4 overlay m0 overlay-wraper">
		<div class="card-content overlay-wraper">
			<h1 class="white-text text-darken-4 m0 pad-vh logo_font">Minimarket Donde Maruja</h1>
			<br>
			<p class="white-text text-darken-4 p-cabin">Revisa nuestra lista de productos y registrate para obtener cupones de descuento!</p>
			<br>
			<a href="/products" class="waves-effect waves-light btn-large">Productos</a>
			<a href="/register" class="waves-effect waves-light btn-large">Registro</a>
		</div>
	</div>
</header>



<!-- Footer -->
<%@include file="WEB-INF/partials-static/footer.html" %>