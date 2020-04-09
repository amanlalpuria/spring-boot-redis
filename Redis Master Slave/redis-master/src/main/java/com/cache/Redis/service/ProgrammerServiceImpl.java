package com.cache.Redis.service;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cache.Redis.dao.ProgrammerRepository;
import com.cache.Redis.model.Programmer;

@Service
public class ProgrammerServiceImpl implements ProgrammerService {

	@Autowired
	ProgrammerRepository repository;

	/*******************************************************************************************************************
	 * String Operations
	 *******************************************************************************************************************/
	@Override
	public void setProgrammerAsString(String idKey, String programmer) {
		repository.setProgrammerAsString(idKey, programmer);

	}

	@Override
	public String getProgrammerAsString(String idKey) {
		return repository.getProgrammerAsString(idKey);
	}


	/*******************************************************************************************************************
	 * List Operations
	 *******************************************************************************************************************/
	@Override
	public void addToProgrammerList(Programmer programmer) {
		repository.addToProgrammerList(programmer);
	}

	@Override
	public List<Programmer> getProgrammerListMembers() {
		return repository.getProgrammerListMembers();
	}

	@Override
	public Long getProgrmmerListCount() {
		return repository.getProgrmmerListCount();
	}

	/*******************************************************************************************************************
	 * Set Operations
	 *******************************************************************************************************************/
	@Override
	public void addToProgrammerSet(Programmer... programmer) {
		repository.addToProgrammerSet(programmer);

	}

	@Override
	public Set<Programmer> getProgrammerSetMembers() {
		return repository.getProgrammerSetMembers();
	}

	@Override
	public boolean isSerMember(Programmer programmer) {
		return repository.isSerMember(programmer);
	}

	/*******************************************************************************************************************
	 * Flush All
	 *******************************************************************************************************************/
	
	@Override
	public void deleteString(String idKey) {
		repository.deleteString(idKey);
	}
	
	@Override
	public void deleteAllList() {
		repository.deleteAllList();
	}

	@Override
	public void deleteAllSet() {
		repository.deleteAllSet();
		
	}

}
