package com.echotech.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.echotech.model.User;
/**
 * por herencia le pasamos el crudRepository
 * para poder generar el Crud por defecto del crud Repository
 *
 */
@Repository
public interface InterfaceUser extends CrudRepository<User,Integer>{
	
}
