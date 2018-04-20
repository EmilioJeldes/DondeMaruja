<%
	String item = request.getParameter("item");

	boolean loged;
	if (null == session.getAttribute("loged")) {
		loged = false;
	} else {
		loged = ((Boolean) session.getAttribute("loged")).booleanValue();
	}
%>

<nav>
    <div class="nav-wrapper container">
		<a href="/" class="brand-logo logo_font">DondeMaruja</a>
		<a href="#" data-target="mobile-demo" class="sidenav-trigger"><i class="material-icons">menu</i></a>
		<ul class="right hide-on-med-and-down">
			<%
				if (loged == false) {
			%>
			<li><a href="/">Inicio</a></li>
			<li><a href = "/login">Iniciar Sesion</a></li>
			<li><a href = "/signin">Registrarse</a></li>
				<%
				} else {
				%>
			<li><a href="/">Inicio</a></li>
			<li><a href = "/logout">Cerrar Sesion</a></li>
				<%
					}
				%>
		</ul>
		<ul class="sidenav" id="mobile-demo">
			<%
				if (loged == false) {
			%>
			<li><a href="/">Inicio</a></li>
			<li><a href = "/login">Iniciar Sesion</a></li>
			<li><a href = "/signin">Registrarse</a></li>
				<%
				} else {
				%>
			<li><a href="/">Inicio</a></li>
			<li><a href = "/logout">Cerrar Sesion</a></li>
				<%
					}
				%>
		</ul>
    </div>
</nav>

