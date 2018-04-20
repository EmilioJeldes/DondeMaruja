<%
	String error = "";
	if (!request.getAttribute("error").toString().isEmpty()) {
		error = request.getAttribute("error").toString();
	}
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<jsp:include page="WEB-INF/partials-dynamic/head.jsp">
	<jsp:param name="title" value="Iniciar Sesion" />
</jsp:include>

<jsp:include page="WEB-INF/partials-dynamic/menu-navegacion.jsp">
	<jsp:param name="item" value="inicio" />
</jsp:include>

<div class="container ">
	<div class="row">
		<div class="col m10 s12 offset-m1">
			<br class="hide-on-med-only"><br class="hide-on-med-only"><br>
			<div class="card red lighten-1 white-text  <% out.print((error.length() == 0) ? "hide" : "");%> center">
				<div class="card-content">
					<p><% out.print((error.length() > 0) ? error : "");%></p>
				</div>
			</div>
			<div class="card">
				<div class="card-content">
					<br>
					<span class="card-title center">Iniciar Sesión</span>
					<br>
					<form class="container" action="/authenticate">
						<div class="row">
							<div class="input-field col s12 m6">
								<input id="email" type="email" class="<% out.print((error.length() == 0) ? "validate" : "invalid");%>" name="email">
								<label for="email">Email</label>
							</div>
							<div class="input-field col s12 m6">
								<input id="contraseña" type="password" class="<% out.print((error.length() == 0) ? "validate" : "invalid");%>"
									   name="contraseña">
								<label for="contraseña">Contraseña</label>
							</div>
							<div class="row">
								<div class="col s12 m12 center">
									<p>¿No tiene cuenta de usuario aún? <a href="/signin">Creala aquí</a></p>
								</div>
							</div>
							<div class="row center">
								<button class="btn waves-effect waves-light" type="submit">Submit</button>
							</div>
						</div>
					</form>
					<br>
				</div>
			</div>
		</div>
	</div>
</div>



<!-- Footer -->
<%@include file="WEB-INF/partials-static/footer.html" %>