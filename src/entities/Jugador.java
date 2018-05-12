package entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the jugador database table.
 * 
 */
@Entity
@NamedQuery(name="Jugador.findAll", query="SELECT j FROM Jugador j")
public class Jugador implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private JugadorPK id;

	private String email;

	@Temporal(TemporalType.DATE)
	private Date fechanacimiento;

	private String nombre;

	private String posicion;

	//bi-directional many-to-one association to Equipo
	@ManyToOne
	@JoinColumn(name="equipo",insertable=false, updatable=false)
	private Equipo equipoBean;

	public Jugador() {
	}
	
	public Jugador(String email, Date fechanacimiento, String nombre, String posicion) {
		super();
		this.email = email;
		this.fechanacimiento = fechanacimiento;
		this.nombre = nombre;
		this.posicion = posicion;
	}

	public JugadorPK getId() {
		return this.id;
	}

	public void setId(JugadorPK id) {
		this.id = id;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getFechanacimiento() {
		return this.fechanacimiento;
	}

	public void setFechanacimiento(Date fechanacimiento) {
		this.fechanacimiento = fechanacimiento;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPosicion() {
		return this.posicion;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}

	public Equipo getEquipoBean() {
		return this.equipoBean;
	}

	public void setEquipoBean(Equipo equipoBean) {
		this.equipoBean = equipoBean;
	}

}