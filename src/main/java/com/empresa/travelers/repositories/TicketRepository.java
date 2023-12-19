package com.empresa.travelers.repositories;

import com.empresa.travelers.entities.FlyEntity;
import com.empresa.travelers.entities.TicketEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface TicketRepository extends CrudRepository<TicketEntity, UUID> {
}
