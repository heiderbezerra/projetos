package com.heider.helpdesk.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.heider.helpdesk.domain.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa,Integer>{

}
