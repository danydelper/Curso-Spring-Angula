package br.com.delper.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.delper.helpdesk.domain.Chamado;

public interface ChamadoRepository extends JpaRepository<Chamado, Integer> {
    
}
