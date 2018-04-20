<%@page contentType="text/html" pageEncoding="UTF-8"%>

<jsp:include page="WEB-INF/partials-dynamic/head.jsp">
	<jsp:param name="title" value="Logeando" />
</jsp:include>

<jsp:include page="WEB-INF/partials-dynamic/menu-navegacion.jsp">
	<jsp:param name="item" value="inicio" />
</jsp:include>

<div class="container">
	<div class="row">
		<form class="col s10 offset-s1" action="/register" method="post">
			<div class="row">
				<div class="col s12 center">
					<h4 class="grey-text text-darken-2">Registro de Usuario</h4>
				</div>
			</div>
			<div class="row">
				<div class="input-field col s12 m6">
					<input type="text" class="validate" id="nombre" name="nombre">
					<label for="nombre">Nombre</label>
				</div>
				<div class="input-field col s12 m6">
					<input type="text" class="validate" id="apellido" name="apellido">
					<label for="apellido">Apellido</label>
				</div>
			</div>
			<div class="row">
				<div class="input-field col s12 m6">
					<input type="number" class="validate" id="rut" name="rut">
					<label for="rut">Rut sin digito verificador ni puntos intermedios</label>
				</div>
				<div class="input-field col s12 m6">
					<input type="number" class="validate" id="edad" name="edad">
					<label for="edad">Edad</label>
				</div>
			</div>
			<div class="row">
				<div class="input-field col s12 m6">
					<input type="date" class="validate" id="fechaNacimiento" name="fecha">
					<label for="fechaNacimiento">Fecha Nacimiento</label>
				</div>
				<div class="input-field col s12 m6">
					<select name="estadocivil">
						<option value="" disabled selected>Elija una opción</option>
						<option value="soltero">Soltero(a)</option>
						<option value="casado">Casado(a)</option>
						<option value="viudo">Viudo(a)</option>
					</select>
					<label>Estado Civil</label>
				</div>
			</div>
			<div class="row">
				<div class="input-field col s12 m6">
					<input type="email" class="validate" id="email" name="email">
					<label for="email">Email</label>
				</div>
				<div class="input-field col s12 m6">
					<input type="number" class="validate" id="telefono" name="telefono">
					<label for="telefono">Telefono</label>
				</div>
			</div>
			<div class="row">
				<div class="input-field col s12 m6">
					<input type="password" class="validate" id="pass1" name="pass1">
					<label for="pass1">Contraseña</label>
				</div>
				<div class="input-field col s12 m6">
					<input type="password" class="validate" id="pass2" name="pass2">
					<label for="pass2">Confirmar Contraseña</label>
				</div>
			</div>
			<div class="row center">
				<button class="btn w100 waves-effect waves-light" type="submit">Submit</button>
			</div>
		</form>
	</div>
</div>


<%@include file="WEB-INF/partials-static/footer.html" %>