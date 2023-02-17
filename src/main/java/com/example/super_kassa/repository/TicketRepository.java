package com.example.super_kassa.repository;

import com.example.super_kassa.entities.TicketEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketRepository extends CrudRepository<TicketEntity, Integer> {
}
