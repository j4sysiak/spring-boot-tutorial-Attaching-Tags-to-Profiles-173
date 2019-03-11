package com.jaceksysiak.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;

import com.jaceksysiak.model.StatusUpdate;
import com.jaceksysiak.model.StatusUpdateDao;

@Service
public class StatusUpdateService {
	
	private final static int PAGESIZE = 3;
	
	@Autowired
	private StatusUpdateDao statusUpdateDao;
	
	public void save(StatusUpdate statusUpdate) {
		statusUpdateDao.save(statusUpdate);
	}
	
	//@PreAuthorize("isAuthenticated()")
	public StatusUpdate getLatest() {
		return statusUpdateDao.findFirstByOrderByAddedDesc();
	}
	
	public Page<StatusUpdate> getPage(int pageNumber) {
		PageRequest request = new PageRequest(pageNumber-1, PAGESIZE, Sort.Direction.DESC, "added");
		
		return statusUpdateDao.findAll(request);
	}

	public void delete(Long id) {
		statusUpdateDao.delete(id);
	}

	public StatusUpdate get(Long id) {
		return statusUpdateDao.findOne(id);
	}
}