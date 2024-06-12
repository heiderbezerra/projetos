package com.heider.helpdesk.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.heider.helpdesk.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente,Integer>{

}
