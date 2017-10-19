package br.com.k19.jpa;

import java.util.logging.Level;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GeraTabelas {

	public static void main(String[] args) {
		java.util.logging.Logger.getLogger("org.hibernate").setLevel(Level.SEVERE);
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("cad_usuario");
		factory.close();
	}
}
