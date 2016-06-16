package com.val.persistence.dao;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.val.persistence.interfaces.CRUD;

@Repository
public class GenericDAO implements CRUD {
	
	//Con esta anotación, le digo que me inyecte aquí el EntityManger, que es el objeto
	//donde se almacena en PersistenceContext, vamos, donde tengo la cache de objetos/
	//-registros de la base de datos
	@PersistenceContext
	EntityManager entityManager;

	@Override
	public boolean create(Entity entity) {
		// TODO Aparentemente esto escribe, Probar! si es neesario el commit o no, se supone que si es transacional, o viene de un service transaccional, se autocomitea
		entityManager.persist(entity);
		return false;
	}

	@Override
	public boolean delete(Entity emp) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Entity emp) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Entity read(Object id) {
		Entity entity = null;
		
			entityManager.find(getClass(), id);
		
		return entity;
	}

}
