package com.focus.weborder.services.invoicesall;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InvoicesAllService {

	@Autowired
	private InvoicesAllRepository invoicesAllRepository;
	
	public List<InvoicesAll> getAll(){
		return (List<InvoicesAll>) invoicesAllRepository.findAll();
	}

}
