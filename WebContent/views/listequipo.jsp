<div class="row">
	<div class="col-xs-12 col-sm-1"></div>
  <div class="col-xs-12 col-sm-10">
    <h2>
    listado de 
    Equipos<h2>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	<jsp:useBean id="eDao" class="model.EquipoDao" scope="request"></jsp:useBean>
    <table class="table table-striped">
    <thead>
      <tr>
        <th>Id</th>
        <th>Nombre Equipo</th>
        <th>Presidente</th>
        <th>Editar</th>
        <th>Eliminar</th>
      </tr>
    </thead>
    <tbody>
      <c:forEach items="${eDao.list()}" var="item">
   <tr>
             <td>
             <c:out value = "${item.id}"/>
             </td>
             <td>
             <c:out value = "${item.nombre}"/>
             </td>
             <td>
             <c:out value = "${item.presidente}"/>
             </td>
            <td><a class="btn btn-danger" href="EditarEquipoServlet?id=${item.id}"><span class="glyphicon glyphicon-pencil"></span></a></td>
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
