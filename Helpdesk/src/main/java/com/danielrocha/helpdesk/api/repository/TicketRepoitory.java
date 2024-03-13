package com.danielrocha.helpdesk.api.repository;

import java.awt.print.Pageable;

import org.springframework.data.domain.Page;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.danielrocha.helpdesk.api.entity.Ticket;

public interface TicketRepoitory extends MongoRepository<Ticket, String>{
	
	Page<Ticket> findByUserIdOrderByDateDesc(Pageable pages, String userId);
	
	Page<Ticket> findeByTitleIgnoreCaseContainingAndIgnoreCaseContainingAndPriorityIgnoreCaseContainingOrderByDateDesc(String title, String status, String priority,Pageable pages);
	
	Page<Ticket> findeByTitleIgnoreCaseContainingAndIgnoreCaseContainingAndPriorityIgnoreCaseContainingAndUserIdOrderByDateDesc(String title, String status, String priority,Pageable pages);
	
	Page<Ticket> findeByTitleIgnoreCaseContainingAndIgnoreCaseContainingAndPriorityIgnoreCaseContainingAndAssignedUserIdOrderByDateDesc(String title, String status, String priority,Pageable pages);
	
	Page<Ticket> findbyNumber(Integer number, Pageable pages);
	
	

}
