<div class="row">
<div class="col-xs-12 col-sm-2"></div>
<div class="col-xs-12 col-sm-8 " id="border">
    <h2>Registrar Jugador</h2>
    <form action="JugadorServlet" method="post">
     <div class="form-group col-xs-12 col-sm-6">
      <label for="1nombre">Equipo:</label>
      <input type="text" class="form-control" id="equipo" placeholder="equipo" name="equipo">
    </div>
     <div class="form-group col-xs-12 col-sm-6">
      <label for="2nombre">Numero:</label>
      <input type="text" class="form-control" id="numero" placeholder="numero" name="numero">
    </div>
     <div class="form-group col-xs-12 col-sm-6">
      <label for="1apellido">nombre:</label>
      <input type="text" class="form-control" id="nombre" placeholder="nombre" name="nombre">
    </div>
    <div class="form-group col-xs-12 col-sm-6">
      <label for="2apellido">Email:</label>
      <input type="text" class="form-control" id="email" placeholder="email" name="email">
    </div>
    <div class="form-group col-xs-12 col-sm-6">
      <label for="documento">Posicion:</label>
      <input type="text" class="form-control" id="posicion" placeholder="posicion" name="posicion">
    </div>
    <div class="form-group col-xs-12 col-sm-6">
      <label for="telefono">Fecha:</label>
      <input type="text" class="form-control" id="fecha" placeholder="fecha" name="fecha">
    </div>
    <div class="form-group col-xs-12 col-sm-12">
     <button type="submit" class="btn btn-success" id="button">Registrar</button>
    </div>
  </form>
</div>
<div class="col-xs-12 col-sm-2"></div>
</div>