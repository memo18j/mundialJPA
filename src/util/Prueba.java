package util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entities.Equipo;
import model.EquipoDao;



public class Prueba {
	public static void main(String[] args) {
//		EquipoDao d = new EquipoDao();
//		Equipo eq = new Equipo();
//		eq.setNombre("pepe fc");
//	    eq.setPresidente("pepe florez");
//	
//		d.insert(eq);
//		Equipo eqq = d.find(2);
//		System.out.println("Nombre: " + eqq.getNombre());
//		d.list();
//		System.out.println(d);
//		d.delete(eqq);
		// objeto para manipular el dao
//		ContactoDao cDao = new ContactoDaoImpl();
//		
//		Contacto c = new Contacto();
//		c.setEmail("memo@gmail.com");
//		c.setNombre("jose guillermo parada");
//		
//		cDao.insert(c);
//		
//		Contacto d = cDao.selectById(15);
//		
//		System.out.println("Nombre: " + d.getNombre());
//		
//		cDao.selectAll().forEach(System.out::println);
//		
//		Usuario u = new Usuario();
//		/*
//		u.setNombre("Carlos");
//		u.setUsuario("claudiagomez");
//		u.setClave("1234");
//		u.setEmail("crangarita@gmail.com");
//		*/
//		UsuarioDao uDao = new UsuarioDao();
//		//uDao.insert(u);
//		u = uDao.find("memo");
//		System.out.println("Email: " + d.getEmail());

		/*
		EntityManagerFactory emf =
		Persistence.createEntityManagerFactory("mensajemodel");
		EntityManager em = emf.createEntityManager();
		try {
			em.getTransaction().begin();
			em.persist(c);
			em.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			em.close();
		}
*/
 /*
		// imprimir los clientes
		System.out.println("*****");
		clienteDao.obtenerClientes().forEach(System.out::println);
		*/
	}
}
