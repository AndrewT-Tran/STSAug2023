package com.tran.dojosNninjas.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tran.dojosNninjas.models.Dojo;

@Repository
public interface DojoRepository extends CrudRepository<Dojo, Long>{
	List<Dojo> findAll();
	void deleteById(Long id);
}