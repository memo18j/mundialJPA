package util;

import java.util.Date;


import java.util.List;


import entities.Equipo;
import entities.Jugador;
import entities.JugadorPK;
import model.EquipoDao;
import model.GenericDao;
import model.JugadorDao;

public class Controlador {

public void registrarEquipo(String nombre, String presidente){
		
	    Equipo u = new Equipo(nombre, presidente);
		GenericDao<Equipo> usDao= new EquipoDao();
		usDao.insert(u);
	}

	public void eliminarEquipo(int id) {
		
		GenericDao<Equipo> usDao= new EquipoDao();
		Equipo u = usDao.find(id);
		System.out.println(u);
		usDao.delete(u);
		
	}

	public List<Equipo> ListarEquipo() {
		GenericDao<Equipo> usDao= new EquipoDao();
		List<Equipo> u =  usDao.list();
		return u;
		
	}

	public void ActualizarUsuario(String nombre, String presidente) {
		Equipo u = new Equipo(nombre,presidente);
		GenericDao<Equipo> usDao= new EquipoDao();
		usDao.insert(u);
		
	}
	
    public void registrarJugador(int equipo,int numero, String email,  Date fechanacimiento, String nombre, String posicion){
		
		
		Jugador u = new Jugador(email, fechanacimiento, nombre, posicion);
	
		GenericDao<Equipo> eDao= new EquipoDao();
		Equipo e = eDao.find(equipo);
		JugadorPK pk = new JugadorPK(equipo, numero);
		u.setId(pk);
		u.setEquipoBean(e);
		GenericDao<Jugador>juDao= new JugadorDao();
		juDao.insert(u);
	}
    
    public void eliminarJugador(int equipo, int numero) {
		
		JugadorPK pk =  new JugadorPK(equipo,numero);
		
		GenericDao<Jugador> usDao= new JugadorDao();
		Jugador u = usDao.find(pk);
		usDao.delete(u);
		
	}
}
