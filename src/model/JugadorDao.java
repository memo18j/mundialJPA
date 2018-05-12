package model;


import entities.Jugador;
import util.Conexion;
public class JugadorDao 
	extends Conexion<Jugador> 
	implements GenericDao<Jugador>{
	public JugadorDao() {
		super(Jugador.class);
	}
	}

