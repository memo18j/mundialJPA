<%@page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Mundial WEb</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<link rel="stylesheet" href="css/stilos.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
</head>
<body>
<nav class="navbar navbar-default">
	<div class="container">
	<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
		<span class="sr-only"> Toggle navigation</span>	
		<span class="icon-bar"></span>
		<span class="icon-bar"></span>
		<span class="icon-bar"></span>
	</button>
    <div class="container  collapse navbar-collapse" id="navbar">
      <ul class="nav navbar-nav">
        <li class="active"><a href="#" data-men="equipo">General</a></li>
        <li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown">Equipo<span class="caret"></span></a>
          <ul class="dropdown-menu">
            <li><a href="#" data-menu="equipo">Registrar Equipo</a></li>
            <li><a href="#" data-menu="listequipo">Lista de Equipo</a></li>
          </ul>
        </li>
        <li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown">Jugadores <span class="caret"></span></a>
          <ul class="dropdown-menu">
            <li><a href="#" data-menu="jugador"> Registrar Jugador</a></li>
            <li><a href="#" data-menu="listjugador"> Lista de Jugadores</a></li>
          </ul>
        </li>
      </ul>
    </div>
</nav>
<div class="container" id="contenedor">
<div class="row">
<div class="col-xs-12 col-sm-2"></div>
<div class="col-xs-12 col-sm-8 " id="border">
    <h2>Registrar Equipo</h2>
    <form action="EquipoServlet" method="post">
     <div class="form-group col-xs-12 col-sm-6">
      <label for="1nombre"> Nombre equipo:</label>
      <input type="text" class="form-control" id="nombre" placeholder="nombre" name="nombre">
    </div>
     <div class="form-group col-xs-12 col-sm-6">
      <label for="2nombre">Presidente:</label>
      <input type="text" class="form-control" id="presidente" placeholder="presidente" name="presidente">
    </div>
    <div class="form-group col-xs-12 col-sm-12">
     <button type="submit" class="btn btn-success" id="button">Registrar</button>
    </div>
  </form>
</div>
<div class="col-xs-12 col-sm-2"></div>
</div>
</div>
<br>
<footer class="footer">
<div class="container">
	<p class="text-muted" style="color: #212121; text-align: center;">Programación Aplicaciones Web - 2018 © 1151102-Memo</p>
</div>
<script type="text/javascript">
    $("li a").click(function(event){
    	event.preventDefault();
    	if($(this).data('menu')!= null){
           $("#contenedor").load('views/' +$(this).data('menu')+'.jsp');
    	}
	});
    $("li a").click(function(event){
    	event.preventDefault();
    	if($(this).data('men')!= null){
           $("#contenedor").load($(this).data('men')+'.jsp');
    	}
	});

</script>
</footer>
</body>
</html>