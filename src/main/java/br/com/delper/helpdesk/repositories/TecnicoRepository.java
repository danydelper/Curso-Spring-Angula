package br.com.delper.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.delper.helpdesk.domain.Tecnico;

public interface TecnicoRepository extends JpaRepository<Tecnico, Integer> {
    
}
