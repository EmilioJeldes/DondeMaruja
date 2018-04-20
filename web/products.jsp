<%@page import="model.Product"%>
<%@page import="java.util.List"%>
<%
	List<Product> productos = (List<Product>) request.getSession().getAttribute("products");
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<jsp:include page="WEB-INF/partials-dynamic/head.jsp">
	<jsp:param name="title" value="Bienvenidos" />
</jsp:include>

<jsp:include page="WEB-INF/partials-dynamic/menu-navegacion.jsp">
	<jsp:param name="item" value="inicio" />
</jsp:include>

<main>
	<div class="container">
		<div class="row">
			<div class="col s12 center">
				<h3>Productos</h3>
			</div>
		</div>
		<div class="row">
			<%
				for (Product product : productos) {
			%>
			<div class="card hoverable col s6 m3">
				<div class="card-image">
					<img src="<% out.print(product.getImgUrl()); %>" alt="">
					<span class="card-title"><% out.print(product.getProductName()); %></span>
				</div>
				<div class="card-content center">
					<p><%out.print(product.getDescription()); %></p>
					<p>$<% out.print(product.getPrice()); %></p>
				</div>
			</div>
			<%
				}
			%>
		</div>
	</div>
</main>


<!-- Footer -->
<%@include file="WEB-INF/partials-static/footer.html" %>