package com.heider.helpdesk.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.heider.helpdesk.domain.Chamado;

public interface ChamadoRepository extends JpaRepository<Chamado,Integer>{

}
