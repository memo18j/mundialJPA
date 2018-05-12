<div class="row">
	<div class="col-xs-12 col-sm-1"></div>
  <div class="col-xs-12 col-sm-10">
    <h2>
    listado de 
    Jugadores<h2>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	<jsp:useBean id="jDao" class="model.JugadorDao" scope="request"></jsp:useBean>
    <table class="table table-striped">
    <thead>
      <tr>
        <th>Equipo</th>
	    <th>Numero</th>
	    <th>Nombre</th>
	    <th>Correo</th> 
	    <th>Posicion</th> 
      </tr>
    </thead>
    <tbody>
     <c:forEach items="${jDao.list()}" var="item">
   <tr>
             <td>
             <c:out value = "${item.id.equipo}"/>
             </td>
             <td>
             <c:out value = "${item.id.numero}"/>
             </td>
             <td>
             <c:out value = "${item.nombre}"/>
             </td>
             <td>
             <c:out value = "${item.email}"/>
             </td>
             <td>
             <c:out value = "${item.posicion}"/>
             </td>
             <td><a class="btn btn-danger" href="#" data-mm="equipo"><span class="glyphicon glyphicon-pencil"></span></a></td>
        	<td><a class="btn btn-danger" href="EliminarEquipoServlet?id=${item.id}"><span class="glyphicon glyphicon-trash"></span></a></td>
     </tr>
</c:forEach>
    </tbody>
  </table>
  <div class="form-group col-xs-12 col-sm-12">
     <button type="submit" class="btn btn-success" id="button" href="#">Nuevo Equipo</button>
  </div>
  </div>
  <div class="col-xs-12 col-sm-1"></div>
</div>
<script type="text/javascript">
   $("td a").click(function(event){
      event.preventDefault();
      if($(this).data('mm')!= null){
           $("#contenedor").load('views/'+$(this).data('mm')+'.jsp');
      }
  });
</script>