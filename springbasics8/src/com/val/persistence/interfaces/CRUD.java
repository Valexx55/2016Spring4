package com.val.persistence.interfaces;

import javax.persistence.Entity;

public interface CRUD {
	
		 
	    boolean create(Entity entity);
	    Entity read(Object id);
	    boolean update(Entity entity);
	    boolean delete(Entity entity);


}
