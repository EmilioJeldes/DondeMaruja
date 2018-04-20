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
		<a href="/" class="brand-logo"><span class="logo_font">Donde Maruja</span></a>
		<ul id="nav-mobile" class="right hide-on-med-and-down">
			<%
				if (loged == false) {
			%>

			<li><a href = "/login">Iniciar Sesion</a></li>
			<li><a href = "/signin">Registrarse</a></li>

			<%
			} else {
			%>

			<li><a href = "/logout">Cerrar Sesion</a></li>

			<%
				}
			%>



		</ul>
    </div>
</nav>